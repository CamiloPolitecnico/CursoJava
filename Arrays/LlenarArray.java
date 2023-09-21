package Arrays;

import java.util.Scanner;

public class LlenarArray {

      public static void main(String[] args) {

        String[] cadenas = new String[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i< 5; i++) {
            System.out.println("Por favor ingrese mensaje "+(i+1)+" : ");
            cadenas[i] = input.nextLine();
        }


        System.out.println("La cadenas ingresadas fueron:\n");
        for (String cadena : cadenas) {
            System.out.println(cadena);
        }

        input.close();
    }
}
