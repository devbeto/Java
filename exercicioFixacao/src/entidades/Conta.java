package entidades;

public class Conta {

	private int conta;
	private String titular;
	private double saldo;
	
	public Conta(int conta, String titular) {
		
		this.conta = conta;
		this.titular = titular;
	}

	public Conta(int conta, String titular, double depositoInicial) {
		
		this.conta = conta;
		this.titular = titular;
		deposito(depositoInicial);
	}

	public int getConta() {
		return conta;
	}

	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double resultado) {
		saldo += resultado;
	}
	
	public void saque(double resultado) {
		saldo -= resultado + 5.00;
	}
	
	
	
	
	
	
}
