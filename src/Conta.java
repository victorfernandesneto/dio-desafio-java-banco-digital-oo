public class Conta implements IConta {
    private static int SEQUENCIAL = 1;

    private Cliente cliente;
    private String tipo;
    private int numero;
    protected double saldo;

    public Conta(Cliente cliente, String tipo) {
        this.cliente = cliente;
        this.tipo = tipo;
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
        cliente.setContas(this);
    }


    @Override
    public void sacar(double valor) {
        if(saldo > valor){
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }


    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(saldo > valor){
            saldo -= valor;
            contaDestino.depositar(valor);
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("-- Imprimindo extrato da Conta " + this.tipo + " do cliente " + this.cliente + " --");
        System.out.println("Saldo: " + this.saldo);
    }
}
