/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author LEGION
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int a = 4;
int b = 81;
int c = 70;
int d = 50/2;
int e = 25;
int f = 18;
int g = 12;
int h = 25;
int i = 7;
int j = 40;
boolean parteuno = (Math.pow(a, 3)+Math.sqrt(b)>c&&(d==e));
boolean partedos = ((f+g<=h)&!(Math.pow(i, 2)>j));
boolean respuesta = (parteuno) | (partedos)  ;    
System.out.println("La respuesta es: " + respuesta);
    }
    
}
