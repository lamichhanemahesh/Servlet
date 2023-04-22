

import java.io.*;
import javax.servlet.*;
public class WelcomeServlet implements Servlet {
	
	public void init(ServletConfig config) throws ServletException
	{
		
	}
	
	public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>");
		out.println("<font color='red'>");
		out.println("<b>");
		out.println("Welcome To Durga Software Solutions");
		out.println("</b><hr></font></h2></body></html>");
	}
	
	public ServletConfig getServletConfig() {
		return null;
	}
	
	public String getServletInfo() {
		return null;
	}
	
	public void destroy() {
		
	}
	
}
