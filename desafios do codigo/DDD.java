
/**
 * Leia um número inteiro que representa um código de DDD para discagem interurbana. 
 * Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo: * 
 */

import java.io.IOException;
import java.util.Scanner;

public class DDD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        a = input.nextInt();
        switch (a) {
        case 61: {
            System.out.printf("Brasilia\n");
            break;
        }
        case 71: // complete os DDD's corretamente
        {
            System.out.printf("Salvador\n");
            break;
        }
        case 11: {
            System.out.printf("Sao Paulo\n");
            break;
        }
        case 21: {
            System.out.printf("Rio de Janeiro\n");
            break;
        }
        case 32: {
            System.out.printf("Juiz de Fora\n");
            break;
        }
        case 19: {
            System.out.printf("Campinas\n");
            break;
        }
        case 27: {
            System.out.printf("Vitoria\n");
            break;
        }
        case 31: {
            System.out.printf("Belo Horizonte\n");
            break;
        }
        default: {
            System.out.printf("DDD nao cadastrado\n");
            break;
        }
        }
    }
}