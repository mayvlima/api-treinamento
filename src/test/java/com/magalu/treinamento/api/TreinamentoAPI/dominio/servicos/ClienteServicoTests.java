package com.magalu.treinamento.api.TreinamentoAPI.dominio.servicos;


import com.magalu.treinamento.api.TreinamentoAPI.domain.entidades.Cliente;
import com.magalu.treinamento.api.TreinamentoAPI.domain.servicos.ClienteServico;
import com.magalu.treinamento.api.TreinamentoAPI.infra.db.ClienteDb;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClienteServicoTests {

    @Test
    void salvarCliente() {
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNome("Aluno");
        cliente.setCpf("0000000");
        cliente.setTelefone("(00)0000-000");
        cliente.setSenha("12375");
        ClienteDb.clientes.add(cliente);

        Assert.assertEquals(ClienteServico.Lista().size(), 1);
    }

}
