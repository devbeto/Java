package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Entre com as medias do trinagulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com as medias do trinagulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble(); 
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("�rea do triangulo X: %.4f%n",areaX);
		System.out.printf("�rea do triangulo Y: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("A maior �rea � a X");
		}
		else  {
			System.out.println("A maior �rea � a Y");
		}
		
	
		
		
		
		sc.close();
		

	}

}
