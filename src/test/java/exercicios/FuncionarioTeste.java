package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FuncionarioTeste {

    @Test
    public void criarObjFuncionario(){
        Funcionario p1 = new Funcionario();
        assertNotNull(p1);
    }

    @Test
    public void presencaAtributos(){
        Funcionario p1 = new Funcionario();
        p1.nome = "João da Silva";
        p1.email = "joao@email.com";
        p1.idade = 22;
        p1.salario = 3000.0;

        assertNotNull(p1.nome);
        assertNotNull(p1.email);
        assertNotNull(p1.idade);
        assertNotNull(p1.salario);
    }
}
