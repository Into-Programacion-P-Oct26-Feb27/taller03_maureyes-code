/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author LEGION
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 15;
        int b = 25;
        int c = 30;
        int d = 8 ;
        int e = 60;
        int f = 144;
        int g = 12;
        boolean parteuno = (a+b > c);
        boolean partedos = (Math.pow(d, 2)< e);
        boolean partetres = (Math.sqrt(f)==g);
        boolean respuesta= ((parteuno)||(partedos)&&(partetres));
        System.out.println("La respuesta es: " + respuesta);
    }
    
}
