
package clinicamanager;

import java.util.Scanner;


public class GerenciadorClinica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilaDeAtendimento fila = new FilaDeAtendimento();
        PilhaHistoricoAtendimentos historico = new PilhaHistoricoAtendimentos();
        boolean executando = true;

        System.out.println("Bem-vindo ao Sistema de Gerenciamento da Clínica!");

        while (executando) {
            System.out.println("\n===================================================");
            System.out.println("1: Adicionar novo paciente à fila");
            System.out.println("2: Atender próximo paciente");
            System.out.println("3: Exibir fila de atendimento");
            System.out.println("4: Exibir histórico de atendimentos");
            System.out.println("5: Sair");
            System.out.println("===================================================");
            System.out.print("Escolha uma opção: ");

            int opcao = -1; 

           
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            } else {
                System.out.println("\nERRO: Entrada inválida. Por favor, digite um número de 1 a 5.");
                scanner.next(); 
                continue; 
            }
            
            scanner.nextLine(); 

            
            if (opcao == 1) {
                System.out.print("Digite o nome do paciente: ");
                String nome = scanner.nextLine();

                int idade = 0;
                
                while (idade <= 0) {
                    System.out.print("Digite a idade do paciente: ");
                    if (scanner.hasNextInt()) {
                        idade = scanner.nextInt();
                        if (idade <= 0) {
                            System.out.println("ERRO: A idade deve ser um número positivo.");
                        }
                    } else {
                        System.out.println("ERRO: Entrada inválida. Por favor, digite um número para a idade.");
                        scanner.next(); // Limpa a entrada inválida
                    }
                }
                scanner.nextLine(); // Limpa o buffer

                System.out.print("Digite o sintoma do paciente: ");
                String sintoma = scanner.nextLine();

                Paciente novoPaciente = new Paciente(nome, idade, sintoma);
                fila.adicionarPaciente(novoPaciente);
                System.out.println("\nPaciente " + nome + " adicionado à fila com sucesso!");

            } else if (opcao == 2) {
                Paciente pacienteAtendido = fila.atenderPaciente();
                if (pacienteAtendido != null) {
                    historico.adicionarAoHistorico(pacienteAtendido);
                    System.out.println("\nAtendendo paciente...");
                    System.out.println("Dados: " + pacienteAtendido.exibirInfo());
                    System.out.println("Paciente movido para o histórico de atendimentos.");
                } else {
                    System.out.println("\nNão há pacientes na fila para atender.");
                }

            } else if (opcao == 3) {
                fila.mostrarFila();

            } else if (opcao == 4) {
                historico.mostrarHistorico();

            } else if (opcao == 5) {
                executando = false;
                System.out.println("\nEncerrando o sistema. Até logo!");

            } else {
                System.out.println("\nOpção inválida. Por favor, escolha um número de 1 a 5.");
            }
        }

        scanner.close(); 
    }
}