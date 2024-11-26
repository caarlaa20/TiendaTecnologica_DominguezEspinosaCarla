/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendatecnologica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alumno
 */
public class BBDD {

    // Parámetros de conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/CiberZone";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    private static Connection connection = null;

    // Método para obtener la conexión
    public static Connection getConnection() {
        if (connection == null) {
            try {
                // Cargar el driver JDBC
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Establecer la conexión
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

    // Método para cerrar la conexión
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
}


