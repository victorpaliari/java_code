import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		
		//area = pi . raio2 
		//pi = 3,14159
		
		Locale.setDefault(Locale.US);
		
		double area, pi, raio;
		pi = 3.14159;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Digite o raio: ");
		raio = ler.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("Area do círculo é = %.4f%n", area);
		
		ler.close();
	}

}
