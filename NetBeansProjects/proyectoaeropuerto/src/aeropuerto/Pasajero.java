/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

/**
 *
 * @author jeison tamara
 */
public class Pasajero {
    //atributos de clase
    private String nombre;
    private String pasaporte;
    private String nacionalidad;
    
    //metodo constructor
    public Pasajero(String nombre, String pasaporte, String nacionalidad) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.nacionalidad = nacionalidad;
    }
    
    //metodos Getters
    public String getNombre() {
        return nombre;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    
    
}
