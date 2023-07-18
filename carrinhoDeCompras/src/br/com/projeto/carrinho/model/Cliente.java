package br.com.projeto.carrinho.model;

public class Cliente {

    private String nomeCliente;
    private  double saldoCliente;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldoCliente() {
        return saldoCliente;
    }

    public void setSaldoCliente(double saldoCliente) {
        this.saldoCliente = saldoCliente;
    }


    public Cliente(String nomeCliente, double saldoCliente) {
        this.nomeCliente = nomeCliente;
        this.saldoCliente = saldoCliente;
    }
}
