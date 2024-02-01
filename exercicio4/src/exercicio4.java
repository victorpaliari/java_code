import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		
		int registroFunc, horasTraba;
		double valorHora, salario;
		
		Scanner ler = new Scanner (System.in);
		System.out.print("Registro do funcionario: ");
		registroFunc = ler.nextInt();
	
		System.out.print("Quantidade de horas trabalhadas: ");
		horasTraba = ler.nextInt();
		
		System.out.print("Valor da hora: ");
		valorHora = ler.nextInt();
		
		salario = horasTraba * valorHora;
		
		System.out.printf("Funcionario: " + registroFunc + " recebe: R$ %.2f", salario);
		
		ler.close();
		

	}

}
