/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author LEGION
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        int a = 3;
        int b = 81;
        int c = 40;
        
        double operacion = ((Math.pow (a, 3))+(Math.sqrt(b)));
        
        boolean respuesta = (operacion <= c);
        System.out.println("La respuesta es: " + respuesta);
    }
    
}
