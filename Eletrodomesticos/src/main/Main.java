package main;

import model.Eletrodomestico;

public class Main {
	public static void main(String args[]) {
		
		Eletrodomestico eletrodomestico = new Eletrodomestico();
		
		eletrodomestico.setMarca("Samsung");
		eletrodomestico.setModelo("Máquina de lavar");
		eletrodomestico.setPeso(12);
		eletrodomestico.setVoltagem(220);
		
		eletrodomestico.ligar();
		eletrodomestico.desligar();
		
		
	}
}
