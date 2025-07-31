/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fernandez.agustina;

import java.util.Random;

/**
 *
 * @author User
 */
public abstract class Libro {
    
    protected Autor autor;
    protected int cantidadDePaginas;
    protected String titulo;
    protected double precio;
    protected static Random generadorDePaginas;
    
    static {
        generadorDePaginas = new Random();
    }
    
    
    public Libro(String titulo, double precio, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.autor = autor;
        this.cantidadDePaginas = 0;
    }
    
    public Libro(String titulo, double precio, String nombre, String apellido) {
        this(titulo, precio, new Autor(nombre, apellido));
    }
    
    public int getCantidadDePaginas(){
        // retornará el valor correspondiente del atributo cantidadDePaginas,
        // que se inicializará en dicha propiedad, si y sólo si, su valor es cero. Para inicializar dicho atributo,
        // se utilizará el atributo estático generadorDePaginas (valores aleatorios entre 31 y 912).
        if (cantidadDePaginas == 0) {
            cantidadDePaginas = generadorDePaginas.nextInt(881) + 31;
        }
        return cantidadDePaginas;  
    }
    
    public double getPrecio() {
        return precio;
    }
    
    private static String mostrar(Libro l){
        // retorna una cadena detallando todos los
        // atributos del parámetro de tipo Libro que recibe.
        return "Titulo: " + l.titulo + ", Precio: "+ l.precio + ", Autor: " + l.autor.getNombreApellido()+
                ", Paginas: " + l.getCantidadDePaginas();
    }
    
    public static boolean sonIguales(Libro l, Libro l2) {
        // retorna true, si al comparar dos objetos de tipo
        // Libro, los títulos y autores son iguales, false, caso contrario.
        return l.titulo.equalsIgnoreCase(l2.titulo) && Autor.sonIguales(l.autor, l2.autor);
    }
    
    @Override
    public boolean equals(Object obj) {
        // retorna true, si al comparar dos objetos de tipo Libro,
        // los títulos y autores son iguales, false, caso contrario. Reutilizar código.
        if (! (obj instanceof Libro)) {
            return false;
        }
        return Libro.sonIguales(this, (Libro) obj);
    
    }
    
    @Override
    public String toString(){
        // retornará el detalle completo del libro.
        return mostrar(this);
    }
    
    
    
    
}
