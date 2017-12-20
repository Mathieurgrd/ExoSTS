package dgree.com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayTable
 */
@WebServlet(name ="/DisplayTable" , urlPatterns = "/Display.php")
public class DisplayTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayTable() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String contenu[] = {"Raoul", "JeanValJean", "Bobbby"};
		String toDisplay = " "; 
		for (int i = 0; i < contenu.length; i++) {
			toDisplay= toDisplay + "Le " +  String.valueOf(i  + 1 ) + " nom est " +  contenu[i] + "<br>";
			
			}

		response.getWriter().append(toDisplay);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
