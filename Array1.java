import java.util.ArrayList;
import java.util.Scanner;

public class Array1 {
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

		int soma = 0;
		for (int n : numeros) {
			soma += n;
		}

		System.out.println("A soma dos números é: " + soma);
		scanner.close();
	}
}
