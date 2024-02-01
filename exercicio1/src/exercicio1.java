import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		
		int A, B, soma;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Digite um número: ");
		A = ler.nextInt();
		System.out.print("Digite outro número: ");
		B = ler.nextInt();
		
		soma = A + B;
		
		System.out.printf("SOMA = " + soma);
	}

}
