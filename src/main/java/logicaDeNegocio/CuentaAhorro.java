/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaDeNegocio;

/**
 *
 * @author isaac
 */
public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorro(String numeroCuenta, Cliente cliente, double tasaInteres) {
        super(numeroCuenta, cliente);
        this.tasaInteres = tasaInteres;
    }

    public double calcularInteres() {
        return saldo * tasaInteres;
    }

    public String toString() {
        return "Cuenta: " + numeroCuenta + ", Saldo: " + saldo + ", Interés: " + (tasaInteres * 100) + "%, Cliente: " + cliente.getNombre();
    }
}


