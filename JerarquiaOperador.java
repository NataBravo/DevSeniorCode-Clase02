/*
En este reto deberás programar la operación matemática "6 / 2 ( 1 + 2 )" utilizando las instrucciones necesarias.

¿Cuál es el resultado correcto de la operación? ¿1 ó 9?
Rta: Es 9

Explique por que la otra calculadora genera un resultado diferente.
Rta: Porque realiza la operacion de derecha a izquierda sin tener encuenta la jeraquia de operadores.
  */
  
public class JerarquiaOperador {
    public static void main(String[] args) {
        var operacion = 6/2*(1+2);
        System.out.println("El resultado de la operacion es: "+operacion);
    }
}
