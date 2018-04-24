package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HolaPhonegap extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		response.setHeader("Access-Control-Allow-Origin","*");
		out.println("soy phonegap");
//		out.println("<html>");
//		out.println("<head>");
//		out.println("</head>");
//		out.println("<body>");
//		//out.println("<h1>llamada get, soy "+ request.getParameter("nombre") +" "+ request.getParameter("apellido")+"</h1>");
//		out.println("</body>");
//		out.println("</html>");
	}
	
	
	
	
}
