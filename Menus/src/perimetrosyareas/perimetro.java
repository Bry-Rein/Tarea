/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimetrosyareas;

import java.util.Scanner;

/**
 *
 * @author ulacit
 */
public class perimetro {
    public float PerimetroCuadrado() {
        perimetro forma = new perimetro();
        float areacuadrado = 0;
        float perimetrocuadrado = 0;
        Scanner keyboard = new Scanner(System.in);
            System.out.println("Obteniendo AREA.....");
            System.out.print("Digite el lado de su cuadrado");
            float width = keyboard.nextFloat();
            
            if (width < 0) {
                System.out.println("Ningun lado puede ser negativo");
                forma.PerimetroCuadrado();
            } else {
                perimetrocuadrado = width * 4;
                System.out.println("El perimetro del cuadrado es: " + perimetrocuadrado);
            } return perimetrocuadrado;
     
    }
    
    public float PerimetroCirculo() {
        perimetro forma = new perimetro();
        
        float perimetrocirculo = 0;
        Scanner keyboard = new Scanner(System.in);
        
        
            System.out.println("Obteniendo AREA.....");
            System.out.println("Digite el radio del circulo");
            
                float radius = keyboard.nextFloat();
                if (radius < 0) {
                    System.out.println("Ningun lado puede ser negativo");
                    forma.PerimetroCirculo();
                } else {
                    perimetrocirculo = (float) ((2* Math.PI) * radius);
                    System.out.println("El perimetro del circulo es: " + perimetrocirculo);
            }
         return perimetrocirculo;
       

 
}
    
 
public float PerimetroRectangulo() {
        perimetro forma = new perimetro();
        float arearectangulo = 0;
        float perimetrorectangulo = 0;
        Scanner keyboard = new Scanner(System.in);
       
        
            System.out.println("Obteniendo AREA.....");
            System.out.print("Digite la altura del rectangulo");
            float height = keyboard.nextFloat();
            System.out.print("Digite el ancho del rectangulo");
            float width = keyboard.nextFloat();
            
            if (height < 0 || width < 0) {
                System.out.println("Ningun lado puede ser negativo");
                forma.PerimetroRectangulo();
            } else {
                perimetrorectangulo = (2*height) + (2*width);
                System.out.println("El perimetro del rectangulo es: " + perimetrorectangulo);
            } return perimetrorectangulo;
        }
public float PerimetroTrianguloIs(float perimetroTrianguloIs) {
 perimetro forma = new perimetro();
 float areatriangulois = 0;
 float perimetrotriangulois = 0;
 Scanner keyboard = new Scanner(System.in);
 

     System.out.println("Obteniendo AREA.....");
     System.out.print("Digite la base del triagulo is");
     float height = keyboard.nextFloat();
     System.out.print("Digite el lado del triangulo is");
     float width = keyboard.nextFloat();

     if (height < 0 || width < 0) {
         System.out.println("Ningun lado puede ser negativo");
         forma.PerimetroTrianguloIs(perimetrotriangulois);
     } else {
         perimetrotriangulois= 2*height+width;
         System.out.println("El perimetro del triangulo is es: " + perimetrotriangulois);
     } return perimetrotriangulois;
        }

public float PerimetroTrianguloE(float perimetroTrianguloE) {
 perimetro forma = new perimetro();
 float areatrianguloe = 0;
 float perimetrotrianguloe = 0;
 Scanner keyboard = new Scanner(System.in);
 

     System.out.println("Obteniendo AREA.....");
     System.out.print("Digite el lado del triangulo e");
     float width = keyboard.nextFloat();

     if (width < 0) {
         System.out.println("Ningun lado puede ser negativo");
         forma.PerimetroTrianguloE(perimetrotrianguloe);
     } else {
         perimetrotrianguloe= 2*width+ width;
         System.out.println("El perimetro del triangulo e es: " + perimetrotrianguloe);
     } return perimetrotrianguloe;
        }
 
public float PerimetroPentagono(float perimetroPentagono) {
 perimetro forma = new perimetro();
 float areapentagono = 0;
 float perimetropentagono = 0;
 Scanner keyboard = new Scanner(System.in);
 

     System.out.println("Obteniendo AREA.....");
     System.out.print("Digite el lado del pentagono");
     float width = keyboard.nextFloat();

     if (width < 0) {
         System.out.println("Ningun lado puede ser negativo");
         forma.PerimetroPentagono(perimetropentagono);
     } else {
         perimetropentagono= width*5;
         System.out.println("El perimetro del pentagono es: " + perimetropentagono);
     } return perimetropentagono;
        }
        
        
        
        
}
    



