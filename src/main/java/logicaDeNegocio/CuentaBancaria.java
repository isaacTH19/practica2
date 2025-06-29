/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaDeNegocio;

/**
 *
 * @author isaac
 */
public abstract class CuentaBancaria {
    protected String numeroCuenta;
    protected double saldo;
    protected Cliente cliente;

    public CuentaBancaria(String numeroCuenta, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public String getNumeroCuenta() { return numeroCuenta; }
    public double getSaldo() { return saldo; }
    public Cliente getCliente() { return cliente; }

    public abstract double calcularInteres();
}

