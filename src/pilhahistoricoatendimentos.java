// Pacote pode ser alterado conforme a estrutura do seu projeto
package clinicamanager;

import java.util.LinkedList;

/**
 * Gerencia a fila de pacientes para atendimento, utilizando um LinkedList.
 * Segue o princípio FIFO (First-In, First-Out).
 */
public class FilaDeAtendimento {

    // Utiliza LinkedList como base para a estrutura de fila.
    private LinkedList<Paciente> fila;

    public FilaDeAtendimento() {
        this.fila = new LinkedList<>();
    }

    /**
     * Adiciona um paciente ao final da fila.
     * @param p O paciente a ser adicionado.
     */
    public void adicionarPaciente(Paciente p) {
        fila.add(p); // Adiciona o elemento no final da lista.
    }

    /**
     * Remove e retorna o primeiro paciente da fila (o próximo a ser atendido).
     * @return O paciente atendido ou null se a fila estiver vazia.
     */
    public Paciente atenderPaciente() {
        if (!estaVazia()) {
            return fila.removeFirst(); // Remove e retorna o primeiro elemento.
        }
        return null;
    }

    /**
     * Verifica se a fila de atendimento está vazia.
     * @return true se a fila estiver vazia, false caso contrário.
     */
    public boolean estaVazia() {
        return fila.isEmpty();
    }

    /**
     * Imprime no console todos os pacientes que estão na fila, em ordem de chegada.
     */
    public void mostrarFila() {
        System.out.println("\n--- Fila de Atendimento Atual ---");
        if (estaVazia()) {
            System.out.println("A fila está vazia.");
        } else {
            for (Paciente p : fila) {
                // Utiliza o método exibirInfo() do objeto Paciente para mostrar os dados.
                System.out.println(p.exibirInfo());
            }
        }
        System.out.println("---------------------------------");
    }
}