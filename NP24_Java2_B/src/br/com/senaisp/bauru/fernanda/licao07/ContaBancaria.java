package br.com.senaisp.bauru.fernanda.licao07;

public class ContaBancaria {
	//Field estaticos 
	public static int ultNumero = 0;
	//Fields
	private int agencia;
	private int banco;
	private int numeroConta;
	private double saldo;
	//Constructor
	public ContaBancaria() {
		banco = 123;
		agencia = 1;
		numeroConta = 0;
		saldo = 50; ++ultNumero;
	}
	
	public ContaBancaria(int ba, int ag, int nc, double sa1) {
		setBanco(ba);
		setAgencia(ag);
		setNumeroConta(nc);
		setSaldo(sa1);
}
	//Métodos
	public int getAgencia() {
		return agencia;
	}
	public int getBanco() {
		return banco;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public void setBanco(int banco) {
		this.banco = banco;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
