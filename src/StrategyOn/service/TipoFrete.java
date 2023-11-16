package StrategyOn.service;

import StrategyOn.service.frete.Normal;
import StrategyOn.service.frete.RetirarEmMaos;
import StrategyOn.service.frete.Sedex;

public enum TipoFrete {
	
	NORMAL {
		// cria a instância da classe chamada "normal"
		@Override
		public Frete obterFrete() {
			return new Normal();
		}
	},
	SEDEX {
		// cria a instância da classe chamada "sedex"
		@Override
		public Frete obterFrete() {
			return new Sedex();
		}
	},
	BUSCARAPE {
		// cria a instância da classe chamada "buscarape"
		@Override
		public Frete obterFrete() { return new RetirarEmMaos(); }
	};

	// o método deve ser implementado onde for invocado
	public abstract Frete obterFrete();
}
