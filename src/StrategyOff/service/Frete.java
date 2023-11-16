package StrategyOff.service;

/**
 * Created by christian on 12/10/16.
 */
public class Frete {
    private TipoFrete tipo;

    public Frete(TipoFrete tipo) {
        this.tipo = tipo;
    }

    public double calcularPreco(int distancia) {
        double preco = 0;
        if (TipoFrete.NORMAL.equals(tipo)) {
            preco = distancia * 1.25 + 10;
        } else if (TipoFrete.SEDEX.equals(tipo)) {
            preco = distancia * 1.45 + 12;
        } else if (TipoFrete.RETIRAREMMAOS.equals(tipo)) {
            preco = distancia * 0;
        }

        return preco;
    }
}
