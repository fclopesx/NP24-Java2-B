package br.com.senaisp.bauru.fernanda.licao07.exercicio;

public class Cartao {
	private static int contador=0;
	private int numero;
	private int creditos;
	private int tickets;
	//Constructor
	private int ticktes;
		public Cartao() {
			numero = ++contador;
			creditos = 0;
			ticktes = 0;
	
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public int getTicktes() {
		return ticktes;
	}
	public void setTicktes(int ticktes) {
		this.ticktes = ticktes;
	}
	public int getNumero() {
		return numero;
		
	}
	@Override
	public String toString() {
		return "=".repeat(20)+"\n"+
				"Nr. Cartão: " + getNumero()+"\n"+
	            "Saldo Créditos: " + getCreditos()+ "\n"+
				"Saldo Ticktes: " + getTicktes();
		
	
	
	
	
		
		
	}
	

}
