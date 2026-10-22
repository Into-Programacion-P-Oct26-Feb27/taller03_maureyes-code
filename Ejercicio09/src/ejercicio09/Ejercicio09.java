/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author LEGION
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO code application logic here
    int a = 225;
    int b = 5;
    int c = 50;
    int d = 120/4;
    int e = 30;
    
    boolean parteuno = ((Math.sqrt(a))+ (Math.pow(b, 2)))<c;
    boolean partedos = (d == e);
    boolean respuesta = !(parteuno) && (partedos);
    System.out.println("La respuesta es: " + respuesta);
        
                
                
  
    }
   
    
}
