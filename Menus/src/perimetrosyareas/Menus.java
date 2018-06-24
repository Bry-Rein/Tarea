
package perimetrosyareas;
import java.util.Scanner;


public class Menus {
    
    
    public static void main(String[] args) {
        boolean salir = false;
        
        while (salir != true){
            Submenus operacion = new Submenus();
            Submenus submenu = new Submenus();
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite la decision que desee realizar <1:obtener PERIMETRO> <2: obtener AREA> <3:SALIR>");
            int decision = sc.nextInt();
            
        
        
        if (decision == 1) {
            operacion.SubmenuPerimetro();
          
        } else if (decision == 2) {
            operacion.SubmenuArea();
        } else if (decision == 3){
          System.out.println("Gracias");
          break;
        }
        
          
        } 
    }
        
}
