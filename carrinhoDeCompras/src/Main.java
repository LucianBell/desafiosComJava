import br.com.projeto.carrinho.model.Cliente;
import br.com.projeto.carrinho.model.Produto;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome, produto;
        double saldo, custo, gasto = 0;
        int vaiContinuarComprando = 1, contador = 0;
        List<Produto> produtosComprados = new ArrayList<>();

        System.out.println("Bem-vindo ao Lucy's Ultra Compras!");

        System.out.println("Primeiro, qual o seu nome?");
        nome = leitura.nextLine();
        System.out.println("Qual é o seu saldo hoje?");
        saldo = leitura.nextDouble();

        Cliente novoCliente = new Cliente(nome, saldo);

        System.out.println("*****************NOVO CLIENTE*****************");
        System.out.println("Seu nome é " + novoCliente.getNomeCliente());
        System.out.println("Seu saldo é " + novoCliente.getSaldoCliente());
        System.out.println("**********************************************");

        while (vaiContinuarComprando != 0 && novoCliente.getSaldoCliente() > gasto) {
            System.out.println("Qual produto você gostaria de comprar?");
            produto = leitura.next();
            System.out.println("Perfeito! E qual o preço do produto escolhido?");
            custo = leitura.nextDouble();
            Produto novoProduto = new Produto(produto, custo);
            gasto += novoProduto.getCustoProduto();
            produtosComprados.add(novoProduto);

            System.out.println("Gostaria de continuar comprando?");
            vaiContinuarComprando = leitura.nextInt();
            contador++;

            if (novoCliente.getSaldoCliente() < gasto) {
                System.out.println("Desculpe, seu saldo é insuficiente");
                gasto -= novoProduto.getCustoProduto();
                produtosComprados.remove(contador - 1);
                break;
            }
        }

        System.out.println("Finalizando compra");
        System.out.println("****************RECIBO****************");
        produtosComprados.sort(Comparator.comparing(Produto::getCustoProduto));
        for (Produto item: produtosComprados) {
            System.out.println(item.toString());
        }
        System.out.println("Total das compras: R$" + gasto);
        System.out.println("**************************************");

        System.out.println("Seu saldo restante: R$" + (novoCliente.getSaldoCliente() - gasto));

    }
}