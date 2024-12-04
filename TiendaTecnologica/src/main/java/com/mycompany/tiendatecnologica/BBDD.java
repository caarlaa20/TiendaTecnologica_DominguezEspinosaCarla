package com.mycompany.tiendatecnologica;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class BBDD {

    private static final String URL = "jdbc:mysql://localhost:3306/CiberZone";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    //metodo para conectar con la base de datos
   public static Connection getConnection() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    } catch (ClassNotFoundException e) {
        System.out.println("Error al cargar el driver JDBC: " + e.getMessage());
    } catch (SQLException e) {
        System.out.println("Error al conectar con la base de datos: " + e.getMessage());
    }
    return null;
}

    // Método para ejecutar inserciones
    private static void ejecutarInsercciones(String query, Object... parameters) {
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            for (int i = 0; i < parameters.length; i++) {
                preparedStatement.setObject(i + 1, parameters[i]);
            }

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la inserción: " + e.getMessage());
        }
    }

    //metodo para insertar tienda
    public static void insertTienda(String nombreTienda) {
        String query = "INSERT INTO tienda (nombre) VALUES (?)";
        ejecutarInsercciones(query, nombreTienda);
    }

    //metodo para insertar categoría
    public static void insertCategoria(int idCategoria, String categoriaNombre) {
        String query = "INSERT INTO categorias (id_categoria, nombre) VALUES (?, ?)";
       ejecutarInsercciones(query, idCategoria, categoriaNombre);
    }

    //metodo para insertar producto
    public static void insertProducto(int idProducto, int idCategoria, String productoNombre, double precio, int inventario) {
        String query = "INSERT INTO productos (id_producto, id_categoria, nombre, precio, inventario) VALUES (?, ?, ?, ?, ?)";
        ejecutarInsercciones(query, idProducto, idCategoria, productoNombre, precio, inventario);
    }

    //metodo para insertar usuario
    public static void insertUsuario(int idUsuario, String nombre, String email) {
        String query = "INSERT INTO usuarios (id_usuario, nombre, email) VALUES (?, ?, ?)";
        ejecutarInsercciones(query, idUsuario, nombre, email);
    }

    //metodo para insertar direccion
    public static void insertDireccion(int idDireccion, int idUsuario, String calle, int numero, String ciudad, String pais) {
        String query = "INSERT INTO direcciones (id_direccion, id_usuario, calle, numero, ciudad, pais) VALUES (?, ?, ?, ?, ?, ?)";
        ejecutarInsercciones(query, idDireccion, idUsuario, calle, numero, ciudad, pais);
    }

    //metodo para insertar historial
    public static void insertHistorialCompra(int idUsuario, int idProducto, int cantidad, String fecha) {
        String query = "INSERT INTO historial_compras (id_usuario, id_producto, cantidad, fecha) VALUES (?, ?, ?, ?)";
        ejecutarInsercciones(query, idUsuario, idProducto, cantidad, fecha);
    }

    // Método para leer el JSON
    public static void readJSON(String filePath) {
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader(filePath)) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            JSONObject tienda = (JSONObject) jsonObject.get("tienda");
            String nombreTienda = (String) tienda.get("nombre");
            insertTienda(nombreTienda);

            JSONArray categorias = (JSONArray) tienda.get("categorias");
            int categoriaId = 1;

            for (Object categoriaObj : categorias) {
                JSONObject categoria = (JSONObject) categoriaObj;
                String categoriaNombre = (String) categoria.get("nombre");
                insertCategoria(categoriaId++, categoriaNombre);

                JSONArray productos = (JSONArray) categoria.get("productos");
                for (Object productoObj : productos) {
                    JSONObject producto = (JSONObject) productoObj;
                    int idp = ((Long) producto.get("id")).intValue();
                    String productoNombre = (String) producto.get("nombre");
                    double precio = (double) producto.get("precio");
                    int inventario = ((Long) producto.get("inventario")).intValue();
                    insertProducto(idp, categoriaId - 1, productoNombre, precio, inventario);
                }
            }

            JSONArray usuarios = (JSONArray) tienda.get("usuarios");
            for (Object usuarioObj : usuarios) {
                JSONObject usuario = (JSONObject) usuarioObj;
                int idUsuario = ((Long) usuario.get("id")).intValue();
                String nombreUsuario = (String) usuario.get("nombre");
                String email = (String) usuario.get("email");
                insertUsuario(idUsuario, nombreUsuario, email);

                JSONObject direccion = (JSONObject) usuario.get("direccion");
                String calle = (String) direccion.get("calle");
                int numero = ((Long) direccion.get("numero")).intValue();
                String ciudad = (String) direccion.get("ciudad");
                String pais = (String) direccion.get("pais");
                insertDireccion(idUsuario, idUsuario, calle, numero, ciudad, pais);

                JSONArray historialCompras = (JSONArray) usuario.get("historialCompras");
                for (Object compraObj : historialCompras) {
                    JSONObject compra = (JSONObject) compraObj;
                    int productoId = ((Long) compra.get("productoId")).intValue();
                    int cantidad = ((Long) compra.get("cantidad")).intValue();
                    String fecha = (String) compra.get("fecha");
                    insertHistorialCompra(idUsuario, productoId, cantidad, fecha);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo JSON: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al procesar el JSON: " + e.getMessage());
        }
    }

    //metodo para que no se guarden mas datos
    static boolean hayDatos() {
        Connection connection = getConnection();
        String sql = "SELECT * FROM historial_compras";
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(sql);
            return rs.next();
        } catch (SQLException e) {
            System.out.println("Error al verificar el producto: " + e.getMessage());
            return false;
        }
    }
}
