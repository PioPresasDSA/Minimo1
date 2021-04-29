package com.dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Vacunación {
    private String nombre;
    private int fecha;
    private Map<String,Usuario> Usuarios = new HashMap();
    private List<Vacuna> Vacunas = new ArrayList<Vacuna>();

    public Vacunación ( String idUser, int fecha){
        this.nombre = idUser;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFecha() {
        return fecha;
    }
}
