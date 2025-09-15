// Pacote pode ser alterado conforme a estrutura do seu projeto
package clinicamanager;

import java.util.Stack;

/**
 */
public class PilhaHistoricoAtendimentos {

    
    private Stack<Paciente> historico;

    public PilhaHistoricoAtendimentos() {
        this.historico = new Stack<>();
    }

    /**
 
     */
    public void adicionarAoHistorico(Paciente p) {
        historico.push(p);
    }

    /**

     */
    public Paciente verUltimoAtendido() {
        if (!historico.isEmpty()) {
            return historico.peek();
        }
        return null;
    }

    /**

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
