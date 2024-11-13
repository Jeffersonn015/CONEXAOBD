package br.com.aula.conexao;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            // Exibe as opções do menu para o usuário
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1. Inserir Aluno");
            System.out.println("2. Atualizar Aluno");
            System.out.println("3. Deletar Aluno");
            System.out.println("4. Ler registros de Alunos");
            System.out.println("0. Sair");
            System.out.print("Escolha a opção: ");
            
            // Lê a opção escolhida pelo usuário
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do Scanner
            
            // Decide o que fazer com base na opção escolhida
            switch (opcao) {
                case 1:
                    // Inserir Aluno
                    InserirDados.main(null);
                    break;
                case 2:
                    // Atualizar Aluno
                    AtualizarDados.main(null);
                    break;
                case 3:
                    // Deletar Aluno
                    DeletarDados.main(null);
                    break;
                case 4:
                    // Ler registros de Alunos
                    LerDados.main(null);
                    break;
                case 0:
                    // Encerra o programa
                    System.out.println("Saindo...");
                    break;
                default:
                    // Caso o usuário digite uma opção incorreta/inválida das opções passadas
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
        
        scanner.close(); // Fecha o Scanner fora do loop
    }
}
