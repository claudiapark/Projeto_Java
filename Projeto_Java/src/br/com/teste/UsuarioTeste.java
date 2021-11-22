package br.com.teste;

import java.util.Scanner;

import br.com.beans.Usuario;
import br.com.bo.UsuarioBO;

public class UsuarioTeste {
	
	public static void main(String[] args) {
		Scanner l =  new Scanner(System.in);
		try {
			Usuario usu = new Usuario();
			UsuarioBO usuBO= new UsuarioBO();
	//		int codigo=0;
			int menu=0;
			do {
				System.out.println("MENU\n1-Cadastrar\n2-Consultar\n3-Verifica Login\n4-Busca Codigo\n5-Atualizar Cadastro\n6-Atualiza Senha\n7-Deleta Usuario\n8-Sair");
				menu = l.nextInt();
				
				switch (menu) {
				case 1:
					usu.setCodigo(10000);
					usu.setNome("Claudia");
					usu.setCpf("11111111111");
					usu.setEmail("claudia@teste.com");
					usu.setSenha("123456");
					usu.setDataNascimento("220995");
					usu.setTipo(1);
					System.out.println(usuBO.cadastrarUsuario(usu));
					
					break;
				case 2:
					System.out.println("Consulta");
					break;
				case 3:	
					System.out.println("Verifica Login");
					break;
				case 4:
					System.out.println("Busca Codigo");
					
					break;
				case 5:
					System.out.println("Atualiza Cadastro");
					break;
				case 6:
					System.out.println("Atualiza Senha");
					break;
				case 7:
					System.out.println("Deleta Usario");
					break;
				case 8:
					System.out.println("Fim");
					break;
				default:
					System.out.println("digite um valor de 1-8");
					break;
				}
				
			} while (menu!=8);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		l.close();
	}
}
