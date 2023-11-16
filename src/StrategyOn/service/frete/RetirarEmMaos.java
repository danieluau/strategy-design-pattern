package StrategyOn.service.frete;

import StrategyOn.service.Frete;

public class RetirarEmMaos implements Frete {
    @Override
    public double calcularPreco(int distancia) {
        return distancia * 0;
    }
}
