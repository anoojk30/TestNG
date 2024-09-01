package testscript;

import org.testng.annotations.Test;

public class TestProgram extends Base{
	@Test(priority=1)
	public void test1(){
		System.out.println("Hello");
	}
	@Test(priority=2)
	public void show() {
		System.out.println("Hi");
	}
	@Test(priority=3)
	public void display()
	{
		System.out.println("Print Name");
	}
}

	

