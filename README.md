# class-loading-test

This is a quick test to understand how two Classes with same name and package are loaded by the Container, especially in a webapp when one of these is present in WEB-INF/lib and the other in WEB-INF/classes.

It turns out that the class in WEB-INF/classes is loaded in "Apache Tomcat 8.0.15". This is per the Servlet Spec (https://java.net/downloads/servlet-spec/Public%20Review/servlet-3.1-pdr.pdf) mentioned  in page 123/234 which states that

"The Web application class loader must load classes from the WEB-INF/classes directory first, and then from library JARs in the WEB-INF/lib directory"

However, it would be interesting to see how this is implemented in various other Containers. You're most welcome to test this out and update this README.

Once you build the application using Maven, you can test it with the URL http://<ip-address>:<port-number>/classloading-test/

I result I got is "MyClass in WEB-INF/classes loaded. MyClass in WEB-INF/classes instantiated."
