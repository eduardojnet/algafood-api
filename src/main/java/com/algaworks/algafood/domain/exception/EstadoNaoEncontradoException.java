package com.algaworks.algafood.domain.exception;

public class EstadoNaoEncontradoException extends EntidadeNaoEncontradaException{

    public EstadoNaoEncontradoException(String mensagem){
        super(mensagem);
    }

    public EstadoNaoEncontradoException(Long estadoId){
        this(String.format("Não existe um cadastro de estado com codigo %d", estadoId));
    }

}
