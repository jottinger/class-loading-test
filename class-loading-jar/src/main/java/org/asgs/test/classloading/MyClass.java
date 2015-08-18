package org.asgs.test.classloading;
public class MyClass {
	private static String description;
	static {
		description = "MyClass in WEB-INF/lib's Jar loaded. ";
		System.out.println(description);
	}
	
	public MyClass() {
		description += "MyClass in WEB-INF/lib's Jar instantiated.";
		System.out.println(description);
	}
	
	public String getDescription() {
		return description;
	}	
}