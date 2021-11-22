package br.com.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.beans.Usuario;
import br.com.bo.UsuarioBO;

@WebServlet("/CadastroServlet")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String dataNascimento = request.getParameter("data");
		int tipo = 1;
		Usuario usuario = new Usuario(nome, cpf, email, senha, dataNascimento, tipo);
		UsuarioBO usuarioBO = new UsuarioBO();
		
		//dao
		
		try {
			usuarioBO.cadastrarUsuario(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
