package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    @Test
    public void metodoObterDados(){
        Funcionario p1 = new Funcionario();
        p1.nome = "João da Silva";
        p1.email = "joao@email.com";
        p1.idade = 22;
        String valorEsperado = (p1.nome +", " + p1.idade + " anos (" + p1.email + ")" );

        assertEquals(valorEsperado, p1.obterDados());
    }

    @Test
    public void metodoPromover(){
        Funcionario p1 = new Funcionario();
        Double porcentagemAulmento = 10.0;
        p1.salario = 3000.0;
        Double valorEsperado = p1.salario + (p1.salario * porcentagemAulmento)/100;

        p1.promover(porcentagemAulmento);

        assertEquals(valorEsperado, p1.salario);
    }
}
