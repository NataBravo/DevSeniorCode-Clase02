/*Escribe un programa que solicite al usuario dos números y luego realice las operaciones de suma, resta, multiplicación y división con esos números. Muestra los resultados en la consola. */

import java.util.Scanner;

public class CalculadoraBasica {
  public static void main(String[] args) {
    var teclado = new Scanner(System.in);
    System.out.println("Bienvenido a la calculadora");
    System.out.println("Introzca un numero");
    var numero1 = teclado.nextInt();
    System.out.println("Introduzca otro numero");
    var numero2 = teclado.nextInt();
    var suma = numero1 + numero2;
    var resta = numero1 - numero2;
    var multiplicacion = numero1 * numero2;
    var division = numero1 / numero2;
    teclado.close();
    System.out.println("Resultados de las siguientes operaciones con sus numeros: "+numero1 + " y " +  numero2 +" son:");
    System.out.println("Multiplicacion: "+ multiplicacion);
    System.out.println("Division: " + division);
    System.out.println("Suma: "+ suma);
    System.out.println("Resta: "+ resta);


  }  
}
