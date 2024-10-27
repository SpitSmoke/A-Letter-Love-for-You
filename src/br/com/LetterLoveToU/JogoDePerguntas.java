package br.com.Lambdas;

import java.util.Scanner;

public class JogoDePerguntas {
    public void jogar(Scanner scanner) {
        int acertos = 0;

        System.out.println("Vamos ver o quanto você me conhece!");

        System.out.println("Qual é a minha cor favorita?");
        String resposta1 = scanner.nextLine();
        if (resposta1.equalsIgnoreCase("Roxo")) {
            acertos++;
        }

        System.out.println("Aonde nos conhecemos?");
        String resposta2 = scanner.nextLine();
        if (resposta2.equalsIgnoreCase("Littles")) {
            acertos++;
        }

        System.out.println("Quando fumamos o primeiro beck juntos?");
        String resposta3 = scanner.nextLine();
        if (resposta3.equalsIgnoreCase("Littles")) {
            acertos++;
        }

        System.out.println("O que fazemos quando vemos horários iguais?");
        String resposta4 = scanner.nextLine();
        if (resposta4.equalsIgnoreCase("Dizemos que nos amamos")) {
            acertos++;
        }

        System.out.println("Qual minha comida favorita?");
        String resposta5 = scanner.nextLine();
        if (resposta5.equalsIgnoreCase("Strogonoff")) {
            acertos++;
        }

        System.out.println("Que dia eu faço aniversário?");
        String resposta6 = scanner.nextLine();
        if (resposta6.equalsIgnoreCase("16/09/2001")) {
            acertos++;
        }

        System.out.println("Você acertou " + acertos + " de 6 perguntas.");
        System.out.println("Você é a melhor escolha que eu já fiz na vida! Eu te amo muito!");
    }
}
