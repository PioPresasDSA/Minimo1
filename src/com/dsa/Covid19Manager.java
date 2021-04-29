package com.dsa;

import java.util.List;

public interface Covid19Manager {
    public void Vacunacion(Vacunación v);
    public List<Usuario> ListaVacunaciones();
    public List<Vacuna> MarcasVacunas();
    public void Añadirseguimiento(Seguimiento s);
    public List<Seguimiento> Seguimientos(string idUser);

}
