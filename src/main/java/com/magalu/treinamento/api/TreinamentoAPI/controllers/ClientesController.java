package com.magalu.treinamento.api.TreinamentoAPI.controllers;

import com.magalu.treinamento.api.TreinamentoAPI.domain.entidades.Cliente;
import com.magalu.treinamento.api.TreinamentoAPI.domain.modelViews.ClienteMessage;
import com.magalu.treinamento.api.TreinamentoAPI.domain.modelViews.ClienteSimples;
import com.magalu.treinamento.api.TreinamentoAPI.domain.modelViews.Home;
import com.magalu.treinamento.api.TreinamentoAPI.domain.servicos.ClienteServico;
import com.magalu.treinamento.api.TreinamentoAPI.infra.db.ClienteDb;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientesController {


    @GetMapping("/clientes")
    public List<ClienteSimples> index(){
        return ClienteServico.Lista();
    }

    @PostMapping("/clientes")
    public Cliente criar(@RequestBody Cliente cliente){
        int index = ClienteServico.getIndex();
        cliente.setId(index);

        ClienteServico.Adicionar(cliente);
        return cliente;
    }

    @DeleteMapping("/clientes/{id}")
    public ClienteMessage deletar(@PathVariable int id){
        ClienteServico.delete(id);
        return new ClienteMessage("Cliente Apagado com sucesso");
    }
}
