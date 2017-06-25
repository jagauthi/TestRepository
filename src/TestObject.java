
public class TestObject {
	
	public TestObject() {
		System.out.println("Created");
		foo();
		bar();
	}
	
	public void foo() {
		System.out.println("Next");
	}
	
	public void bar() {
		System.out.println("Then");
	}
}
