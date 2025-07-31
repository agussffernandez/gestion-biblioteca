/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fernandez.agustina;

/**
 *
 * @author User
 */
public class Manual extends Libro{
    
    private Tipo tipo;

    public Manual(String titulo, double precio, String nombre, String apellido, Tipo tipo) {
        super(titulo, precio, nombre, apellido);
        this.tipo = tipo;
    }
    
    
    public String toString() {
        // toString(). Retornará una cadena de caracteres conteniendo la información
        // completa del objeto.
        return super.toString() + ", Tipo: " + tipo;
    }
    
    @Override
    public boolean equals(Object obj){
        // que retorna true, si el parámetro recibido es igual a la instancia
        // actual (ambos libros son iguales) y los tipos son iguales, false, caso contrario.
        if (!(obj instanceof Manual)) {
            return false;
        }
        Manual obj2 = (Manual) obj;
        
        return super.equals(obj2) && this.tipo == obj2.tipo;
    }
    
    
    
}
