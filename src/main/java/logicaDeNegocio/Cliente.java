/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaDeNegocio;

/**
 *
 * @author isaac
 */
public class Cliente extends Persona {
    private String correo;
    private String telefono;

    public Cliente(String nombre, String cedula, String direccion, String correo, String telefono) {
        super(nombre, cedula, direccion);
        this.correo = correo;
        this.telefono = telefono;
    }

    public String toString() {
        return super.toString() + ", Correo: " + correo + ", Teléfono: " + telefono;
    }
}

