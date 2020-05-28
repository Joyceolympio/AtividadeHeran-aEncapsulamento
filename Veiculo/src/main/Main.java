package main;

import model.Carro;
import model.Moto;

public class Main {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.setCambio("Manual");
		carro.setCombustivel("Gasolina");
		carro.setCor("Branco");
		carro.setNumPortas(4);
		carro.setNumAssentos(5);
		carro.setModelo("Fiesta");
		
		carro.acelerar();
		carro.frear();
		
		System.out.println("\n----------------------------------------------\n");
		
		Moto moto = new Moto();
		
		moto.setCavalete(true);
		moto.setCombustivel("Flex");
		moto.setCor("Preto");
		moto.setNumRodas(2);
		moto.setModelo("BMW R1250");
		
		moto.acelerar();
		moto.frear();
		
	}

}
