package StrategyOff;


import StrategyOff.service.Frete;
import StrategyOff.service.TipoFrete;

import java.util.Scanner;


public class Exemplo {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Informe a distância: ");
            int distancia = entrada.nextInt();
            System.out.print("qual o tipo de frete (1) normal, " +
            "(2) sedex, (3) retirar em mãos: ");
            int opcaoFrete = entrada.nextInt();
            TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];

            Frete frete = new Frete(tipoFrete);
            double preco = frete.calcularPreco(distancia);
            System.out.printf("o valor total do frete é de R$%.2f", preco);
        }
    }
}
