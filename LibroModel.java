package org.example.Modelos;

public class LibroModel {
    private String titulo;
    private String autor;
    private int cantidadEnInventario;
    private int cantidadPrestada;

    public LibroModel() {
    }

    public LibroModel(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadPrestada = cantidadPrestada;
        this.cantidadEnInventario = cantidadEnInventario;
    }

    public int getCantidadEnInventario() {
        return cantidadEnInventario;
    }

    public void setCantidadEnInventario(int cantidadEnInventario) {
        this.cantidadEnInventario = cantidadEnInventario;
    }

    public int getCantidadPrestada() {
        return cantidadPrestada;
    }

    public void setCantidadPrestada(int cantidadPrestada) {
        this.cantidadPrestada = cantidadPrestada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public boolean darPrestamo()
    {
        boolean prestado=true;
        if(cantidadPrestada<cantidadEnInventario)
        {
            cantidadPrestada++;
        }
        else
        {
            prestado=false;
        }
        return prestado;
    }
    public boolean devuelveLibros()
    {
        boolean devuelto=true;
        if (cantidadPrestada==0)
        {
            devuelto=false;
        }
        else
        {
            cantidadPrestada--;
        }
        return devuelto;
    }
}