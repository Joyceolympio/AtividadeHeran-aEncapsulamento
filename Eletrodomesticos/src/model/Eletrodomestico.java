package model;

public class Eletrodomestico {
	
	//Atributos
	private String modelo;
	private float peso;
	private String marca;
	private int voltagem;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	
	public void ligar() {
		System.out.println("O eletrodoméstico " + this.modelo + " está ligado!");
	}
	
	public void desligar() {
		System.out.println("O eletrodoméstico " + this.modelo + " está desligado!");
	}
	
	
}
