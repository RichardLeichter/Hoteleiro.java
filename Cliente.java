public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;

    public Cliente() {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "telefone: " + telefone;
    }
}
