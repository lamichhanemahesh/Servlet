import java.io.*;
import java.util.*;
import javax.servlet.*;

public class ConfigServlet extends GenericServlet {
	
	public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		ServletConfig config = getServletConfig();
		String servletName = config.getServletName();
		String driverClass = config.getInitParameter("driverClass");
		String url = config.getInitParameter("url");
		String user = config.getInitParameter("user");
		String pass = config.getInitParameter("pass");
		Enumeration enumeration = config.getInitParameterNames();
		while(enumeration.hasMoreElements()) {
			writer.print("<h2>Parameters Name:"+enumeration.nextElement()+"</h2");
		}
		
		writer.print("<h2>Servlet Name:"+servletName+"</h2>");
		writer.print("<h2>Driver Class:"+driverClass+"</h2>");
		writer.print("<h2>URL:"+url+"</h2>");
		writer.print("<h2>USER:"+user+"</h2>");
		writer.print("<h2>Password:"+pass+"</h2>");
		writer.print("<hr></hr>");
	}
}
