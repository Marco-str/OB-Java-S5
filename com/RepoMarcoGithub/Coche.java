package com.RepoMarcoGithub;

public class Coche {
    //1 atributos
    String marca;
    String modelo;
    String color;
    int ancho;
    boolean combustion;
    // 2 constructores
    public Coche(){}

    public Coche(String marca, String modelo, String color, int ancho, boolean combustion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ancho = ancho;
        this.combustion = combustion;
    }

    // 3 metodos


    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", ancho=" + ancho +
                ", combustion=" + combustion +
                '}';
    }
}
