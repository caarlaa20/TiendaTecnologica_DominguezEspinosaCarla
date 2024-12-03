/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tiendatecnologica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;

public class Comprar extends javax.swing.JFrame {

    public Comprar() {
        init();
    }

    public void init() {

        setUndecorated(true);
        setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Compra = new javax.swing.JLabel();
        LblUsuario = new javax.swing.JTextField();
        LblCantidad = new javax.swing.JTextField();
        LblProducto = new javax.swing.JTextField();
        Usuario = new javax.swing.JLabel();
        Producto = new javax.swing.JLabel();
        Cantidad = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Volver = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        Cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        Compra.setBackground(new java.awt.Color(255, 255, 255));
        Compra.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        Compra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Compra.setText("Finalizar Compra");
        Compra.setOpaque(true);
        Compra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompraMouseClicked(evt);
            }
        });

        LblUsuario.setToolTipText("");
        LblUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LblUsuarioActionPerformed(evt);
            }
        });

        LblCantidad.setToolTipText("");
        LblCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LblCantidadActionPerformed(evt);
            }
        });

        LblProducto.setToolTipText("");
        LblProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LblProductoActionPerformed(evt);
            }
        });

        Usuario.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setText("ID Usuario");
        Usuario.setToolTipText("");

        Producto.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        Producto.setForeground(new java.awt.Color(255, 255, 255));
        Producto.setText("ID Productos");

        Cantidad.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        Cantidad.setForeground(new java.awt.Color(255, 255, 255));
        Cantidad.setText("Cantidad");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(633, 126));

        Volver.setBackground(new java.awt.Color(0, 204, 204));
        Volver.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        Volver.setForeground(new java.awt.Color(255, 255, 255));
        Volver.setText("<");
        Volver.setFocusable(false);
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.PNG"))); // NOI18N

        Cerrar.setBackground(new java.awt.Color(0, 204, 204));
        Cerrar.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        Cerrar.setText("X");
        Cerrar.setFocusable(false);
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Volver)
                .addGap(448, 448, 448)
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 488, Short.MAX_VALUE)
                .addComponent(Cerrar)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Logo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(Volver))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(Cerrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(491, 491, 491)
                        .addComponent(Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Producto)
                            .addComponent(Usuario)
                            .addComponent(Cantidad))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LblCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                            .addComponent(LblProducto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblUsuario, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuario))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Producto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cantidad))
                .addGap(87, 87, 87)
                .addComponent(Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metemos la información del usuario
    private void LblUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LblUsuarioActionPerformed
        JTextField campoBusqueda = this.LblUsuario;
        seleccionarUsuarioPorId(campoBusqueda);
    }//GEN-LAST:event_LblUsuarioActionPerformed

    //Metemos la información del producto
    private void LblProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LblProductoActionPerformed
        JTextField campoBusqueda = this.LblProducto;
        seleccionarIdProductoPorId(campoBusqueda);
    }//GEN-LAST:event_LblProductoActionPerformed

    private void LblCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LblCantidadActionPerformed

    }//GEN-LAST:event_LblCantidadActionPerformed

    //Boton para finalizar la compra
    private void CompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompraMouseClicked
        JTextField campoIdProducto = this.LblProducto;
        JTextField campoCantidad = this.LblCantidad;
        JTextField campoIdUsuario = this.LblUsuario;
        finalizarCompra(campoIdProducto, campoCantidad, campoIdUsuario);
        LblUsuario.setText("");
        LblProducto.setText("");
        LblCantidad.setText("");
    }//GEN-LAST:event_CompraMouseClicked

    //Boton para cerrar el programa
    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CerrarActionPerformed

    //Boton para volver
    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed

        Interfaz interfaz = new Interfaz();
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comprar().setVisible(true);
            }
        });
    }

    //Finaliza la compra y me la inserta en la base de datos
    private void finalizarCompra(JTextField campoIdProducto, JTextField campoCantidad, JTextField campoIdUsuario) {

        int idProducto = Integer.parseInt(campoIdProducto.getText().trim());
        int cantidad = Integer.parseInt(campoCantidad.getText().trim());
        int idUsuario = Integer.parseInt(campoIdUsuario.getText().trim());

        // Verificar si el producto existe
        if (!verificarUsuarioExiste(idUsuario)) {
            System.out.println("Error: El usuario con ID " + idUsuario + " no existe.");
            return;
        }
        // Verificar si el producto existe
        if (!verificarProductoExiste(idProducto)) {
            System.out.println("Error: El producto con ID " + idProducto + " no existe.");
            return;
        }

        // Insertar el historial de compra
        try {
            // Obtener la fecha actual
            java.sql.Date fecha = new java.sql.Date(System.currentTimeMillis());

            // Insertar la compra en la base de datos
            insertHistorialCompra(idUsuario, idProducto, cantidad, fecha.toString());

            System.out.println("Compra realizada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al guardar la compra: " + e.getMessage());
        }
    }

    //Inserta la compra en el historial de compra
    private void insertHistorialCompra(int idUsuario, int idProducto, int cantidad, String fecha) throws SQLException {
        Connection connection = BBDD.getConnection();
        String query = "INSERT INTO historial_compras (id_usuario, id_producto, cantidad, fecha) VALUES (?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, idUsuario);
            preparedStatement.setInt(2, idProducto);
            preparedStatement.setInt(3, cantidad);
            preparedStatement.setString(4, fecha);
            preparedStatement.executeUpdate();
        }
    }

    //Verifica si el producto existe para hacer la compra
    private boolean verificarProductoExiste(int idProducto) {
        Connection connection = BBDD.getConnection();
        String query = "SELECT id_producto FROM productos WHERE id_producto = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, idProducto);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            System.out.println("Error al verificar el producto: " + e.getMessage());
            return false;
        }
    }

    //Selecciona el id producto para hacer la compra
    private void seleccionarIdProductoPorId(JTextField campoBusqueda) {
        Connection connection = BBDD.getConnection();
        if (connection == null) {
            System.out.println("Error: No se pudo establecer conexión con la base de datos.");
            return;
        }

        String criterio = campoBusqueda.getText().trim();
        if (criterio.isEmpty()) {
            System.out.println("Por favor, ingresa un ID de producto.");
            return;
        }

        // Comprobar si el texto ingresado es un número entero
        int idProducto;
        try {
            idProducto = Integer.parseInt(criterio);
        } catch (NumberFormatException e) {
            System.out.println("El ID debe ser un número entero.");
            return;
        }

        // Consulta SQL para verificar si el ID de producto existe
        String query = "SELECT id_producto FROM productos WHERE id_producto = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, idProducto);  // Usamos el ID para la búsqueda
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println("Producto con ID " + idProducto + " encontrado.");
            } else {
                System.out.println("Error: Producto con ID " + idProducto + " no encontrado.");
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener el producto: " + e.getMessage());
            e.printStackTrace();
        }
    }

    //Selcciona la cantidad para hacer la compra
    private void seleccionarCantidad(JTextField campoCantidad, int idProducto) {
        Connection connection = BBDD.getConnection();
        if (connection == null) {
            System.out.println("Error: No se pudo establecer conexión con la base de datos.");
            return;
        }

        String cantidadStr = campoCantidad.getText().trim();
        if (cantidadStr.isEmpty()) {
            System.out.println("Por favor, ingresa una cantidad.");
            return;
        }

        // Comprobar si la cantidad ingresada es un número entero positivo
        int cantidad;
        try {
            cantidad = Integer.parseInt(cantidadStr);
            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser un número positivo.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("La cantidad debe ser un número entero.");
            return;
        }

        // Consulta SQL para verificar si el producto existe y obtener su inventario
        String query = "SELECT inventario FROM productos WHERE id_producto = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, idProducto);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Verificar si el producto existe en la base de datos
            if (resultSet.next()) {
                int inventario = resultSet.getInt("inventario");
                System.out.println("Producto con ID " + idProducto + " encontrado. Inventario disponible: " + inventario);

                // Verificar si hay suficiente inventario
                if (cantidad > inventario) {
                    System.out.println("Error: No hay suficiente inventario para esta cantidad. Inventario disponible: " + inventario);
                    return;
                } else {
                    System.out.println("Cantidad seleccionada: " + cantidad);

                }
            } else {
                System.out.println("Error: Producto con ID " + idProducto + " no encontrado.");
            }

        } catch (SQLException e) {
            System.out.println("Error al verificar el inventario: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Verifica si el usuario existe
    private boolean verificarUsuarioExiste(int idUsuario) {
        Connection connection = BBDD.getConnection();
        //Sentencia Sql que utilizamos
        String query = "SELECT id_usuario FROM usuarios WHERE id_usuario = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, idUsuario);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            System.out.println("Error al verificar el usuario: " + e.getMessage());
            return false;
        }
    }

// Selecciona el usuario por ID para realizar operaciones relacionadas
    private void seleccionarUsuarioPorId(JTextField campoBusqueda) {
        Connection connection = BBDD.getConnection();
        if (connection == null) {
            System.out.println("Error: No se pudo establecer conexión con la base de datos.");
            return;
        }

        String criterio = campoBusqueda.getText().trim();
        if (criterio.isEmpty()) {
            System.out.println("Por favor, ingresa un ID de usuario.");
            return;
        }

        // Comprobar si el texto ingresado es un número entero
        int idUsuario;
        try {
            idUsuario = Integer.parseInt(criterio);
        } catch (NumberFormatException e) {
            System.out.println("El ID debe ser un número entero.");
            return;
        }

        // Consulta SQL para verificar si el ID de usuario existe
        String query = "SELECT id_usuario FROM usuarios WHERE id_usuario = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, idUsuario);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println("Usuario con ID " + idUsuario + " encontrado.");
            } else {
                System.out.println("Error: Usuario con ID " + idUsuario + " no encontrado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener el usuario: " + e.getMessage());
            e.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cantidad;
    private javax.swing.JButton Cerrar;
    private javax.swing.JLabel Compra;
    private javax.swing.JTextField LblCantidad;
    private javax.swing.JTextField LblProducto;
    private javax.swing.JTextField LblUsuario;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Producto;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton Volver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
