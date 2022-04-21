package actividad11;
import java.util.Scanner;
public class Menu {
Scanner leer = new Scanner (System.in); 

static void menu (){
    System.out.println("**********MENÚ**********");
    System.out.println("************************");
    System.out.println("*Selecciona una opción* ");
    System.out.println("*****1.Triangulo********");
    System.out.println("*****2.Cuadrado*********");
    System.out.println("*****3.Circulo**********");
    System.out.println("*****4.Salir************");
}

static void submenu(){
    System.out.println("************************");
    System.out.println("*Selecciona una opción* ");
    System.out.println("*********1.Área*********");
    System.out.println("*********2.Perímetro****");
}
   
}
