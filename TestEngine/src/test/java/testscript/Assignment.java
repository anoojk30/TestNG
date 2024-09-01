package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assignment extends Base {
	@Test
	
	public void frameHandling() {
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iframe);
		WebElement jmeter=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		jmeter.click();
		
	}
	public void multipleWindowHandling() {
		
	}


}
