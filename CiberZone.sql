DROP DATABASE IF EXISTS CiberZone;
CREATE DATABASE CiberZone;
USE CIberZone;


CREATE TABLE tienda (
    id_tienda INT PRIMARY KEY auto_increment,
    nombre VARCHAR(100)
);

CREATE TABLE categorias (
    id_categoria INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100)
);

CREATE TABLE productos (
    id_producto INT PRIMARY KEY ,
    id_categoria INT ,
    nombre VARCHAR(100),
    precio DECIMAL(10, 2),
    descripcion TEXT,
    caracteristicas TEXT,
    imagenes TEXT,
    inventario INT,
    FOREIGN KEY (id_categoria) REFERENCES categorias(id_categoria)
);

CREATE TABLE usuarios (
    id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100),
    email VARCHAR(100)
);

CREATE TABLE direcciones (
    id_direccion INT PRIMARY KEY AUTO_INCREMENT,
    id_usuario INT ,
    calle VARCHAR(100),
    numero INT,
    ciudad VARCHAR(100),
    pais VARCHAR(100),
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
);

CREATE TABLE historial_compras (
    id_compra INT PRIMARY KEY AUTO_INCREMENT,
    id_usuario INT ,
    id_producto INT ,
    cantidad INT,
    fecha DATE,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario),
    FOREIGN KEY (id_producto) REFERENCES productos(id_producto)
);
select * from tienda;
select * from PRODUCTOS;
select * from historial_compras;