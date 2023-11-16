package StrategyOff;


import StrategyOff.service.Frete;
import StrategyOff.service.TipoFrete;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("informe a distância em kms: ");
            int distancia = entrada.nextInt();
            System.out.print("qual o tipo de frete? \n [1] normal " +
            " \n [2] sedex \n [3] retirar em mãos \n ");
            int opcaoFrete = entrada.nextInt();
            TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];

            Frete frete = new Frete(tipoFrete);
            double preco = frete.calcularPreco(distancia);
            System.out.printf("o valor total do frete é de R$%.2f", preco);
        }
    }
}
