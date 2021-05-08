package com.magalu.treinamento.api.TreinamentoAPI.domain.modelViews;

public class ClienteMessage {

    private String mensagem;

    public ClienteMessage(String mensagem){
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
