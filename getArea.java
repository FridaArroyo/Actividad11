package actividad11;
import java.lang.Math;
public class getArea {
    
    static float Triangulo (float Tb, float Ta){
        float area_T = (Tb * Ta)/2;
        return area_T;
    }
    
    static float Cuadrado (float Cl){
        float area_C = Cl*Cl;
        return area_C;
    }
    
    static double Circulo (float radio){
        double pi=3.1416;
        double area_C = pi * Math.pow(radio,2);
        return area_C;
    }
 
}
