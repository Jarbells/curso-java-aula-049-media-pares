import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int n, sum, evenQuantity = 0;
		int[] vect;
		double evenAverage;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		vect = new int[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		sum = 0;		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] % 2 == 0) {
				sum += vect[i];
				evenQuantity++;
			}			
		}
		
		if(evenQuantity == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			evenAverage = (double)sum / evenQuantity;
			System.out.printf("MEDIA DOS PARES = %.1f%n", evenAverage);
		}
		
		sc.close();
	}
}
