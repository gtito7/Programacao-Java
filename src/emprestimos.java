import java.util.Scanner;

public class emprestimos {

    // retorna quantidade de parcelas
    static int duasParcelas() {
        return 2;
    }

    static int tresParcelas() {
        return 3;
    }

    // retorna taxas
    static double taxaDuasParcelas() {
        return 0.30;
    }

    static double taxaTresParcelas() {
        return 0.45;
    }

    // calcula o valor final
    static void calcular(double valor, int parcelas) {

        if (parcelas == duasParcelas()) {

            double valorFinal = valor + (valor * taxaDuasParcelas());
            System.out.println("Valor final para 2 parcelas: R$ " + valorFinal);

        } else if (parcelas == tresParcelas()) {

            double valorFinal = valor + (valor * taxaTresParcelas());
            System.out.println("Valor final para 3 parcelas: R$ " + valorFinal);

        } else {
            System.out.println("Quantidade de parcelas invalida.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do emprestimo: ");
        double valor = sc.nextDouble();

        System.out.print("Digite a quantidade de parcelas (2 ou 3): ");
        int parcelas = sc.nextInt();

        calcular(valor, parcelas);

        sc.close();
    }
}
