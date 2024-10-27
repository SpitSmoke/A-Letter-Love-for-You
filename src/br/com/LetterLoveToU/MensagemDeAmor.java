package br.com.Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MensagemDeAmor {
    private List<String> mensagens;

    public MensagemDeAmor() {
        mensagens = new ArrayList<>();
    }

    public void adicionarMensagem(String mensagem) {
        mensagens.add(mensagem);
    }

    public String obterMensagemAleatoria() {
        Random random = new Random();
        return mensagens.get(random.nextInt(mensagens.size()));
    }

    public static void main(String[] args) {
        MensagemDeAmor mensagemDeAmor = new MensagemDeAmor();
        mensagemDeAmor.adicionarMensagem("Você é a razão do meu sorriso.");
        mensagemDeAmor.adicionarMensagem("Eu te amo mais a cada dia.");
        mensagemDeAmor.adicionarMensagem("Você faz meu coração bater mais forte.");

        System.out.println(mensagemDeAmor.obterMensagemAleatoria());
    }
}
