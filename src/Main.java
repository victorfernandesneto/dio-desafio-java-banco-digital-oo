public class Main {
    public static void main(String[] args) {
        var cliente = new Cliente("Victor");
        var conta1 = new Conta(cliente, "Poupança");
        var conta2 = new Conta(cliente, "Corrente");
        cliente.getContas();
        conta1.depositar(1000);
        conta2.depositar(1234);
        conta1.sacar(1001);
        conta1.sacar(1);
        conta1.transferir(2, conta2);
        conta1.imprimirExtrato();
        conta2.imprimirExtrato();
    }
}
