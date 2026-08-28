package br.edu.fatecpg.Array;
import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        int quantidadePares = 0;
        int quantidadeImpares = 0;

        // Preenchendo o array
        for (int i = 0; i < 10; i++) {

            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextInt();
        }

        // Contando pares e ímpares
        for (int i = 0; i < 10; i++) {

            if (numeros[i] % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
        }

        // Mostrando quantidade de pares
        System.out.println("\nQuantidade de números pares: " + quantidadePares);

        // Mostrando os pares
        System.out.print("Números pares: ");

        for (int i = 0; i < 10; i++) {

            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        // Mostrando quantidade de ímpares
        System.out.println("\n\nQuantidade de números ímpares: " + quantidadeImpares);

        // Mostrando ímpares
        System.out.print("Números ímpares: ");

        for (int i = 0; i < 10; i++) {

            if (numeros[i] % 2 != 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        entrada.close();
    }
}