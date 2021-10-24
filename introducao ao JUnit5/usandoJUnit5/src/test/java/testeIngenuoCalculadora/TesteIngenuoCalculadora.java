package testeIngenuoCalculadora;

import calculadoraSimples.Calculadora;

/**
 *
 * @author jony_
 */
public class TesteIngenuoCalculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        if(temErroNaSoma(calculadora)){
            System.exit(1);
        }
        if(subtracaoEstaOk(calculadora) == false){
            System.out.println("\n\n## HOUVE UM ERRO NA VALIDAÇÃO DA SOMA ##\n\n ");
            System.exit(1);
        }
        System.out.println("Todos os testes passaram.");
        System.exit(0);                       
    }
    
        private static boolean temErroNaSoma( Calculadora calculadora){
            boolean temErro = false;
            if(calculadora.soma(2, 2) != 4){
                temErro = true;
            }
            if(calculadora.soma(2, -2) != 0){
                temErro = true;
            }if(calculadora.soma(-2, 2) != 0){
                temErro = true;
            }
            if(calculadora.soma(-2, -2) != -4){
                temErro = true;
            }if(calculadora.soma(0, 0) != 0){
                temErro = true;
            }
            if(temErro){
                System.out.println("\n\n## HOUVE UM ERRO NA VALIDAÇÃO DA SOMA ##\n\n");
            }
            return temErro;
        }
        
        private static boolean subtracaoEstaOk( Calculadora calculadora){
            boolean temErro = false;
            if(calculadora.subtracao(2, 2) != 0){
                temErro = true;
            }
            if(calculadora.subtracao(2, -2) != 4){
                temErro = true;
            }if(calculadora.subtracao(-2, 2) != -4){
                temErro = true;
            }
            if(calculadora.subtracao(-2, -2) != 0){
                temErro = true;
            }if(calculadora.subtracao(0, 0) != 0){
                temErro = true;
            }
            if(temErro){
                System.out.println("\n\n## HOUVE UM ERRO NA VALIDAÇÃO DA SUBTRAÇÃO ##\n\n");
            }
            return temErro;
        }
}
