package testeIngenuoCalculadora;

import calculadoraSimples.Calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author jony_
 */
public class CalculadoraTeste2 {
    
    static Calculadora calculadora;
    
    @BeforeAll
    public static void setup(){
        calculadora = new Calculadora();
    }
    
    @Test    
    public void doisMaisDoisTemQueSerQuatro(){     
        assertEquals(4.0, calculadora.soma(2, 2));                
    }
}
