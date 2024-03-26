package br.com.senaisp.bauru.fernanda.licao05.exercicio;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código da cor: (1,2 ou 3):");
		int codigo = sc.nextInt();
		String cor = "Cor inválida";
		if (codigo == 1) {
			cor = "Proxima luz do semáforo será verde";			
		}else if (codigo == 2) {
			cor = "Proxima luz do semáforo será amarelo";
		}else if (codigo == 3) {
			cor = "Proxima luz do semáforo será vermelho";
		}
		System.out.println(cor);
		sc.close();
		
			
			
		}
		
		
	}

