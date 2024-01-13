package br.fiap.produto;

import br.fiap.cliente.Cliente;

public class CartaoDeCredito extends Produto{

	private int numero;
	private double saldo;
	
	
	
	
	public CartaoDeCredito(Cliente cliente, int numero, double saldo) {
		super(cliente);
		this.numero = numero;
		this.saldo = saldo;
	}




	public int getNumero() {
		return numero;
	}




	public void setNumero(int numero) {
		this.numero = numero;
	}




	public double getSaldo() {
		return saldo;
	}




	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public String toString() 
	{
		String aux = super.toString();
		aux += "Numero: " + numero + "\n";
		aux += "Saldo: " + saldo + "\n";
		return aux;
	}

	
	}

	
	

