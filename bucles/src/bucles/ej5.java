package bucles;

import java.util.Scanner;

public class ej5 {
	//5.	Hacer un programa que pida tres números N, M y Y. Mostrar todos 
	//los valores comprendidos entre N y M con un intervalo Y.
	//Si M < N, antes se habrán de intercambiar los valores.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aux=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime el primer número");
		int M=scanner.nextInt();
		
		System.out.println("Dime el segundo número");
		int N=scanner.nextInt();
		System.out.println("Dime el segundo número");
		int Y=scanner.nextInt();
		
		
		
		if (M<N) {
			
			aux=M;
			M=N;
			N=aux;
		}
		N=N+Y;
		
		while (M>N) {
			M=M-Y;
			System.out.println(M);
			
		}
		scanner.close();
	}

}
