package br.com.senaisp.bauru.fernanda.licao07.exercicio;

import java.util.Random;

public class MaquinaFliperama {
	private Random rnd;
	private int CustoCredito;
	private String nomeJogo;
	//Constructor
	public MaquinaFliperama(String nome) {
		nomeJogo = nome;
		rnd = new Random();
		CustoCredito = rnd.nextInt(5)+1;
	}
	//Métodos
	
	public int getCustoCredito() {
		return CustoCredito;
	}	
		public String getNomeJogo() {
			return nomeJogo;
	}
	public void lerCartao(Cartao ct) {
		if (CustoCredito<=ct.getCreditos()) {
			int cr = ct.getCreditos()-CustoCredito;
			ct.setCreditos(cr);
			//ganhando os tickets
			cr = ct.getTickets() + rnd.nextInt(10) + 1;
			ct.setTicktes(cr);
			//Mostrando os creditos
			System.out.println(ct);
		} else {
			System.out.println("Que pena! Acabou-se seus créditos! :-");
			
		
	}

	}
	
}
