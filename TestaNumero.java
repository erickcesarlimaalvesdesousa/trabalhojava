

package poo;

import java.util.HashMap;
import java.util.Scanner;

public class TestaNumero {

    public static void main(String[] args) {
        Numero n = new Numero();
        Scanner scan = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            double x = 0;
            double y = 0;
            int operacao = 0;

          
            System.out.println("Digite a operação que deseja realizar:  "
                    + " \n1 para soma "
                    + " \n2 para subtração "
                    + " \n3 para multiplicação "
                    + " \n4 para divisão "
                    + " \n ou 0 para finalizar o programa"
            );

            operacao = scan.nextInt();

           
            if (operacao == 0) {
                continuar = false;
                break; 
            }

           
            System.out.println("Informe o valor do primeiro número");
            x = scan.nextDouble();

            System.out.println("Informe o valor do segundo número");
            y = scan.nextDouble();

      
            switch (operacao) {
                case 1: 
                    imprimeCalculadora(operacao, n.soma(x, y), x, y);
                    break;

                case 2: 
                    imprimeCalculadora(operacao, n.subtracao(x, y), x, y);
                    break;

                case 3: 
                    imprimeCalculadora(operacao, n.multiplicacao(x, y), x, y);
                    break;

                case 4: 
                    if (y == 0) {
                        System.out.println("Erro: Não é possível dividir por zero.");
                    } else {
                        imprimeCalculadora(operacao, n.divisao(x, y), x, y);
                    }
                    break;

                default:
                    System.out.println("Operação inválida. Tente novamente.");
                    break;
            }
        }

      
        scan.close();
    }

    static void imprimeCalculadora(int operacao, double resultado, double x, double y) {
        HashMap<Integer, String> mapOperacao = new HashMap<>();
        mapOperacao.put(1, "somado");
        mapOperacao.put(2, "subtraído");
        mapOperacao.put(3, "multiplicado");
        mapOperacao.put(4, "dividido");

        System.out.println("\nO resultado de " + x + " " + mapOperacao.get(operacao) + " por " + y + " é igual a " + resultado + "\n");
    }
}
