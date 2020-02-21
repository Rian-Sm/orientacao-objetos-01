package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CorrentistaTeste {

    @Test
    public void criacaoObjCorrentista(){
        Correntista c1 = new Correntista();
        assertNotNull(c1);
    }
}
