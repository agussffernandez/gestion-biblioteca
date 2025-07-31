/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fernandez.agustina;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Biblioteca {
    
    private int capacidad;
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.capacidad = 3;
        this.libros = new ArrayList<>();
    }

    public Biblioteca(int capacidad) {
        this.capacidad = capacidad;
        this.libros = new ArrayList<>();
    }
    
    public boolean sonIguales(Libro libro) {
        // retornará true, si es que el libro ya se encuentra en la biblioteca, false, caso
        // contrario.
        for (Libro l : libros) {
            if(l.equals(libro)){
                return true;
            } 
        }
        return false;
        
    }
    
    public void agregar (Libro l) {
        // si la biblioteca posee capacidad de almacenar al menos un libro más y dicho libro no
        // se encuentra en la biblioteca, lo agrega a la colección, caso contrario, informará lo acontecido.
        if(libros.size() >= capacidad){
            System.out.println("SIN LUGAR");
        } else if (sonIguales(l)){
            System.out.println("YA INGRESADO");
        } else {
            libros.add(l);
        }
    }
    
    private double getPrecio(PrecioLibro tipo) {
        // retornará el valor de la biblioteca de acuerdo
        // con el enumerado que recibe como parámetro.
        double total = 0;
        for(Libro l : libros) {
            if (tipo == PrecioLibro.TODOS ||
                (tipo == PrecioLibro.MANUALES && l instanceof Manual) ||
                (tipo == PrecioLibro.NOVELAS && l instanceof Novela)) {
                total += l.getPrecio();
            }
        }
        return total;
    }
    
    public double getPrecioDeManuales() {
        return getPrecio(PrecioLibro.MANUALES);
    }
    
    public double getPrecioDeNovelas() {
        return getPrecio(PrecioLibro.NOVELAS);
    }
    
    public double getPrecioTotal() {
        return getPrecio(PrecioLibro.TODOS);
    }
    
    
    public static String mostrar(Biblioteca b) {
        // retorna una cadena de caracteres con toda la
        // información de la biblioteca que recibe cómo parámetro, incluyendo el detalle de cada uno de sus
        // libros.
        StringBuilder sb = new StringBuilder();
        
        sb.append("Capacidad: ").append(b.capacidad).append("\n");
        sb.append("Libros:\n");
        for (Libro l : b.libros) {
            sb.append(l.toString()).append("\n");
        }
        sb.append("Total Manuales: ").append(b.getPrecioDeManuales()).append("\n");
        sb.append("Total Novelas: ").append(b.getPrecioDeNovelas()).append("\n");
        sb.append("Total General: ").append(b.getPrecioTotal());
        return sb.toString();
    }
    
    
    
}
