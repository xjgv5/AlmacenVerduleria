package com.xjgv.almacenApp;

public class Fruta extends Producto {
    private double peso;
    private String color;

    public Fruta(String nombre, Double precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Peso=" + peso + '\n' +
                "Color = " + color;
    }
}
