/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos.uml;

/**
 *
 * @author maast
 */
public class Libro {
 private String titulo;
 private String editorial;
 private String tipo_libro;
 private String año;

 
 public Libro(){}

    public Libro(String titulo, String editorial, String tipo_libro) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.tipo_libro = tipo_libro;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getTipo_libro() {
        return tipo_libro;
    }

    public void setTipo_libro(String tipo_libro) {
        this.tipo_libro = tipo_libro;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }
 
 
    
 
    
    
    
 
 
 
    
    
    
}
