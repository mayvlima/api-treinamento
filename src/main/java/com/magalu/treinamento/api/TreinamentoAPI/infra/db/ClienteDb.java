package com.magalu.treinamento.api.TreinamentoAPI.infra.db;

import com.magalu.treinamento.api.TreinamentoAPI.domain.entidades.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDb {
    public static List<Cliente> clientes = new ArrayList<Cliente>();

    public static void popularDados() {
        for(int i = 1; i <= 5; i++){
            Cliente cliente = new Cliente();
            cliente.setNome("Aluno " + i);
            cliente.setCpf("0000000-" + i);
            cliente.setTelefone("(00)0000-000"+i);
            Integer senha = i*4000;
            cliente.setSenha(senha.toString());
            ClienteDb.clientes.add(cliente);


        }

    }
}
