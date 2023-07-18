package br.com.projeto.carrinho.model;

public class Produto {

    private String nomeProduto;
    private double custoProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getCustoProduto() {
        return custoProduto;
    }

    public void setCustoProduto(double custoProduto) {
        this.custoProduto = custoProduto;
    }

    public Produto(String nomeProduto, double custoProduto) {
        this.nomeProduto = nomeProduto;
        this.custoProduto = custoProduto;
    }

    @Override
    public String toString() {
        return nomeProduto + " - " + custoProduto;
    }
}
