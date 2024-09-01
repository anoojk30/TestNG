package testscript;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor extends Base {
	@Test
	public void javascriptExecutorTest() {
		driver.navigate().to("https://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,150)","");//x,y axis
		//js.executeScript("window.scrollBy(0,-150)","");//x,y axis downwards
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
		WebElement amazon=driver.findElement(By.id("nav-search-submit-button"));
		//js.executeScript("arguments[0].click();",amazon);
		
			
	}

}
