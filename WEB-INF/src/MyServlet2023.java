import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet2023 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException{
		
		String username = request.getParameter("username");

		String answer1 = request.getParameter("answer1");
		String answer2 = request.getParameter("answer2");
		String answer3 = request.getParameter("answer3");
		String answer4 = request.getParameter("answer4");
		String answer5 = request.getParameter("answer5");



		double counter = 0;


		if(answer1.equalsIgnoreCase("Dublin"))
		{
			counter ++;
		}

		if(answer2.equals("26") || answer2.equalsIgnoreCase("Twenty Six") )
		{
			counter ++;
		}

		if(answer3.equalsIgnoreCase("Spiders"))
		{
			counter ++;
		}

		if(answer4.equals("12") || answer4.equalsIgnoreCase("Twelve") )
		{
			counter ++;
		}

		if(answer5.equalsIgnoreCase("Sweden"))
		{
			counter ++;
		}
		
		counter = counter/5 *100;


		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html><body>Your Result:  "+counter+" <br> </body></html>");


		out.println("<html><body> <h2>Here are the correct answers! <h2><br>   </body></html>");
		
		out.println("<html><body>Answer 1:Dublin <br> </body></html>");
		out.println("<html><body>Answer 2:Twenty Six(26) <br> </body></html>");
		out.println("<html><body>Answer 3:Spiders <br> </body></html>");
		out.println("<html><body>Answer 4:Twelve(12) <br> </body></html>");
		out.println("<html><body>Answer 5:Sweden <br> </body></html>");
		
		
		
		
	}


}