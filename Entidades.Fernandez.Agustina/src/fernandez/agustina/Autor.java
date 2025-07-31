/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fernandez.agustina;

/**
 *
 * @author User
 */
public class Autor {
    
    private String nombre;
    private String apellido;

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    public static boolean sonIguales(Autor a1, Autor a2) {
        // Retornará true, si los nombres y los apellidos son iguales, false,
        // caso contrario. 
        return a1.nombre.equalsIgnoreCase(a2.nombre) && a1.apellido.equalsIgnoreCase(a2.apellido);
    }
    
    public String getNombreApellido() {
        // retornará una cadena de caracteres que contenga 
        // el nombre y apellido del autor, separados por guiones medios.
        return nombre + " - " + apellido;
    }
    
  
    
}
