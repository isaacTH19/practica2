/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaDeNegocio;

/**
 *
 * @author isaac
 */
public class Persona {
    private String nombre;
    private String cedula;
    private String direccion;

    public Persona(String nombre, String cedula, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    public String getNombre() { return nombre; }
    public String getCedula() { return cedula; }
    public String getDireccion() { return direccion; }

    public String toString() {
        return "Nombre: " + nombre + ", Cédula: " + cedula + ", Dirección: " + direccion;
    }
}
