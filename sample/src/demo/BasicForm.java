package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BasicForm extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		processForm(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		processForm(req, resp);
	}

	@SuppressWarnings("rawtypes")
	private void processForm(HttpServletRequest req, HttpServletResponse resp) {
		
		
		try {

			resp.setContentType("text/html; charset=UTF-8");

			Enumeration<String> requestParameters = req.getParameterNames();
			
			String formResultcontent = getFormResultContent(req, requestParameters);
			
			PrintWriter outputWriter = resp.getWriter();
			
			String title = "Student Information Form Data Summary";
			
			outputWriter.println(
		                "<html>" +
			                "<head><meta charset=\"UTF-8\"><title>" + title + "</title></head>" +
			                "<body bgcolor=\"#f0f0f0\">\n" +
				                "<h1 align=\"center\">" + title + "</h1>\n"
				                + formResultcontent +
			                "</body>"+
			            "</html>");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	private String getFormResultContent(HttpServletRequest req, Enumeration requestAttributes) {
		
		String content = "<ul>";

		while(requestAttributes.hasMoreElements()) {
			
			String attributeName = (String) requestAttributes.nextElement();
			
			String[] valuesOfAttribute = req.getParameterValues(attributeName);

			
			if(valuesOfAttribute.length == 1) {
				String value = valuesOfAttribute[0];
				
				if(value != null && value.length() > 0) {
					
					if("java".equals(attributeName)) {
						content += "<li>Java</li>";
					}
					else if("js".equals(attributeName)) {
						content += "<li>Javascript</li>";
					}
					else if("csharp".equals(attributeName)) {
						content += "<li>C#</li>";
					}
					else if("python".equals(attributeName)) {
						content += "<li>Python</li>";
					}
					else {
						content += "<li>" + value + "</li>";
					}
				}
			}
		}
		
		content += "</ul>";
		
		return content;
	}
}
