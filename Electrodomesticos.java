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
public class Electrodomesticos {

    private String marca;
    private String modelo;
    private String numeroSerie; 
    private int capacidad;        

    public Electrodomesticos() {
    }

    public Electrodomesticos(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    
public void agregarRopa(int cantidad){

}    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
        
    
 

    
    

    
}

 