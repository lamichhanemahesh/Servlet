import java.io.*;
import java.util.*;
import javax.servlet.*;

public class ContextServlet extends GenericServlet {
	
	public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		ServletContext context = getServletContext();
		String contextName = context.getServletContextName();
		String driverClass = context.getInitParameter("driverClass");
		String url = context.getInitParameter("url");
		String user = context.getInitParameter("user");
		String pass = context.getInitParameter("pass");
		Enumeration enumeration = context.getInitParameterNames();
		writer.print("<h2>Application Name:"+contextName+"</h2>");
		writer.print("<hr></hr>");
		writer.print("<h2>JDBC Driver Information");
		writer.print("<h4>Driver Class:"+driverClass+"</h4>");
		writer.print("<h4>URL:"+url+"</h4>");
		writer.print("<h4>USER:"+user+"</h4>");
		writer.print("<h4>Password:"+pass+"</h4>");
		writer.print("<hr></hr>");
		writer.print("h2>Parameter Names</h2>");
		while(enumeration.hasMoreElements()) {
			writer.print("<h4>Parameters Name:"+enumeration.nextElement()+"</h4");
		}
		writer.print("<hr></hr>");
		writer.print("Setting data into context object");
		context.setAttribute("id", 101);
		context.setAttribute("name","mahesh");
		context.setAttribute("email", "mahesh@gmail.com");
		writer.print("New data added to context object");
		writer.print("<h2>Newly added data to context object are</h2>");
		writer.print("<h4>Id:"+context.getAttribute("id"));
		writer.print("<h4>Name:"+context.getAttribute("name")+"</h4>");
		writer.print("<h4>Email:"+context.getAttribute("email")+"</h4>");
		writer.print("<h2>Deleting the data from context</h2>");
		context.removeAttribute("id");
		context.removeAttribute("name");
		context.removeAttribute("email");
		writer.print("<h2>Data Successfully Delete From The Context");
		
		
		
	}
}
