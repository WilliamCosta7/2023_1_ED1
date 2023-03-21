import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x, n1, n2;
		int operacao;

		Scanner scanner = new Scanner(System.in);
		Operacoes operacoes = new Operacoes();
		System.out.println(" DIGITE DOIS NÚMEROS PARA SEREM CALCULADOS");
		n1 = scanner.nextDouble();
		n2 = scanner.nextDouble();

		System.out.println(" Escolha a operação desejada ");
		
		operacao = scanner.nextInt();

		switch (operacao) {

		case 1:
			System.out.println(operacoes.somar(n1, n2));
			break;

		case 2:
			System.out.println(operacoes.subtrair(n1, n2));
			break;

		case 3:
			System.out.println(operacoes.dividir(n1, n2));
			break;

		case 4:
			System.out.println(operacoes.multiplicar(n1, n2));
			break;

		}
	}

}
