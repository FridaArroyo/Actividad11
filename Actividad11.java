package actividad11;
import java.util.Scanner;
public class Actividad11 {
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    int op1=0, op2=0;
    getArea ga = new getArea();
    gePerimetro gp = new gePerimetro();
    SHAPE shape = new SHAPE();
    Menu m = new Menu();

    m.menu();
    op1 = leer.nextInt();
  
    if(op1==1){
        SHAPE.shapeTriangulo();
        m.submenu();
        op2 = leer.nextInt();
         if(op2==1){
           SHAPE.areaTriangulo();
           }   
           if(op2==2){
            SHAPE.perimetroTriangulo();
        }       
    }
    
    if(op1==2){
        SHAPE.shapeCuadrado();
        m.submenu();
        op2 = leer.nextInt();  
         if(op2==1){
           SHAPE.areaCuadrado();
        }       
            if(op2==2){
              SHAPE.perimetroCuadrado();
        }  
    }
    
    if(op1==3){
        SHAPE.shapeCirculo();
        m.submenu();
        op2 = leer.nextInt();   
         if(op2==1){
           SHAPE.areaCirculo();
        }       
            if(op2==2){
             SHAPE.perimetroCirculo();
        }   
                
    }
    
  }   
}
