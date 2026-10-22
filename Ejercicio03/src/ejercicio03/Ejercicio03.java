/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int a = 25;
        int b = 15;
        int c = 8;
        int d = 49;
        
        // Variable decimal para el número con punto flotante
        double e = 2.5;

        // Cálculos
        double division = (double) (a + b) / c; // Convertimos a double para mantener precisión
        double raiz = Math.sqrt(d);
        
        double resultado = division + raiz + e;

        // Mostrar el resultado en consola
        System.out.println("El resultado de la operación es: " + resultado);   
        
    }
    
}
