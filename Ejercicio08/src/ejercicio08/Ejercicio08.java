/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author LEGION
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = (80+40)/6;
                int b = 5;
                int c = 45;
                int d = 100;
                int e = 25;
                int f =3;
                int g = 30;
                
                boolean parteuno = (a+ Math.pow(b, 2)>= c);
                boolean partedos = (d - e * f <g);
                boolean respuesta =(parteuno && partedos);
                System.out.println("La respuesta es: " + respuesta);
                
    }
    
}
