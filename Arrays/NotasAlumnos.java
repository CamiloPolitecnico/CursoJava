package Arrays;

import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        String[] alumnos = new String[2];
        float[] notas = new float[2];
        String[] calificacion = new String[2];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Por favor ingrese nombre alumno " + (i + 1) + " : ");
            alumnos[i] = input.nextLine();

            do {

                System.out.println("Por favor ingrese nota alumno " + (i + 1) + " entre 0 y 10: ");
                notas[i] = Float.parseFloat(input.nextLine());
            } while (!(notas[i] >= 0 && notas[i] <= 10));
        }

        for (int i = 0; i < 2; i++) {
            if (notas[i] >= 0 && notas[i] <= 4.99) {
                calificacion[i] = "El estudiante " + alumnos[i] + " con nota " + notas[i] + " tiene un suspendido";
            } else if (notas[i] >= 5 && notas[i] <= 6.99) {
                calificacion[i] = "El estudiante " + alumnos[i] + " con nota " + notas[i] + " tiene un bien";
            } else if (notas[i] >= 7 && notas[i] <= 8.99) {
                calificacion[i] = "El estudiante " + alumnos[i] + " con nota " + notas[i] + " tiene un notable";
            } else if (notas[i] >= 9 && notas[i] <= 10) {
                calificacion[i] = "El estudiante " + alumnos[i] + " con nota " + notas[i] + " sera sobresaliente";
            }

        }

        System.out.println("Los resultados fueron:\n");
        for (String cali : calificacion) {
            System.out.println(cali);
        }
    }
}
