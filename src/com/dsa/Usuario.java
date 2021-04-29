package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String idUser;
    private List<Seguimiento> Seguimientos = new ArrayList<>();

    public Usuario (String idUser){
        this.idUser = idUser;
    }

    public List<Seguimiento> getSeguimientos(){
        return Seguimientos;
    }

    public String getidUser() {
        return idUser;
    }
}
