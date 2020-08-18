/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.melvin.clase02.com.melvin.clase02;

/**
 *
 * @author recin
 */
public class Libros {
    
    private int Id;
    private String NombreLibros;
    private int NumeroPaginas;
    private String Autor;
      
    public Libros(int pId, String pNombreLibros, int pNumeroPaginas, String pAutor){
    
    Id = pId;
    NombreLibros = pNombreLibros;
    NumeroPaginas = pNumeroPaginas;
    Autor = pAutor;
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombreLibros() {
        return NombreLibros;
    }

    public void setNombreLibros(String NombreLibros) {
        this.NombreLibros = NombreLibros;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int NumeroPaginas) {
        this.NumeroPaginas = NumeroPaginas;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "Libros{" + "Id=" + Id + ", NombreLibros=" + NombreLibros + ", NumeroPaginas=" + NumeroPaginas + ", Autor=" + Autor + '}';
    }
    
    
    
    
    
}
