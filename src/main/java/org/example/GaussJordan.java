package org.example;
import java.util.Scanner;
public class GaussJordan {

        public static void main(String[] args) {
            Scanner Teclado = new Scanner(System.in);


            System.out.print("Ingrese la cantidad de ecuaciones y de variables del sistema: ");
            int numero = Teclado.nextInt();

            double[][] matriz = new double[numero][numero+1];

            System.out.println("Ingrese los coeficientes de cada ecuación incluyendo el resultado:");
            for (int i = 0; i < numero; i++) {
                System.out.println("Ecuación " + (i+1) + ":");
                for (int j = 0; j < numero+1; j++) {
                    System.out.println("(" +(i+1)+ "," +(j+1) +")");
                    matriz[i][j] = Teclado.nextDouble();
                }

            }

            for (int i = 0; i < numero; i++) {

                double pivote = matriz[i][i];

                for (int j = 0; j < numero+1; j++) {
                    matriz[i][j] /= pivote;
                }

                for (int k = 0; k < numero; k++) {
                    if (k != i) {
                        double factor = matriz[k][i];
                        for (int j = 0; j < numero+1; j++) {
                            matriz[k][j] -= factor * matriz[i][j];
                        }
                    }
                }
            }

            System.out.println("Solución:");
            for (int i = 0; i < numero; i++) {
                System.out.println("X" + (i+1) + " = " + matriz[i][numero]);
            }
        }
    }

