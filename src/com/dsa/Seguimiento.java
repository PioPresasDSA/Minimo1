package com.dsa;

public class Seguimiento {
    private String descripción;
    private int fecha;

    public Seguimiento(String descripción, int fecha) {
        this.descripción = descripción;
        this.fecha = fecha;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
}
