/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiocaso1;

/**
 *
 * @author Laboratorio
 */
public class Vehiculo {
    
    package alquilervehiculos;
    public class Vehiculo {

    private String placa;
    private String marca;
    private double precioPorDia;
    private int dias;
    private boolean seguroCompleto;
    private boolean gps;

    public Vehiculo(String placa, String marca, double precioPorDia, int dias, boolean seguroCompleto, boolean gps) {
        this.placa = placa;
        this.marca = marca;
        this.precioPorDia = precioPorDia;
        this.dias = dias;
        this.seguroCompleto = seguroCompleto;
        this.gps = gps;
    }

    public double calcularSubtotal() {
        double costoBase = precioPorDia * dias;
        if (dias > 7) {
            costoBase = costoBase - (costoBase * 0.15);
        }
        double recargos = 0;
        if (seguroCompleto) {
            recargos += 5000 * dias;
        }
        if (gps) {
            recargos += 2000 * dias;
        }
        return costoBase + recargos;
    }

    public int calcularPuntos() {
        int puntos = 0;
        if (dias > 7) {
            puntos += 5;
        }
        if (seguroCompleto) {
            puntos += 2;
        }
        return puntos;
    }

    public String getPlaca() {
        return placa;
}
