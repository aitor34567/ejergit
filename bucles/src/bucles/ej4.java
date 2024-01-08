package bucles;

import java.util.Scanner;

public class ej4 {
//	4.	Repetir el programa For4, pero en el caso que M < N, intercambie 
	//los valores y muestre los números comprendidos entre ellos.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aux=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime el primer número");
		int M=scanner.nextInt();
		
		System.out.println("Dime el segundo número");
		int N=scanner.nextInt();
		if (M<N) {
			
			aux=M;
			M=N;
			N=aux;
		}
		N++;
		
		while (M>N) {
			M--;
			System.out.println(M);
			
		}
		scanner.close();
	} 
	
}
