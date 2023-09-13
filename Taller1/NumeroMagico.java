package Taller1;

import java.util.Scanner;

public class NumeroMagico {
    public static Scanner Input;

    public static void main(String[] args) {
        System.out.println("Ejercicio 4. Número mágico.");
        Input = new Scanner(System.in);

        System.out.println("Ingrese un numero entero por favor: ");
        int numero = Integer.parseInt(Input.nextLine());

        if ((numero % 5 == 0) && (numero % 2 != 0) && (numero % 3 != 0)) {
            System.out.println("El numero ingresado es un número mágico");
        } else {
            System.out.println("El numero ingresado no es un número mágico");
        }
    }
}
