package br.com.senaisp.bauru.fernanda.licao06.lacofor;

public class Poligonos {

    public static void montarQuadrado() {
        for(int lin=0; lin<10; lin++) {
            for (int col=0; col<10; col++) {
                System.out.print(""+lin+col+" ");
            }
            System.out.println();
        }
    }

    public void montarTrianguloInferior() {
        for(int lin=0; lin<10; lin++) {
            for (int col=0; col<10; col++) {
                System.out.print(""+lin+col+" ");
                System.out.print("" + lin + col + " ");
            }
        }
        System.out.println();
    }
}

public void montarDiagonalPrincipal() {
    for(int lin=0; lin<10; lin++) {
        for (int col=0; col<10; col++) {
        	if (col==9); {
            System.out.print(""+lin+col+" ");
            System.out.print(""   "");
        }
    }
    System.out.println();

