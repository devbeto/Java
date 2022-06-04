package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Entre com a data do produto: ");
		System.out.print("Nome: ");
		product.name = sc.nextLine();
		
		System.out.print("Preço: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantidade no estoque: ");
		product.quantity = sc.nextInt();
		
				
		//System.out.println(product.name + ", " + product.price + ", " + product.quantity);
		
		System.out.println(product.toString());
		
		System.out.println();
		System.out.println("Entre com o numero de produtos para atualizar o estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Estoque atualizado: " + product);
		
		System.out.println();
		System.out.println("Entre com o numero de produtos vendidos  para atualizar o estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Estoque atualizado: " + product);
		
		
		sc.close();
	}

}
