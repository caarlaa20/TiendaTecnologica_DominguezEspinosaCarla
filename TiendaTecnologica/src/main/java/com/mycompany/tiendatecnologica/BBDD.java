package com.mycompany.tiendatecnologica;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class BBDD {

    private static final String URL = "jdbc:mysql://localhost:3306/CiberZone";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static Connection connection = null;

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

    public static void insertProducto(int idProducto, int idCategoria, String productoNombre, double precio, int inventario) {
        Connection connection = getConnection();
        String insertProductoSQL = "INSERT INTO productos (id_producto, id_categoria, nombre, precio, inventario) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertProductoSQL)) {
            preparedStatement.setInt(1, idProducto);
            preparedStatement.setInt(2, idCategoria);
            preparedStatement.setString(3, productoNombre);
            preparedStatement.setDouble(4, precio);
            preparedStatement.setDouble(5, inventario);
            preparedStatement.executeUpdate();
            System.out.println("Producto insertado: " + productoNombre + ", Precio: " + precio);
        } catch (SQLException e) {
            System.out.println("Error al insertar producto: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void insertUsuario(int idUsuario, String nombre, String email) {
        Connection connection = getConnection();
        String insertUsuarioSQL = "INSERT INTO usuarios (id_usuario, nombre, email) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertUsuarioSQL)) {
            preparedStatement.setInt(1, idUsuario);
            preparedStatement.setString(2, nombre);
            preparedStatement.setString(3, email);
            preparedStatement.executeUpdate();
            System.out.println("Usuario insertado: " + nombre);
        } catch (SQLException e) {
            System.out.println("Error al insertar usuario: " + e.getMessage());
        }
    }

    public static void insertDireccion(int idDireccion, int idUsuario, String calle, int numero, String ciudad, String pais) {
        Connection connection = getConnection();
        String insertDireccionSQL = "INSERT INTO direcciones (id_direccion, id_usuario, calle, numero, ciudad, pais) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertDireccionSQL)) {
            preparedStatement.setInt(1, idDireccion);
            preparedStatement.setInt(2, idUsuario);
            preparedStatement.setString(3, calle);
            preparedStatement.setInt(4, numero);
            preparedStatement.setString(5, ciudad);
            preparedStatement.setString(6, pais);
            preparedStatement.executeUpdate();
            System.out.println("Dirección insertada: " + calle + ", " + numero);
        } catch (SQLException e) {
            System.out.println("Error al insertar dirección: " + e.getMessage());
        }
    }

    public static boolean verificarProductoExiste(int idProducto) {
    Connection connection = getConnection();
    String checkProductoSQL = "SELECT id_producto FROM productos WHERE id_producto = ?";
    try (PreparedStatement preparedStatement = connection.prepareStatement(checkProductoSQL)) {
        preparedStatement.setInt(1, idProducto);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet.next(); // Retorna true si existe un producto con el id dado
    } catch (SQLException e) {
        System.out.println("Error al verificar el producto: " + e.getMessage());
        return false;
    }
}

    public static void insertHistorialCompra(int idUsuario, int idProducto, int cantidad, String fecha) {
    if (!verificarProductoExiste(idProducto)) {
        System.out.println("Error: El producto con id " + idProducto + " no existe en la base de datos.");
        return; // No insertamos si el producto no existe
    }

    Connection connection = getConnection();
    String insertHistorialSQL = "INSERT INTO historial_compras (id_usuario, id_producto, cantidad, fecha) VALUES (?, ?, ?, ?)";
    try (PreparedStatement preparedStatement = connection.prepareStatement(insertHistorialSQL)) {
        preparedStatement.setInt(1, idUsuario);
        preparedStatement.setInt(2, idProducto);
        preparedStatement.setInt(3, cantidad);
        preparedStatement.setString(4, fecha);
        preparedStatement.executeUpdate();
        System.out.println("Compra insertada: Usuario " + idUsuario + ", Producto " + idProducto);
    } catch (SQLException e) {
        System.out.println("Error al insertar historial de compras: " + e.getMessage());
        e.printStackTrace();
    }
}


    public static void readJSON(String filePath) {
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader(filePath)) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            JSONObject tienda = (JSONObject) jsonObject.get("tienda");
            String nombreTienda = (String) tienda.get("nombre");
            System.out.println("Nombre de la tienda: " + nombreTienda);

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
                int idDireccion = idUsuario; 
                String calle = (String) direccion.get("calle");
                int numero = ((Long) direccion.get("numero")).intValue();
                String ciudad = (String) direccion.get("ciudad");
                String pais = (String) direccion.get("pais");
                insertDireccion(idDireccion, idUsuario, calle, numero, ciudad, pais);

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
        } finally {
            closeConnection();
        }
    }


    static boolean hayDatos() {
        Connection connection = getConnection();
        String sql="SELECT * FROM historial_compras";
        try (Statement st=connection.createStatement()) {
            ResultSet rs = st.executeQuery(sql);
            return rs.next();
        } catch (SQLException e) {
            System.out.println("Error al verificar el producto: " + e.getMessage());
            return false;
        }
    }
}