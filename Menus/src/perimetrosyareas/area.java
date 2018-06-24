
package perimetrosyareas;

import java.util.Scanner;

public class area {
    public float AreaCuadrado() {
        area forma = new area();
        float areacuadrado = 0;
        float perimetrocuadrado = 0;
        Scanner keyboard = new Scanner(System.in);
        
            System.out.println("Obteniendoo AREA.....");
            System.out.print("Digite el lado del cuadrado");
            float width = keyboard.nextFloat();
            
            if (width < 0) {
                System.out.println("Ningun lado puede ser negativo");
                forma.AreaCuadrado();
            } else {
                areacuadrado = width * width;
                System.out.println("El area del cuadrado es: " + areacuadrado);
            }
            return areacuadrado;
        }
       
        
        
        
        
        
    
    
    public float AreaCirculo() {
        area forma = new area();
        float areacirculo = 0;
        float perimetrocirculo = 0;
        Scanner keyboard = new Scanner(System.in);
        
            System.out.println("Obteniendo AREA.....");
            System.out.print("Digite el radio del circulo");
            float radius = keyboard.nextFloat();
            
            if (radius < 0) {
                System.out.println("Ningun lado puede ser negativo");
                forma.AreaCirculo();
            } else {
                areacirculo = (float) ((radius * radius)* Math.PI);
                System.out.println("El area del circulo es: " + areacirculo);
            }
            return areacirculo;
        }
       
    public float AreaRectangulo() {
        area forma = new area();
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
                forma.AreaRectangulo();
            } else {
                arearectangulo = height * width;
                System.out.println("El area del rectangulo es: " + arearectangulo);
            }
            return arearectangulo;
        } 
    
       public float AreaTrianguloIs() {
        area forma = new area();
        float areatriangulois = 0;
        float perimetrotriangulois = 0;
        Scanner keyboard = new Scanner(System.in);
               
            System.out.println("Obteniendo AREA.....");
            System.out.print("Digite base del triangulo is");
            float height = keyboard.nextFloat();
            System.out.print("Digite el lado del triangulo is");
            float width = keyboard.nextFloat();
            
            if (height < 0 || width < 0) {
                System.out.println("Ningun lado puede ser negativo");
                forma.AreaTrianguloIs();
            } else {
                areatriangulois = (float) ((height*Math.sqrt((width*width)- ((height*height)/4)))/2);
                System.out.println("El area del triangulo is es: " + areatriangulois);
            }
            return areatriangulois;
        
}
       public float AreaTrianguloE() {
        area forma = new area();
        float areatrianguloe = 0;
        float perimetrotrianguloe = 0;
        Scanner keyboard = new Scanner(System.in);
               
            System.out.println("Obteniendo AREA.....");
            System.out.print("Digite el lado del triangulo e");
            float width = keyboard.nextFloat();
            
            if (width < 0) {
                System.out.println("Ningun lado puede ser negativo");
                forma.AreaTrianguloE();
            } else {
                areatrianguloe = (float) ((Math.sqrt((3)* ((width*width)/4))));
                System.out.println("El area del triangulo e es: " + areatrianguloe);
            }
            return areatrianguloe;
        

}
        public float AreaPentagono() {
        area forma = new area();
        float areapentagono = 0;
        float perimetropentagono = 0;
        Scanner keyboard = new Scanner(System.in);
               
            System.out.println("Obteniendo AREA.....");
            System.out.print("Digite el lado del pentagono");
            float width = keyboard.nextFloat();
            
            if (width < 0) {
                System.out.println("Ningun lado puede ser negativo");
                forma.AreaPentagono();
            } else {
                areapentagono = (float) ((((width)*(5))*5)/2);
                System.out.println("El area del pentagono es: " + areapentagono+ " centimetros cuadrados");
            }
            return areapentagono;
}
}   
    


