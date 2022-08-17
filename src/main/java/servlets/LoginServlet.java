package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.DateTimeService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		if (id != "" && password != "" ){
		if (id.equals(password)){
		response.setContentType("text/html"); PrintWriter out = response.getWriter();
		
		DateTimeService dtservice = new DateTimeService(); 
		dtservice.setDateTime(LocalDateTime.now());
		
		out.println ("<html>");
		out.println ("<head>");
		out.println ("<title>Response from LoginServlet</title>");
		out.println ("</head>");
		out.println ("<body>");
		out.println ("<h1>Hello World!</h1>");
		out.println ("<h1>Testing Out Git</h1>");
		out.println (String.format("<h2>Time invoked: %s</h2>", dtservice.getDateTime()));
		out.println ("</body>");
		out.println ("</html>");
		
		
		out.close();
		}
		else { System.out.println("login failure");
		}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
