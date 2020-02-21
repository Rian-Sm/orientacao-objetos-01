package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CorrentistaTeste {

    @Test
    public void criacaoObjCorrentista(){
        Correntista c1 = new Correntista();
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributos(){
        Correntista c1 = new Correntista();
        c1.codigo = "sp436821";
        c1.nome = "José";
        c1.email = "emailcontato@gmail.com";
        c1.telefone = "1234-5678";

        assertNotNull(c1.codigo);
        assertNotNull(c1.nome);
        assertNotNull(c1.email);
        assertNotNull(c1.telefone);
    }
}
