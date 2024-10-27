package br.com.Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Diario {
    private List<String> memorias;

    public Diario() {
        memorias = new ArrayList<>();
    }

    public void adicionarMemoria(String memoria) {
        memorias.add(memoria);
    }

    public void mostrarMemorias() {
        System.out.println("Nossas Memórias:");
        for (String memoria : memorias) {
            System.out.println("- " + memoria);
        }
    }


    public void gerenciarDiario(Scanner scanner) {
        String continuar;
        do {
            System.out.println("Digite uma memória que você gostaria de adicionar:");
            String memoria = scanner.nextLine();
            adicionarMemoria(memoria);

            System.out.println("Deseja adicionar outra memória? (s/n)");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        mostrarMemorias();
    }
}
