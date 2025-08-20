package login;

import java.util.Scanner;

public class LoginSystem {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	      String usuario = "admin";
	      String senha = "password";

	      System.out.print("Digite o nome de usuário: ");
	      String inputUsuario = scanner.nextLine();

	      System.out.print("Digite a senha: ");
	      String inputSenha = scanner.nextLine();

	      if(inputUsuario.equals(usuario) && inputSenha.equals(senha)) {
	         System.out.println("Login bem sucedido.");
	      } else {
	         System.out.println("Nome de usuário ou senha incorretos.");
	      }

	      scanner.close();
	   
		
		
	}

}
