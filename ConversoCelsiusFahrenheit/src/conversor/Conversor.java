package conversor;

import java.util.Scanner;
public class Conversor {

	static double convercaoCF(double C) {
		return 9 * C / 5 + 32;
 	}
	
	static double converteFC(double F) {
	    return (F - 32) * 5 / 9;
	}
	   
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		
		while (opcao != 1 && opcao != 2) {
		 System.out.println("=== Conversor de Temperaturas ===");
	        System.out.println("1 - Converter Celsius para Fahrenheit");
	        System.out.println("2 - Converter Fahrenheit para Celsius");
	        System.out.print("Escolha uma opção: ");
	        opcao = leitor.nextInt();
	        
	        
	        if (opcao == 1) {
	        	
		System.out.println("Digite o número em Celsius: ");
		double celcius = leitor.nextInt();
		
		System.out.println("O número convertido em Fahrenheit é: ");
		System.out.println(convercaoCF(celcius));
	        
	        }else if (opcao == 2) {
	        	
	        	System.out.println("Digite o número em Fahrenheit: ");
		    	double fahrenheit = leitor.nextInt();
		    	
		    	System.out.println("O número convertido em Celsius é: ");
		    	System.out.println(converteFC(fahrenheit));
	        	
	        }else {
		    	System.out.println("Opção inválida! Escolha apenas 1 ou 2. \n");
		    }
		} 
		leitor.close();
	}

}
