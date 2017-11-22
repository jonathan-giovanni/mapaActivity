package com.example.admin.mapaactivity;

import java.io.Serializable;

/**
 * Created by admin on 22/11/17.
 */

public class Marcador implements Serializable{
    public double latitud;
    public double longitud;
    public String titulo;

    public Marcador(double latitud, double longitud, String titulo) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.titulo = titulo;
    }

}
