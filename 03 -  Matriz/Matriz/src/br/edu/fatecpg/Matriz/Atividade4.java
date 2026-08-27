package br.edu.fatecpg.Matriz;
import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        // Fazendo a Matriz
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Digite um número: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        int opcao = 0;

        while (opcao != 3) {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Buscar número");
            System.out.println("2 - Exibir matriz");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:

                    System.out.print("\nDigite o número de busca: ");
                    int busca = entrada.nextInt();

                    boolean encontrado = false;

                    // Percorrendo a matriz
                    for (int i = 0; i < 3 && !encontrado; i++) {

                        for (int j = 0; j < 3; j++) {

                            if (matriz[i][j] == busca) {

                                System.out.println(
                                    "Número encontrado na linha " + i +
                                    " e coluna " + j
                                );

                                encontrado = true;

                                break;
                            }
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Número não encontrado.");
                    }

                    break;

                case 2:

                    System.out.println("\n===== MATRIZ =====");

                    for (int i = 0; i < 3; i++) {

                        for (int j = 0; j < 3; j++) {
                            System.out.print(matriz[i][j] + "\t");
                        }

                        System.out.println();
                    }

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