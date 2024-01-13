package br.fiap.produto;
import br.fiap.cliente.*;

public abstract class Produto {

	private Cliente cliente;

	
	public Produto(Cliente cliente) {
		super();
		this.cliente = cliente;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
	
	public String toString() 
	{
		return "Cliente:" + cliente;
	}
	
		
	}
	
	
	
	
	
	

