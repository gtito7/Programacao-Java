import java.util.Scanner;

public class calculadora {

    // Operacoes disponiveis
    static int soma() {
        return 1;
    }

    static int subtracao() {
        return 2;
    }

    static int multiplicacao() {
        return 3;
    }

    static int divisao() {
        return 4;
    }

    // Metodo para calcular
    static void calcular(double a, double b, int operacao) {

        if (operacao == soma()) {
            System.out.println("Resultado: " + (a + b));

        } else if (operacao == subtracao()) {
            System.out.println("Resultado: " + (a - b));

        } else if (operacao == multiplicacao()) {
            System.out.println("Resultado: " + (a * b));

        } else if (operacao == divisao()) {

            if (b == 0) {
                System.out.println("Erro: divisao por zero!");
            } else {
                System.out.println("Resultado: " + (a / b));
            }

        } else {
            System.out.println("Operacao invalida!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = sc.nextDouble();

        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.print("Opcao: ");
        int opcao = sc.nextInt();

        calcular(num1, num2, opcao);

        sc.close();
    }
}