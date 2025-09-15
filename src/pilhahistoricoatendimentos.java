
package clinicamanager;

import java.util.LinkedList;

/**

 */
public class FilaDeAtendimento {

    
    private LinkedList<Paciente> fila;

    public FilaDeAtendimento() {
        this.fila = new LinkedList<>();
    }

    /**
    
     */
    public void adicionarPaciente(Paciente p) {
        fila.add(p); // Adiciona o elemento no final da lista.
    }

    /**
     */
    public Paciente atenderPaciente() {
        if (!estaVazia()) {
            return fila.removeFirst(); 
        }
        return null;
    }

    /**
     */
    public boolean estaVazia() {
        return fila.isEmpty();
    }

    /**
     */
    public void mostrarFila() {
        System.out.println("\n--- Fila de Atendimento Atual ---");
        if (estaVazia()) {
            System.out.println("A fila está vazia.");
        } else {
            for (Paciente p : fila) {
                System.out.println(p.exibirInfo());
            }
        }
        System.out.println("---------------------------------");
    }
}
