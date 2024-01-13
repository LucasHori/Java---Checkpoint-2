package br.fiap.main;
import java.util.ArrayList;
import java.util.List;

import br.fiap.cliente.*;
import br.fiap.produto.*;

public class Main{
	public static void main(String[] args) {
		
		List<Produto> lista = new ArrayList<>() 
		{
			private static final long serialVersionUID = 1L;
		
			{
				add(new CartaoDeCredito (new Cliente("Lucas", "1234567687"), 123, 20000));
				add(new CartaoDeCredito (new Cliente("Joao", "3233445456"), 456, 32240));
				add(new Financiamento (new Cliente("Yasmin", "565675443"), 1233, 34354));
				add(new Financiamento (new Cliente("Pedro Garcia", "154565676"), 1235, 200));
			
			}};
		
		
    
		for(Produto produto : lista) {
			if(produto instanceof CartaoDeCredito) 
			{
				System.out.println(produto);
				
		
			}
			else {
				System.out.println(produto);
			}
			
			
		}
		}
		
		}
	
	
		

	
	
