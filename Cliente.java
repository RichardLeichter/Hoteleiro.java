import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private List<Cliente> cliente;

    public Cliente() {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cliente = new ArrayList<>();
    }

    public List<Cliente> nomeCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "telefone: " + telefone;
    }
}
