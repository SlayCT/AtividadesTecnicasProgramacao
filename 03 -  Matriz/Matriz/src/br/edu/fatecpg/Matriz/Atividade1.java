package br.edu.fatecpg.Matriz;
import java.util.Scanner;

	public class Atividade1 {

	    public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);

	        String[][] contatos = new String[5][3];

	        // Preenche a matriz inicialmente com DISPONÍVEL
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 3; j++) {
	                contatos[i][j] = "DISPONÍVEL";
	            }
	        }

	        int opcao = 0;

	        while (opcao != 4) {

	            System.out.println("\n===== LISTA DE CONTATOS =====");
	            System.out.println("1 - Adicionar contato");
	            System.out.println("2 - Remover contato");
	            System.out.println("3 - Exibir contato");
	            System.out.println("4 - Sair");
	            System.out.print("Escolha uma opção: ");

	            opcao = entrada.nextInt();
	            entrada.nextLine();

	            switch (opcao) {

	                case 1:
	                    System.out.print("Digite o índice do contato (0 a 4): ");
	                    int indice = entrada.nextInt();
	                    entrada.nextLine();

	                    if (indice >= 0 && indice < 5) {

	                        if (contatos[indice][0].equals("DISPONÍVEL")) {

	                            System.out.print("Nome: ");
	                            contatos[indice][0] = entrada.nextLine();

	                            System.out.print("E-mail: ");
	                            contatos[indice][1] = entrada.nextLine();

	                            System.out.print("WhatsApp: ");
	                            contatos[indice][2] = entrada.nextLine();

	                            System.out.println("Contato adicionado!");

	                        } else {
	                            System.out.println("Essa posição já está ocupada.");
	                        }

	                    } else {
	                        System.out.println("Índice inválido.");
	                    }

	                    break;

	                case 2:
	                    System.out.print("Digite o índice do contato que deseja remover (0 a 4): ");
	                    indice = entrada.nextInt();

	                    if (indice >= 0 && indice < 5) {

	                        contatos[indice][0] = "DISPONÍVEL";
	                        contatos[indice][1] = "DISPONÍVEL";
	                        contatos[indice][2] = "DISPONÍVEL";

	                        System.out.println("Contato removido!");

	                    } else {
	                        System.out.println("Índice inválido.");
	                    }

	                    break;

	                case 3:
	                    System.out.print("Digite o índice do contato (0 a 4): ");
	                    indice = entrada.nextInt();

	                    if (indice >= 0 && indice < 5) {

	                        System.out.println("\nNome: " + contatos[indice][0]);
	                        System.out.println("E-mail: " + contatos[indice][1]);
	                        System.out.println("WhatsApp: " + contatos[indice][2]);

	                    } else {
	                        System.out.println("Índice inválido.");
	                    }

	                    break;

	                case 4:
	                    System.out.println("Programa encerrado.");
	                    break;

	                default:
	                    System.out.println("Opção inválida.");
	            }
	        }

	        entrada.close();
	    }
	}