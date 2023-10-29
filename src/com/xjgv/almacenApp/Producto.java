package com.xjgv.almacenApp;

public class Producto {
    protected String nombre;
    protected Double precio;

    public Producto() {
    }

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "\n" +
                "Nombre = " + nombre + '\n' +
                "Precio = " + precio + '\n';
    }
}
