package com.algaworks.algafood.domain.exception;

public class CidadeNaoEncontradoException extends EntidadeNaoEncontradaException{

    public CidadeNaoEncontradoException(String mensagem){
        super(mensagem);
    }

    public CidadeNaoEncontradoException(Long estadoId){
        this(String.format("Não existe um cadastro de cidade com codigo %d", estadoId));
    }

}
