package operacao;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a operação:\n"
							+"1-adição dois valores inteiros\n"
							+"2-subtração\n"
							+"3-multiplicação\n"
							+"4-divisão\n"
							+"5-exponenciação\n"
							+"6-fatorial"
							+"7-adição de três valores\n"
							+"8-adição dois valores texto");
		int tipo = teclado.nextInt();
		System.out.println("Digite o valor 1:");
		int valor1 = teclado.nextInt();
		int valor2 = 0;
		if (tipo != 5 && tipo !=6) {
			System.out.println("Digite o valor 2:");
			valor2 = teclado.nextInt();
		}
		teclado.close();

		Operacao operacao = new Operacao();
		
		switch (tipo) {
		
		case 1: System.out.println("Adição 2 valores inteiros="+operacao.soma(valor1, valor2));
		break;
		case 2: operacao.setMinuendo(valor1);
				operacao.setSubtraendo(valor2);
				System.out.println("Subtração="+operacao.subtracao());
				break;
		case 3: operacao.setNumeroGenerico1(valor1);
				operacao.setNumeroGenerico2(valor2);
				System.out.println("Multiplicação"+operacao.multiplicacao());
				break;
		case 4: operacao.setNumeroGenerico1(valor1);
				operacao.setNumeroGenerico2(valor2);
				System.out.println("Divisão"+operacao.divisao());
		case 5: System.out.println("Exponenciação=");
		break;
		case 6: operacao.setFatorial(valor1);
		System.out.println("Fatorial="+operacao.getFatorial());
		break;
		case 7: System.out.println("adição 3 valores="+operacao.soma(valor1, valor2, 78));
		break;
		case 8: System.out.println("adicao 2 valores textos="+operacao.soma(Integer.toString(valor1), Integer.toString(valor2)));
		break;
		default : System.out.println("Operação Inválida!");
		
		
		}
	}

}
	
