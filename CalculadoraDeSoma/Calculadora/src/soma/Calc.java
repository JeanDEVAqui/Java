package soma;

import java.util.Scanner;

public class Calc {
	static public void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		Numero n1 = new Numero();
		Numero n2 = new Numero();
		Numero resultado = new Numero();
		String opc = "S";
		
		
		while(opc=="s" || opc=="S") {
		System.out.println("Digite o primeiro valor: ");
		n1.setValor(scan.nextInt());
		
		System.out.println("Digite o segundo valor: ");
		n2.setValor(scan.nextInt());
		resultado.setValor(n1.getValor() + n2.getValor());
		System.out.printf("%nA soma de %d com %d é igual a %d", n1.getValor(), n2.getValor(), resultado.getValor());
		
		System.out.printf("Deseja somar outro valor? ");
		opc = scan.next();
		System.out.printf("%n%n%n");
		
		}

		}
}
