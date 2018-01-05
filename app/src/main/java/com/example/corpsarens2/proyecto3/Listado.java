package com.example.corpsarens2.proyecto3;

/**
 * Created by Corp Sarens2 on 05/01/2018.
 */

public class Listado {
    private String descripcion;
    private String titulo;
    private String fecha;

    public Listado(String titulo,String descripcion,String fecha) {
        this.descripcion=descripcion;
        this.fecha=fecha;
        this.titulo=titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFecha() {
        return fecha;
    }
}
