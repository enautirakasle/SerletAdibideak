package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Libro;

public class Etiquetas extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		Libro libro = new Libro();
		libro.setTitulo("100 merr");
		request.setAttribute("liburua", libro);

		RequestDispatcher rd = request.getRequestDispatcher("etiqueta.jsp");
		rd.forward(request, response);
	}
}
