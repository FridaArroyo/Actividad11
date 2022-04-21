package actividad11;
public class gePerimetro {
    
    static float Triangulo (float Tb, float Ta){
        float perimetro_T = Tb * 3;
        return perimetro_T;
    }
    
    static float Cuadrado (float Cl){
        float perimetro_C = Cl*4;
        return perimetro_C;
    }
    
    static double Circulo (float radio){
        double pi=3.1416;
        double perimetro_C = pi * radio * 2 ;
        return perimetro_C;
    }
    
    
}
