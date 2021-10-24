package testeIngenuoCalculadora;

import calculadoraSimples.Calculadora;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

/**
 *
 * @author jony_
 */
public class CalculadoraTeste {
    
    
    @Test    
    public void testeSomaMenosIngenuo(){
        Calculadora calculadora = new Calculadora();
        
        boolean temErro = false;
        if(calculadora.soma(2, 2) != 4){
            temErro = true;
        }
        if(calculadora.soma(2, -2) != 0){
            temErro = true;
        }
        if(calculadora.soma(-2, 2) != 0){
            temErro = true;
        }
        if(calculadora.soma(-2, -2) != -4){
            temErro = true;
        }
        if(calculadora.soma(0, 0) != 0){
            temErro = true;
        }
        if(temErro){
            fail("\n\n## HOUVE UM ERRO NA VALIDAÇÃO DA SOMA ##\n\n");
        }
                
    }
    
}
