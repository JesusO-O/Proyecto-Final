/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexd
 */
    public class Usuario extends Persona {
    private double duts;
    private List<Evento> eventosInscritos = new ArrayList<>();
    

public void inscribirseAEvento(Evento evento) {
    eventosInscritos.add(evento);
    if (evento.otorgaDuts()) {
        agregarDUTS(evento.getDutsOtorgados());
    }
}

public void cancelarEvento(Evento evento) {
    eventosInscritos.remove(evento);
    if (evento.otorgaDuts()) {
        agregarDUTS(-evento.getDutsOtorgados());
    }
}

 

    public Usuario(String nombre, String correo, String contrasena) {
        super(nombre, correo, contrasena);
        this.duts = 0;
    }

    public void agregarDUTS(double cantidad) {
        this.duts += cantidad;
    }
      public List<Evento> getEventosInscritos() {
        return eventosInscritos;
    }


    public double getDuts() {
        return duts;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Usuario: " + nombre + " | DUTS: " + duts);
    }

   
}

