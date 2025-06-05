/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;
/**
 *
 * @author alexd
 */
public class ControladorUsuario {
        private static List<Usuario> listaUsuarios = new ArrayList<>();
            public static boolean registrar(Usuario usuario) {
for (Usuario u : listaUsuarios) {
            if (u.getCorreo().equalsIgnoreCase(usuario.getCorreo())) {
                return false; 
            }
} listaUsuarios.add(usuario);
        return true;
}
   public static Usuario buscarPorCorreoYContrasena(String correo, String contrasena) {
        for (Usuario u : listaUsuarios) {
            if (u.getCorreo().equalsIgnoreCase(correo) && u.getContrasena().equals(contrasena)) {
                return u;
            }
        }
        return null;         
            
}
public static List<Usuario> getListaUsuarios() {
        return listaUsuarios;
}
}
