package br.edu.fatecpg.Matriz;
import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        // Preenchimento da matriz
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Digite um número positivo: ");
                int numero = entrada.nextInt();

                // Enquanto o número for negativo
                while (numero < 0) {

                    System.out.println("ERRO! Digite apenas números positivos.");
                    System.out.print("Digite novamente: ");

                    numero = entrada.nextInt();
                }

                matriz[i][j] = numero;
            }
        }

        int opcao = 0;

        while (opcao != 3) {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Somar linhas pares (0 e 2)");
            System.out.println("2 - Somar coluna ímpar (1)");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");

            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:

                    int somaLinhas = 0;

                    // Linha 0
                    for (int j = 0; j < 3; j++) {
                        somaLinhas += matriz[0][j];
                    }

                    // Linha 2
                    for (int j = 0; j < 3; j++) {
                        somaLinhas += matriz[2][j];
                    }

                    System.out.println("Soma das linhas 0 e 2: " + somaLinhas);

                    break;

                case 2:

                    int somaColuna = 0;

                    // Coluna 1
                    for (int i = 0; i < 3; i++) {
                        somaColuna += matriz[i][1];
                    }

                    System.out.println("Soma da coluna 1: " + somaColuna);

                    break;

                case 3:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        entrada.close();
    }
}