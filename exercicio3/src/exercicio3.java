
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		int A, B, C, D, diferenca;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite 4 números: ");

		A = ler.nextInt();
		B = ler.nextInt();
		C = ler.nextInt();
		D = ler.nextInt();

		diferenca = (A * B) - (C * D);

		System.out.println("A diferença é = " + diferenca);

		ler.close();
	}

}
