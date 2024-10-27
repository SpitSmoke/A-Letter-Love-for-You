package br.com.Lambdas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Bem-vinda ao nosso projeto romântico!");
            System.out.println("1. Jogo de Perguntas");
            System.out.println("2. Diário de Memórias");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    JogoDePerguntas jogo = new JogoDePerguntas();
                    jogo.jogar(scanner);
                    break;
                case 2:
                    Diario diario = new Diario();
                    diario.gerenciarDiario(scanner);
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Tchauzinho! Eu te amo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
