package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion extends Base {
	@Test
public void assetEqualTest() {
	driver.navigate().to("https://www.browserstack.com/");
	String actualstring=driver.getTitle();
	System.out.println(actualstring);
	String expected="Most Reliable App & Cross Browser Testing Platform | BrowserStack";
	Assert.assertEquals(actualstring, expected);
	

	}
	@Test
	
	public void assertNotEquals() {
		driver.navigate().to("https://www.browserstack.com/");
		String actualstring=driver.getTitle();
		System.out.println(actualstring);
		String expected= "Most Reliables App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertNotEquals(actualstring, expected);
	}
	@Test
	public void assertTrueTest() {
		driver.navigate().to("https://www.browserstack.com/");
		boolean verifytitle=driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack;");
		Assert.assertTrue(verifytitle);
	}
	@Test

	public void assertFalseTest() {
		driver.navigate().to("https://www.browserstack.com/");
		boolean verifytitle=driver.getTitle().equalsIgnoreCase("Most Reliables App & Cross Browser Testing Platform | BrowserStack;");
		Assert.assertFalse(verifytitle);
	}
	@Test
	public void assertNull() {
		driver.navigate().to("https://www.browserstack.com/");
		String verifytitle=null;
		Assert.assertNull(verifytitle);
	}
	@Test
	public void assertNotNullTest() {
		driver.navigate().to("https://www.browserstack.com/");
		boolean verifytitle=driver.getTitle().equalsIgnoreCase("Most Reliables App & Cross Browser Testing Platform | BrowserStack;");
		Assert.assertNotNull(verifytitle);
	}

}
