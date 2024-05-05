import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    protected List<Conta> contas;

    @Override
    public String toString() {
        return this.nome;
    }

    public Cliente(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(Conta conta) {
        this.contas.add(conta);
    }
}
