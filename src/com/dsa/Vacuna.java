package com.dsa;

public class Vacuna {
    private String Marca;
    private int cantidad;

    public Vacuna (String Marca, int cantidad){
        this.Marca = Marca;
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void addVacuna(){
        this.cantidad++;
    }
}
