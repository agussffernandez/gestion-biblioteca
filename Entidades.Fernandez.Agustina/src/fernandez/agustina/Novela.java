/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fernandez.agustina;

/**
 *
 * @author User
 */
public class Novela extends Libro {
    
    private Genero genero;

    public Novela(String titulo, double precio, Autor autor, Genero genero) {
        super(titulo, precio, autor);
        this.genero = genero;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Genero: " + genero;
    }
    
    @Override
    public boolean equals(Object obj) {
        // que retorna true, si el parámetro recibido es igual a la instancia
        // actual (ambos libros son iguales) y los géneros son iguales, false, caso contrario.
        if(!(obj instanceof Novela)) {
            return false;
        }
        Novela obj2 = (Novela) obj;
        return super.equals(obj2) && this.genero == obj2.genero;
    }
    
    
}
