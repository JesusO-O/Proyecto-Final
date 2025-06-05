/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author alexd
 */

    public class Evento {
    private String nombre;
    private boolean otorgaDuts;
    private double dutsOtorgados;

    public Evento(String nombre, boolean otorgaDuts, double dutsOtorgados) {
        this.nombre = nombre;
        this.otorgaDuts = otorgaDuts;
        this.dutsOtorgados = dutsOtorgados;
    }

    public String getNombre() {
        return nombre;
    }
    public boolean otorgaDuts() {
        return otorgaDuts;
    }
    public double getDutsOtorgados() {
        return dutsOtorgados;
    }
}

