import java.util.ArrayList;
import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		
		System.out.println("Digite números inteiros (digite -1 para encerrar):");
		int numero;
		do {
			numero = scanner.nextInt();
			if (numero != -1) {
				numeros.add(numero);
			}
		} while (numero != -1);

		System.out.println("Números pares da lista:");
		for (int n : numeros) {
			if (n % 2 == 0) {
				System.out.println(n);
			}
		}

		scanner.close();
	}
}
