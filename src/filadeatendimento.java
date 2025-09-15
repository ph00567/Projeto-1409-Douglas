// Pacote pode ser alterado conforme a estrutura do seu projeto
package clinicamanager;

import java.util.Stack;

/**
 * Gerencia o histórico de pacientes já atendidos, utilizando uma Stack.
 * Segue o princípio LIFO (Last-In, First-Out).
 */
public class PilhaHistoricoAtendimentos {

    // Utiliza a classe Stack para armazenar o histórico.
    private Stack<Paciente> historico;

    public PilhaHistoricoAtendimentos() {
        this.historico = new Stack<>();
    }

    /**
     * Adiciona um paciente atendido ao topo da pilha de histórico.
     * @param p O paciente que foi atendido.
     */
    public void adicionarAoHistorico(Paciente p) {
        historico.push(p);
    }

    /**
     * Retorna o último paciente atendido (o que está no topo da pilha) sem removê-lo.
     * @return O último paciente atendido ou null se o histórico estiver vazio.
     */
    public Paciente verUltimoAtendido() {
        if (!historico.isEmpty()) {
            return historico.peek();
        }
        return null;
    }

    /**
     * Imprime no console o histórico de atendimentos, do mais recente para o mais antigo.
     * A iteração é feita com um laço for tradicional, conforme requisito.
     */
    public void mostrarHistorico() {
        System.out.println("\n--- Histórico de Atendimentos (do mais recente ao mais antigo) ---");
        if (historico.isEmpty()) {
            System.out.println("Nenhum paciente foi atendido ainda.");
        } else {
            // Itera do topo da pilha (índice size - 1) até a base (índice 0).
            for (int i = historico.size() - 1; i >= 0; i--) {
                Paciente p = historico.get(i);
                System.out.println(p.exibirInfo());
            }
        }
        System.out.println("----------------------------------------------------------------");
    }
}