/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica02;

import logicaDeNegocio.Cliente;
import logicaDeNegocio.CuentaAhorro;

/**
 *
 * @author isaac
 */
public class Main {
    static Cliente[] clientes = new Cliente[100];
    static CuentaAhorro[] cuentas = new CuentaAhorro[100];
    static int totalClientes = 0;
    static int totalCuentas = 0;

    public static void main(String[] args) throws Exception {
        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Registrar cuenta");
            System.out.println("3. Ver clientes");
            System.out.println("4. Ver cuentas");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion = leerNumero();

            if (opcion == 1) registrarCliente();
            else if (opcion == 2) registrarCuenta();
            else if (opcion == 3) listarClientes();
            else if (opcion == 4) listarCuentas();
        } while (opcion != 5);

        System.out.println("Programa finalizado.");
    }

    static void registrarCliente() throws Exception {
        System.out.print("Cédula: ");
        String cedula = leerLinea();
        if (buscarCliente(cedula) != null) {
            System.out.println("El cliente ya está registrado.");
            return;
        }

        System.out.print("Nombre: ");
        String nombre = leerLinea();
        System.out.print("Dirección: ");
        String direccion = leerLinea();
        System.out.print("Correo: ");
        String correo = leerLinea();
        System.out.print("Teléfono: ");
        String telefono = leerLinea();

        clientes[totalClientes++] = new Cliente(nombre, cedula, direccion, correo, telefono);
        System.out.println("Cliente registrado exitosamente.");
    }

    static void registrarCuenta() throws Exception {
        System.out.print("Cédula del cliente: ");
        String cedula = leerLinea();
        Cliente cliente = buscarCliente(cedula);
        if (cliente == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        System.out.print("Número de cuenta: ");
        String numero = leerLinea();
        if (buscarCuenta(numero) != null) {
            System.out.println("Esa cuenta ya existe.");
            return;
        }

        System.out.print("Tasa de interés (ej: 0.02): ");
        double tasa = leerDecimal();

        cuentas[totalCuentas++] = new CuentaAhorro(numero, cliente, tasa);
        System.out.println("Cuenta registrada.");
    }

    static void listarClientes() {
        System.out.println("\n--- CLIENTES ---");
        for (int i = 0; i < totalClientes; i++) {
            System.out.println(clientes[i]);
        }
    }

    static void listarCuentas() {
        System.out.println("\n--- CUENTAS ---");
        for (int i = 0; i < totalCuentas; i++) {
            System.out.println(cuentas[i]);
        }
    }

    static Cliente buscarCliente(String cedula) {
        for (int i = 0; i < totalClientes; i++) {
            if (clientes[i].getCedula().equals(cedula)) return clientes[i];
        }
        return null;
    }

    static CuentaAhorro buscarCuenta(String numero) {
        for (int i = 0; i < totalCuentas; i++) {
            if (cuentas[i].getNumeroCuenta().equals(numero)) return cuentas[i];
        }
        return null;
    }

    // FUNCIONES PARA LEER ENTRADA
    static String leerLinea() throws Exception {
        String texto = "";
        int c;
        while ((c = System.in.read()) != -1) {
            if (c == '\n' || c == '\r') {
                // Para sistemas Windows que envían \r\n
                if (System.in.available() > 0 && System.in.read() == '\n') ;
                break;
            }
            texto += (char) c;
        }
        return texto.trim();
    }

    static int leerNumero() throws Exception {
        try {
            return Integer.parseInt(leerLinea());
        } catch (Exception e) {
            return 0;
        }
    }

    static double leerDecimal() throws Exception {
        try {
            return Double.parseDouble(leerLinea());
        } catch (Exception e) {
            return 0.0;
        }
    }
}

