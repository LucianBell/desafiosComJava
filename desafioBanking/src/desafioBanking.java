import java.util.Scanner;

public class desafioBanking {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        boolean usuarioExistente = false;
        String nomeUsuario = "";
        double saldoUsuario = 0;

        if (usuarioExistente == false) {
            System.out.println("Vamos começar o seu registro! Qual seu nome?");
            nomeUsuario = leitura.nextLine();
            System.out.println("Muito bom ter você aqui! Qual é seu saldo inicial?");
            saldoUsuario = leitura.nextDouble();
            usuarioExistente = true;
        }
        String menuInicial = String.format("""
                ****************************************
                * Nome: %s.                            
                * Tipo de conta: corrente.             
                * Saldo: %f.                           
                ****************************************
                """, nomeUsuario, saldoUsuario);
        System.out.println("Perfeito! Seu registro foi concluído!");
        System.out.println(menuInicial);
        String menuOperacoes = String.format("""
                Qual operação você deseja realizar?
                
                1. Consultar saldo
                2. Receber valor
                3. Transferir valor
                4. Sair
                """);
        System.out.println("Digite 1 para abrir seu menu de opções, ou digite 4 para sair de sua conta.");
        int operacaoSelecionada = leitura.nextInt();

        while (operacaoSelecionada != 4) {
            System.out.println(menuOperacoes);
            operacaoSelecionada = leitura.nextInt();
            if (operacaoSelecionada == 1) {
                System.out.println("Seu saldo é: R$" + saldoUsuario);
            } else if (operacaoSelecionada == 2) {
                System.out.println("Qual valor será recebido?");
                saldoUsuario += leitura.nextDouble();
                System.out.println("Operação realizada! Seu novo saldo é: R$" + saldoUsuario);
            } else if (operacaoSelecionada == 3) {
                System.out.println("Qual valor será transferido?");
                double valorTransferido = leitura.nextDouble();
                if (valorTransferido > saldoUsuario) {
                    System.out.println("Operação inválida, você não tem saldo para realizar a transferência");
                } else {
                    saldoUsuario -= valorTransferido;
                    System.out.println("Operação realizada! Seu novo saldo é: R$" + saldoUsuario);
                }
            } else if (operacaoSelecionada == 4) {
                System.out.println("Saindo da conta");
            } else {
                System.out.println("Operação inválida, escolha uma nova operação");
            }
        }
    }

}