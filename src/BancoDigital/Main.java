package BancoDigital;

public class Main {
    public static void main(String[] args) {
        Banco Itau = new Banco("Itau");
        Cliente Ariel = new Cliente("Ariel Prado");
        Cliente Taise = new Cliente("Taise Quadros");

        Conta cc = new ContaCorrente(Ariel);
        Conta poupanca = new ContaPoupanca(Taise);

        cc.depositar(120);
        cc.transferir(20,poupanca);
        poupanca.sacar(50);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


        Itau.adicionarConta(poupanca);
        Itau.adicionarConta(cc);

        Itau.imprimirContas();
        Itau.imprimirClientes();

    }
}
