package br.edu.fatecpg.Matriz;
import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        int soma = 0;
        int quantidadePares = 0;

        // Preenchendo a matriz
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Digite um número: ");
                matriz[i][j] = entrada.nextInt();

                soma += matriz[i][j];

                if (matriz[i][j] % 2 == 0) {
                    quantidadePares++;
                }
            }
        }

        // Exibindo a matriz
        System.out.println("\n===== MATRIZ =====");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println();
        }

        double media = (double) soma / 9;

        System.out.println("\nSoma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Quantidade de números pares: " + quantidadePares);

        entrada.close();
    }
}