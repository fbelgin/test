package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class QuestionServlet
 */
@WebServlet("/question")
public class QuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuestionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    /*String text = request.getParameter("text");
		String text1 = request.getParameter("title");*/
			
		/*Enumeration<String> parameterNames = request.getParameterNames();
		
		while (parameterNames.hasMoreElements()) {

			String paramName = parameterNames.nextElement();
			String[] paramValues = request.getParameterValues(paramName);
			
			for (int i = 0; i < paramValues.length; i++) {
				String paramValue = paramValues[i];
								
				Question question = new Question();
				question.setText(paramValue);
			
				HttpSession session = request.getSession(true);
				
				if(session.getAttribute("qlist")== null){
					List<Question> list = new ArrayList<>();
					session.setAttribute("qlist", list);
				}

				List<Question> list = (List)session.getAttribute("qlist");
				list.add(question);
			      
				request.setAttribute("question", question);
				getServletContext().getRequestDispatcher("/questionlist.jsp").forward(request, response);
					
			}

		}*/
		
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("title     text   score" + "<br/>");
	    Map  map  = request.getParameterMap();
        	   	    
	    Iterator iter = map.entrySet().iterator();
	      while ( iter.hasNext() ) 
	      {
	        Map.Entry entry  = (Map.Entry)iter.next() ;
	        String    name   = (String)entry.getKey() ;
	        String[]  values = (String[])entry.getValue();
	        
	        for ( int i = 0 ; i < values.length ; ++i )
	        {
	             out.println(values[i]+" ");
	             
	        }
	        out.println("");
	        }
	      
	        /*Question question = new Question();
	        question.setText(text);
	        question.setScore(text1);
	      	HttpSession session = request.getSession(true);
			
			if(session.getAttribute("qlist")== null){
				List<Question> list = new ArrayList<>();
				session.setAttribute("qlist", list);
			}

			List<Question> list = (List)session.getAttribute("qlist");
			list.add(question);
		      
			request.setAttribute("question", question);
			getServletContext().getRequestDispatcher("/questionlist.jsp").forward(request, response);*/
	      
	     }

      

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		}
	
	
}
