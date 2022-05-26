package banco.dio;

public class Main {
    public static void main(String[] args) {
        Cliente Karol = new Cliente();
        Karol.setNome(("Karol"));

        Conta cc = new ContaCorrente(Karol);
        Conta poupanca = new ContaPoupanca(Karol);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
