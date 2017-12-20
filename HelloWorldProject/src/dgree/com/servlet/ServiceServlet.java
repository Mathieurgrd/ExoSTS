package dgree.com.servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServiceServlet
 */
@WebServlet(name = "/ServiceServlet", urlPatterns = {"/serviceusers.php"})
public class ServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Random count ; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			
				response.getWriter().append(String.valueOf(GenerateCount()));
		
		//Your request infos
		
		
		
		
		 
		
	}
	
	public int GenerateCount() {
		
		count = new Random(); 
		
		int visite = count.nextInt(); 
		
		if(visite < 0 ) {
			GenerateCount();
			
		}else {
		
		return visite; }
		
		return 0;
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	

}
