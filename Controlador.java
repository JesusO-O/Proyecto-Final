/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Vista.VentanaPrincipal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author alexd
 */

    public class Controlador {
   
    private Usuario u;
    
    private List<Usuario> usuarios = new ArrayList<>();

    public void iniciarSesion(String correo, String contrasena) {
        for (Usuario u : usuarios) {
            if (u.getCorreo().equals(correo) && u.getContrasena().equals(contrasena)) {
                System.out.println("Inicio de sesión exitoso");
                VentanaPrincipal vte = new VentanaPrincipal(u);
                vte.setVisible(true);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
    }

    public void abrirRegistro() {
        JOptionPane.showMessageDialog(null, "Abrir ventana de registro");
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    public Usuario validarLogin(String correo, String contrasena) {
    for (Usuario u : usuarios) {
        if (u.getCorreo().equals(correo) && u.getContrasena().equals(contrasena)) {
            return u;
        }
    }
    return null;
}
    
}

