import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		double A, B, C, 
		areaTrianguloRetangulo, 
		areaCirculo, 
		areaTrapezio, 
		areaQuadrado, 
		areaRetangulo;
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner (System.in);
		System.out.print("Digite o valor de A: ");
		A = ler.nextDouble();
		
		System.out.print("Digite o valor de B: ");
		B = ler.nextDouble();
		
		System.out.print("Digite o valor de C: ");
		C = ler.nextDouble();
		
		areaTrianguloRetangulo = A * C / 2;
		System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRetangulo);
		
		areaCirculo = 3.14159 * Math.pow(C, 2);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		
		areaTrapezio = (A + B) * C / 2;
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		
		areaQuadrado = B * B;
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		
		areaRetangulo = A * B;
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		
		ler.close();
	}

}
