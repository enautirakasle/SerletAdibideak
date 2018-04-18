package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Libro;
import modelo.LibroModelo;

public class Etiquetas extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		Libro libro = new Libro();
		libro.setTitulo("100 merr");
		request.setAttribute("liburua", libro);
		LibroModelo libroModelo = new LibroModelo();
		ArrayList<Libro> libros = libroModelo.selectAll();
		
		request.setAttribute("libros", libros);

		RequestDispatcher rd = request.getRequestDispatcher("etiqueta.jsp");
		rd.forward(request, response);
	}
}
