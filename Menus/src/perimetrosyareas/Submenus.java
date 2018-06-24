
package perimetrosyareas;

import java.util.Scanner;


public class Submenus {
    
    void SubmenuPerimetro(){
        perimetro formageo = new perimetro();
        Scanner sc = new Scanner(System.in);
        Submenus submenuperi = new Submenus();
        System.out.println("¿Con que figura desea realizar sus perimetros? <1:CUADRADO> <2:RECTANGULO> <3:CIRCULO> <4:TRIANGULOIS> <5:TRIANGULOE> <6:PENTAGONO>");
        int forma = sc.nextInt();
        if (forma ==1) {
            formageo.PerimetroCuadrado();
        }else if (forma ==2) {
            formageo.PerimetroRectangulo();
        }else if (forma == 3) {
            formageo.PerimetroCirculo();
        }else if (forma == 4) {
            formageo.PerimetroTrianguloIs(forma);
        }else if (forma == 5) {
            formageo.PerimetroTrianguloE(forma);
        }else if (forma == 6) {
            formageo.PerimetroPentagono(forma);  
        }else{
           System.out.println("Intente nuevamente");
           SubmenuPerimetro();
        }                    
            }

    void SubmenuArea() {
        area formageo = new area();
        Scanner sc = new Scanner(System.in);
                Submenus submenuarea = new Submenus();
                System.out.println("¿Con que figura desea realizar el area? <1:CUADRADO> <2:RECTANGULO> <3:CIRCULO> <4:TRIANGULOIS> <5:TRIANGULOE> <6:PENTAGONO> ");
                int forma = sc.nextInt();
                if (forma == 1) {
                    formageo.AreaCuadrado();
                   
                    
                }else if (forma == 2) {
                    formageo.AreaRectangulo();
                }else if (forma == 3) {
                    formageo.AreaCirculo();
                }else if (forma == 4) {
                    formageo.AreaTrianguloIs();
                }else if (forma == 5) {
                    formageo.AreaTrianguloE();
                }else if (forma == 6) {
                    formageo.AreaPentagono();
                }else {
                    System.out.println("Intente nuevamente");
                    SubmenuArea();
                }
    }

    
}   
