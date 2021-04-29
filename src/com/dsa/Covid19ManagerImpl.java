package com.dsa;

import java.util.*;

public class Covid19ManagerImpl implements Covid19Manager{
    private static Covid19ManagerImpl Instance;
    private Map<String, Usuario> Usuarios;
    private List<Vacunación> Vacunaciones;
    private ArrayList<Vacuna> Vacunas;
    private List<Seguimiento> Seguimientos;

    private Covid19ManagerImpl(){
        this.Usuarios=new HashMap<>();
        this.Vacunaciones=new LinkedList<>();
        this.Vacunas=new ArrayList<>();
    }
    public static Covid19ManagerImpl getInstance() {
        if (Instance == null)
            Instance = new Covid19ManagerImpl();
        return Instance;
    }

    public void Vacunacion(Vacunación v) {
        if (!Usuarios.containsKey(v.getNombre())) {
            Usuario usuario = new Usuario(v.getNombre());
            Usuarios.put(v.getNombre(), usuario);
        }
        this.Vacunaciones.add(v);
    }

    public List<Usuario> ListaVacunaciones() {
        List<Usuario> lu = new LinkedList<>();
        Collections.sort();  ???

        }

    public List<Vacuna> MarcasVacunas() {
        Collections.sort(this.Vacunas, new  Comparator<Vacuna>() {
            public int compare(Vacuna o1, Vacuna o2) {
                return Double.compare(o2.getCantidad(),o1.getCantidad());
            }
        });
        return this.Vacunas;
    }

    public void Añadirseguimiento(Seguimiento s) {
        this.Seguimientos.add(s);


    }

    public List<Seguimiento> Seguimientos(string idUser) {
        return Usuarios.get(idUser).getSeguimientos();

    }
    public void clear() {
        this.Usuarios.clear();
        this.Vacunas.clear();
        this.Vacunaciones.clear();
        this.Seguimientos.clear();
    }
}
