package Exercicio1;
import java.util.Scanner;

public class bomDia {

    static void obterMensagem(int hora) {

        if (hora >= 5 && hora <= 12) {
            mensagemBomDia();

        } else if (hora >= 13 && hora <= 17) {
            mensagemBoaTarde();

        } else if ((hora >= 18 && hora <= 23) || (hora >= 0 && hora <= 4)) {
            mensagemBoaNoite();

        } else {
            System.out.println("Hora invalida.");
        }
    }

    static void mensagemBomDia() {
        System.out.println("Bom dia!");
    }

    static void mensagemBoaTarde() {
        System.out.println("Boa tarde!");
    }

    static void mensagemBoaNoite() {
        System.out.println("Boa noite!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora (0 a 23): ");
        int hora = sc.nextInt();

        obterMensagem(hora);

        sc.close();
    }
}
