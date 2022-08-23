package example;

import org.testng.TestNG;

public class TestRunner {

	static TestNG testNg;

	@SuppressWarnings("depraction")
	public static void main(String[] args) {
		
		
		
		testNg = new TestNG();
		
		testNg.setTestClasses(new Class[] {NewTest.class});
		testNg.run();

	}

}
