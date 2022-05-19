package com.example.examsemana9.Adapter;

public class Anime {

    private int id;
    private String nombre;
    private String descripción;
    private String foto;

    public Anime(int id, String nombre, String descripción, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.descripción = descripción;
        this.foto = foto;
    }

    public Anime(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripción='" + descripción + '\'' +
                ", foto='" + foto + '\'' +
                '}';
    }
}
