package org.asgs.test.classloading;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
public class MyServlet extends HttpServlet {
	 protected void service(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
		MyClass myClass = new MyClass();
		resp.getOutputStream().println(myClass.getDescription());
		resp.flushBuffer();
	 }
}