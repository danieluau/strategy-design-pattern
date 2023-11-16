package StrategyOn.service.frete;

import StrategyOn.service.Frete;

public class Normal implements Frete {

    public double calcularPreco(int distancia) {
        // lógica do cálculo de frete "normal"
        return distancia * 1.07 + 9.4;
    }
}
