package bucles;

import java.awt.Dimension;
import java.util.Scanner;

public class ej3 {
//	3.	Hacer un programa que pida dos números por el teclado N y M, y 
//	si M > N muestre todos los valores comprendidos entre estos dos números.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime el primer número");
		int M=scanner.nextInt();
		
		System.out.println("Dime el segundo número");
		int N=scanner.nextInt();
		N++;
		while (M>N) {
			M--;
			System.out.println(M);
		}
		scanner.close();
	}

}
