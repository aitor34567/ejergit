package bucles;

import java.awt.Container;
import java.util.Scanner;

public class ej6 {
//	6.	Hacer un programa que pida un número, 
	//y después muestre su tabla de multiplicar.
	public static void main(String[] args) {
		int cont=1;
		int tot=0;
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el número");
		int num=scanner.nextInt();
		
		while (cont<=10) {
			tot=num*cont;
			System.out.println(tot);
			cont++;
		}
		scanner.close();
	}

}
