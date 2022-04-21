package actividad11;
import java.util.Scanner;
public class SHAPE {
static Scanner leer = new Scanner (System.in);    
private static float T_base;
private static  float T_altura;
private static float Cir_radio;
private static float C_lado;

    static void shapeTriangulo(){
        System.out.println("Ingrese la base del triangulo");
        float base = leer.nextFloat();
        T_base = base;
        System.out.println("Ingrese la altura del triangulo");
        float altura = leer.nextFloat();       
        T_altura = altura;
    }
    
    static void areaTriangulo(){
        System.out.println("El área del triangulo es:" + getArea.Triangulo(T_base, T_altura));
    }
    
    static void perimetroTriangulo(){
        System.out.println("El perímetro del triangulo es:" + gePerimetro.Triangulo(T_base, T_altura));
    }
    
    
    static void shapeCuadrado(){
        System.out.println("Ingrese el lado del cuadrado");
        float lado = leer.nextFloat();
        C_lado = lado;
    }
    
    static void areaCuadrado(){
        System.out.println("El área del cuadrado es:" + getArea.Cuadrado(C_lado));
    }
    
    static void perimetroCuadrado(){
        System.out.println("El perímetro del cuadrado es:" + gePerimetro.Cuadrado(C_lado));
    }
    
    
    static void shapeCirculo(){
        System.out.println("Ingrese el radio del circulo");
        float radio_C = leer.nextFloat();
        Cir_radio = radio_C;
    }
    
    static void areaCirculo(){
        System.out.println("El área del circulo es:" + getArea.Circulo(Cir_radio));
    }
    
    static void perimetroCirculo(){
        System.out.println("El perímetro del circulo es:" + gePerimetro.Circulo(Cir_radio));
    }
    
}

