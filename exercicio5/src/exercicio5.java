import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		//codigoPeça, qndtPecas, valorUnitario > peca 1 e 2
		
		int codigoPeca1, codigoPeca2, qntdPecas1, qntdPecas2;
		double valorUnitario1, valorUnitario2, total;
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner (System.in);
		System.out.print("Digite o código da peça 1: ");
		codigoPeca1 = ler.nextInt();
		
		System.out.print("Digite a quantidade de peças: ");
		qntdPecas1 = ler.nextInt();

		System.out.print("Digite o valor: ");
		valorUnitario1 = ler.nextDouble();
		
		System.out.print("Digite o código da peça 2: ");
		codigoPeca2 = ler.nextInt();
		
		System.out.print("Digite a quantidade de peças: ");
		qntdPecas2 = ler.nextInt();

		System.out.print("Digite o valor: ");
		valorUnitario2 = ler.nextDouble();
		
		total = qntdPecas1 * valorUnitario1 + qntdPecas2 * valorUnitario2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		ler.close();
		

	}

}
