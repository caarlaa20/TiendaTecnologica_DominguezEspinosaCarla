package com.mycompany.tiendatecnologica;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class BBDD {

    private static final String URL = "jdbc:mysql://localhost:3306/CiberZone";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexión exitosa a la base de datos.");
            } catch (ClassNotFoundException e) {
                System.out.println("Error al cargar el driver JDBC: " + e.getMessage());
            } catch (SQLException e) {
                System.out.println("Error al conectar con la base de datos: " + e.getMessage());
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    public static void insertTienda(String nombreTienda) {
        Connection connection = getConnection();
        String insertTiendaSQL = "INSERT INTO tienda (nombre) VALUES (?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertTiendaSQL)) {
            preparedStatement.setString(1, nombreTienda);
            preparedStatement.executeUpdate();
            System.out.println("Tienda insertada: " + nombreTienda);
        } catch (SQLException e) {
            System.out.println("Error al insertar tienda: " + e.getMessage());
        }
    }

    public static void insertCategoria(int idCategoria, String categoriaNombre) {
        Connection connection = getConnection();
        String insertCategoriaSQL = "INSERT INTO categorias (id_categoria, nombre) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertCategoriaSQL)) {
            preparedStatement.setInt(1, idCategoria);
            preparedStatement.setString(2, categoriaNombre);
            preparedStatement.executeUpdate();
            System.out.println("Categoría insertada: " + categoriaNombre);
        } catch (SQLException e) {
            System.out.println("Error al insertar categoría: " + e.getMessage());
        }
    }

    public static void insertProducto(int idProducto, int idCategoria, String productoNombre, double precio) {
        Connection connection = getConnection();
        String insertProductoSQL = "INSERT INTO productos (id_producto, id_categoria, nombre, precio) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertProductoSQL)) {
            preparedStatement.setInt(1, idProducto);
            preparedStatement.setInt(2, idCategoria);
            preparedStatement.setString(3, productoNombre);
            preparedStatement.setDouble(4, precio);
            preparedStatement.executeUpdate();
            System.out.println("Producto insertado: " + productoNombre + ", Precio: " + precio);
        } catch (SQLException e) {
            System.out.println("Error al insertar producto: " + e.getMessage());
        }
    }

    public static void readJSON(String filePath) {
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader(filePath)) {
            // Parsear el archivo JSON
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            JSONObject tienda = (JSONObject) jsonObject.get("tienda");
            String nombreTienda = (String) tienda.get("nombre");
            System.out.println("Nombre de la tienda: " + nombreTienda);

            // Insertar tienda en la base de datos
            insertTienda(nombreTienda);

            JSONArray categorias = (JSONArray) tienda.get("categorias");
            int categoriaId = 1; // Asumiendo que el ID de la categoría empieza desde 1

            for (Object categoriaObj : categorias) {
                JSONObject categoria = (JSONObject) categoriaObj;
                String categoriaNombre = (String) categoria.get("nombre");
                System.out.println("Categoría: " + categoriaNombre);

                // Insertar categoría en la base de datos
                insertCategoria(categoriaId++, categoriaNombre);

                JSONArray productos = (JSONArray) categoria.get("productos");
                int productoId = 1; // Asumiendo que el ID de producto empieza desde 1
                for (Object productoObj : productos) {
                    JSONObject producto = (JSONObject) productoObj;
                    String productoNombre = (String) producto.get("nombre");
                    double precio = (double) producto.get("precio");
                    System.out.println("Producto: " + productoNombre + ", Precio: " + precio);

                    // Insertar producto en la base de datos
                    insertProducto(productoId++, categoriaId - 1, productoNombre, precio);
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo JSON: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al procesar el JSON: " + e.getMessage());
        } finally {
            closeConnection();
        }
    }

    public static void main(String[] args) {
        // Cambia la ruta al archivo JSON si es necesario
        //readJSON(getClass().getResource("/TIENDA.json"));
    }
}
