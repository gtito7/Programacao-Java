package Exercicio1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== MENU PRINCIPAL ===");
        System.out.println("1 - Calculadora");
        System.out.println("2 - Emprestimo");
        System.out.println("3 - Mensagem");
        System.out.print("Escolha uma opcao: ");

        int opcao = sc.nextInt();

        if (opcao == 1) {

            System.out.print("Digite o primeiro numero: ");
            double a = sc.nextDouble();

            System.out.print("Digite o segundo numero: ");
            double b = sc.nextDouble();

            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao");
            System.out.print("Opcao: ");
            int operacao = sc.nextInt();

            calculadora.calcular(a, b, operacao);

        } else if (opcao == 2) {

            System.out.print("Digite o valor do emprestimo: ");
            double valor = sc.nextDouble();

            System.out.print("Digite a quantidade de parcelas (2 ou 3): ");
            int parcelas = sc.nextInt();

            emprestimos.calcular(valor, parcelas);

        } else if (opcao == 3) {

            System.out.print("Digite a hora (0 a 23): ");
            int hora = sc.nextInt();

            bomDia.obterMensagem(hora);

        } else {
            System.out.println("Opcao invalida.");
        }

        sc.close();
    }
}