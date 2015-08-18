package org.asgs.test.classloading;
public class MyClass {
	private static String description;
	static {
		description = "MyClass in WEB-INF/classes loaded. ";
		System.out.println(description);
	}
	
	public MyClass() {
		description += "MyClass in WEB-INF/classes instantiated.";
		System.out.println(description);
	}
	
	public String getDescription() {
		return description;
	}
}