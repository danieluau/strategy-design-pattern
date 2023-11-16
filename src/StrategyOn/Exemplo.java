package StrategyOn;

import java.util.Scanner;

import StrategyOn.service.Frete;
import StrategyOn.service.TipoFrete;


public class Exemplo {

	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in)){
			System.out.println("informe a distância: ");
			int distancia = entrada.nextInt();
			System.out.println("qual o tipo de frete (1) normal, " +
					"(2) sedex, (3) retirar em mãos: ");
			int opcaoFrete = entrada.nextInt();
			TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];

			// cria a instância da classe que será utilizada
			Frete frete = tipoFrete.obterFrete();
			
			double preco = frete.calcularPreco(distancia);
			System.out.printf("o valor total do frete é de R$%.2f", preco);
		}
	}

}
