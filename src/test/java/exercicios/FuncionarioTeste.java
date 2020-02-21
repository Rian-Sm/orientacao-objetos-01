package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FuncionarioTeste {

    @Test
    public void criarObjFuncionario(){
        Funcionario p1 = new Funcionario();
        assertNotNull(p1);
    }
}
