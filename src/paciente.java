
package clinicamanager;


public class Paciente {

    
    private static int proximoId = 1;

    
    private int id;
    private String nome;
    private int idade;
    private String sintoma;

    /**
     * @param nome O nome do paciente.
     * @param idade A idade do paciente.
     * @param sintoma A descrição do sintoma do paciente.
     */
    public Paciente(String nome, int idade, String sintoma) {
        this.id = proximoId++; // Atribui o ID atual e depois incrementa o contador
        this.nome = nome;
        this.idade = idade;
        this.sintoma = sintoma;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    /**
     * @return Uma String formatada com todas as informações do paciente.
     */
    public String exibirInfo() {
        return "ID: " + this.id + " | Nome: " + this.nome + " | Idade: " + this.idade + " | Sintoma: " + this.sintoma;
    }
}