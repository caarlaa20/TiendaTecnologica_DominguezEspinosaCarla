/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tiendatecnologica;

import static com.mycompany.tiendatecnologica.BBDD.getConnection;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        init();
    }

    public void init() {

        if (!BBDD.hayDatos()) {
            BBDD.readJSON("src/main/Resources/TIENDA.json");
        }
        setUndecorated(true);
        setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        categoriasProductos = new javax.swing.JLabel();
        usuarios1 = new javax.swing.JLabel();
        HistorialCompras = new javax.swing.JLabel();
        Productos = new javax.swing.JLabel();
        HacerCompra1 = new javax.swing.JLabel();
        Limpiar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        informacion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.PNG"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(412, 412, 412)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(37, 37, 37))))
        );

        categoriasProductos.setBackground(new java.awt.Color(255, 255, 255));
        categoriasProductos.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        categoriasProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoriasProductos.setText("Categorias de Productos");
        categoriasProductos.setOpaque(true);
        categoriasProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoriasProductosMouseClicked(evt);
            }
        });

        usuarios1.setBackground(new java.awt.Color(255, 255, 255));
        usuarios1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        usuarios1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuarios1.setText("Usuarios");
        usuarios1.setOpaque(true);
        usuarios1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarios1MouseClicked(evt);
            }
        });

        HistorialCompras.setBackground(new java.awt.Color(255, 255, 255));
        HistorialCompras.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        HistorialCompras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HistorialCompras.setText("Historial de Compras");
        HistorialCompras.setOpaque(true);
        HistorialCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HistorialComprasMouseClicked(evt);
            }
        });

        Productos.setBackground(new java.awt.Color(255, 255, 255));
        Productos.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        Productos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Productos.setText("Productos");
        Productos.setOpaque(true);
        Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductosMouseClicked(evt);
            }
        });

        HacerCompra1.setBackground(new java.awt.Color(255, 255, 255));
        HacerCompra1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        HacerCompra1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HacerCompra1.setText("Hacer Compra");
        HacerCompra1.setOpaque(true);
        HacerCompra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HacerCompra1MouseClicked(evt);
            }
        });

        Limpiar.setBackground(new java.awt.Color(255, 255, 255));
        Limpiar.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        Limpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Limpiar.setText("Limpiar");
        Limpiar.setOpaque(true);
        Limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LimpiarMouseClicked(evt);
            }
        });

        informacion.setEditable(false);
        informacion.setBackground(new java.awt.Color(255, 255, 255));
        informacion.setColumns(20);
        informacion.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        informacion.setRows(5);
        jScrollPane1.setViewportView(informacion);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usuarios1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HistorialCompras, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(categoriasProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Productos, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(HacerCompra1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(341, 341, 341))))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(usuarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(categoriasProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(HistorialCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(HacerCompra1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Llamamos a nuestro metodo cargar categorias
    private void categoriasProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriasProductosMouseClicked
        cargarCategorias();
    }//GEN-LAST:event_categoriasProductosMouseClicked
    //Llamamos a nuestro metodo cargar usuarios
    private void usuarios1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarios1MouseClicked
        cargarUsuarios();
    }//GEN-LAST:event_usuarios1MouseClicked
    //Llamamos a nuestro metodo cargar historial compras
    private void HistorialComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialComprasMouseClicked
        cargarHistorialCompras();
    }//GEN-LAST:event_HistorialComprasMouseClicked
    //Llamamos a nuestro metodo cargar productos
    private void ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosMouseClicked
        cargarProductos();
    }//GEN-LAST:event_ProductosMouseClicked
    //Llamamos a nuestro metodo hacer compra
    private void HacerCompra1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HacerCompra1MouseClicked
        Comprar comprar = new Comprar();
        comprar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HacerCompra1MouseClicked
    //Limpiamos nuestro text area
    private void LimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiarMouseClicked
        informacion.setText("");
    }//GEN-LAST:event_LimpiarMouseClicked
    //Cerramos el aplicativo
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HacerCompra1;
    private javax.swing.JLabel HistorialCompras;
    private javax.swing.JLabel Limpiar;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel Productos;
    private javax.swing.JLabel categoriasProductos;
    private javax.swing.JTextArea informacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel usuarios1;
    // End of variables declaration//GEN-END:variables

    //metodo para cargar usuarios
    private void cargarUsuarios() {
        try (Connection connection = BBDD.getConnection()) {
            if (connection == null) {
                informacion.setText("Error: No se pudo establecer conexión con la base de datos.");
                return;
            }

            //Sentencia que utilizamos para ver los usuarios
            String query = "SELECT * FROM usuarios";
            StringBuilder usuariosInfo = new StringBuilder();

            try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {

                if (!resultSet.isBeforeFirst()) {
                    informacion.setText("No hay usuarios registrados en la base de datos.");
                    return;
                }

                // Cabecera de la tabla
                usuariosInfo.append(String.format("     %-10s \t %-20s \t %-30s\n", "ID ", "Nombre", "Email"));
                usuariosInfo.append("-----------------------------------------------------------------------------------------------------\n");

                while (resultSet.next()) {
                    int idUsuario = resultSet.getInt("id_usuario");
                    String nombre = resultSet.getString("nombre");
                    String email = resultSet.getString("email");

                    // Información del usuario
                    usuariosInfo.append(String.format("     %-10d \t %-20s \t %-30s\n", idUsuario, nombre, email));
                }

                informacion.setText(usuariosInfo.toString());

            } catch (SQLException e) {
                informacion.setText("Error al obtener los usuarios: " + e.getMessage());
                e.printStackTrace();
            }
        } catch (SQLException e) {
            informacion.setText("Error al conectar con la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
    }

    //metodo para cargar usuarios
    private void cargarCategorias() {
        Connection connection = BBDD.getConnection();
        if (connection == null) {
            informacion.setText("Error: No se pudo establecer conexión con la base de datos.");
            return;
        }

        //Sentencia que utilizamos para ver las categorias
        String query = "SELECT * FROM categorias";
        StringBuilder categoriasInfo = new StringBuilder();

        try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {

            if (!resultSet.isBeforeFirst()) { // Verificar si hay datos
                informacion.setText("No hay categorías registradas en la base de datos.");
                return;
            }

            // Cabecera de la tabla
            categoriasInfo.append(String.format("     %-10s \t %-20s\n", "ID ", "Nombre"));
            categoriasInfo.append("--------------------------------------------------------------------------------\n");

            while (resultSet.next()) {
                int idCategoria = resultSet.getInt("id_categoria");
                String nombreCategoria = resultSet.getString("nombre");

                // Información de la categoría
                categoriasInfo.append(String.format("     %-10d \t %-20s\n", idCategoria, nombreCategoria));
            }

            informacion.setText(categoriasInfo.toString());

        } catch (SQLException e) {
            informacion.setText("Error al obtener las categorías: " + e.getMessage());
            e.printStackTrace();
        }
    }

    //metodo para cargar productos
    private void cargarProductos() {
        Connection connection = BBDD.getConnection();
        if (connection == null) {
            informacion.setText("Error: No se pudo establecer conexión con la base de datos.");
            return;
        }

        //Sentencia para cargar productos
        String query = "SELECT p.id_producto, p.nombre, p.precio, p.inventario, c.nombre AS categoria "
                + "FROM productos p "
                + "JOIN categorias c ON p.id_categoria = c.id_categoria";
        StringBuilder productosInfo = new StringBuilder();

        try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {

            if (!resultSet.isBeforeFirst()) {
                informacion.setText("No hay productos registrados en la base de datos.");
                return;
            }

            // Cabecera de la tabla
            productosInfo.append(String.format("     %-10s \t %-20s \t %-10s \t %-15s \t %-20s\n", "ID ", "Nombre", "Precio", "Inventario", "Categoria"));
            productosInfo.append("----------------------------------------------------------------------------------------------------------\n");

            while (resultSet.next()) {
                int idProducto = resultSet.getInt("id_producto");
                String nombreProducto = resultSet.getString("nombre");
                double precio = resultSet.getDouble("precio");
                int inventario = resultSet.getInt("inventario");
                String categoria = resultSet.getString("categoria");

                // Información del producto
                productosInfo.append(String.format("     %-10d \t %-20s \t %-10.2f \t %-15d \t %-20s\n", idProducto, nombreProducto, precio, inventario, categoria));
            }

            informacion.setText(productosInfo.toString());

        } catch (SQLException e) {
            informacion.setText("Error al obtener los productos: " + e.getMessage());
            e.printStackTrace();
        }
    }

    //metodo para cargar historial de compras
    private void cargarHistorialCompras() {
        Connection connection = BBDD.getConnection();
        if (connection == null) {
            informacion.setText("Error: No se pudo establecer conexión con la base de datos.");
            return;
        }

        //Sentencia para cargar productos
        String query = "SELECT h.id_compra, u.nombre AS usuario, p.nombre AS producto, h.cantidad, h.fecha "
                + "FROM historial_compras h "
                + "JOIN usuarios u ON h.id_usuario = u.id_usuario "
                + "JOIN productos p ON h.id_producto = p.id_producto";
        StringBuilder historialInfo = new StringBuilder();

        try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {

            if (!resultSet.isBeforeFirst()) {
                informacion.setText("No hay historial de compras registrado en la base de datos.");
                return;
            }

            historialInfo.append(String.format("     %-10s \t %-20s \t %-20s \t %-10s \t %-20s\n", "ID ", "Usuario", "Producto", "Cantidad", "Fecha"));
            historialInfo.append("--------------------------------------------------------------------------------------------------------\n");

            while (resultSet.next()) {
                int idCompra = resultSet.getInt("id_compra");
                String usuario = resultSet.getString("usuario");
                String producto = resultSet.getString("producto");
                int cantidad = resultSet.getInt("cantidad");
                String fecha = resultSet.getString("fecha");

                historialInfo.append(String.format("     %-10d \t %-20s \t %-20s \t %-10d \t %-20s\n", idCompra, usuario, producto, cantidad, fecha));
            }

            informacion.setText(historialInfo.toString());

        } catch (SQLException e) {
            informacion.setText("Error al obtener el historial de compras: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
