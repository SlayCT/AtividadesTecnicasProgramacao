package br.edu.fatecpg.Array;
import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        // Preenchendo o array
        for (int i = 0; i < 10; i++) {

            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextInt();
        }

        // Alterando os numeros
        for (int i = 0; i < 10; i++) {

            if (numeros[i] % 2 == 0) {
                // Número par
                numeros[i] = numeros[i] + 1;
            } else {
                // Número ímpar
                numeros[i] = numeros[i] - 1;
            }
        }

        // novo array
        System.out.println("\nNovos valores do array:");

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        entrada.close();
    }
}