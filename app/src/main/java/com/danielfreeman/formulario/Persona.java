package com.danielfreeman.formulario;

public class Persona {

    private String nombre;
    private int fechaDIA;
    private int fechaMES;
    private int fechaANIO;
    private  String telefono;
    private String email;
    private String bio;

    public Persona(String nombre, int fechaDIA, int fechaMES, int fechaANIO, String telefono, String email, String bio) {
        this.nombre = nombre;
        this.fechaDIA = fechaDIA;
        this.fechaMES = fechaMES;
        this.fechaANIO = fechaANIO;
        this.telefono = telefono;
        this.email = email;
        this.bio = bio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDIA() {
        return fechaDIA;
    }

    public void setFechaDIA(int fechaDIA) {
        this.fechaDIA = fechaDIA;
    }

    public int getFechaMES() {
        return fechaMES;
    }

    public void setFechaMES(int fechaMES) {
        this.fechaMES = fechaMES;
    }

    public int getFechaANIO() {
        return fechaANIO;
    }

    public void setFechaANIO(int fechaANIO) {
        this.fechaANIO = fechaANIO;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
