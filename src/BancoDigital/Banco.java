package BancoDigital;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas = new ArrayList<>();
    public Banco(String nome) {
        this.nome = nome;
    }

    private List<Cliente> clientes = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        if(!clientes.contains(conta.cliente)) {
            clientes.add(conta.cliente);
        }
    }

    protected void imprimirContas() {
        System.out.println(String.format("=== Contas do Banco %s ===",this.getNome()));
        for (Conta conta:this.contas) {
            System.out.println(String.format("Agencia: %d", conta.getAgencia()));
            System.out.println(String.format("Conta: %d", conta.getNumero()));

            if(conta instanceof ContaCorrente) {
                System.out.println("Tipo: Conta Corrente");
            } else if (conta instanceof ContaPoupanca) {
                System.out.println("Tipo: Conta Poupanca");
            }
            System.out.println(String.format("Cliente: %s", conta.cliente.getNome()));
            System.out.println(String.format("Saldo: %.2f\n", conta.getSaldo()));
        }
    }

    protected void imprimirClientes() {
        System.out.println(String.format("=== Clientes do Banco %s ===",this.getNome()));
        for(Cliente cliente: clientes) {
            System.out.println(String.format("Cliente: %s",cliente.getNome()));
        }
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

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

}
