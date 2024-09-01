package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown extends Base {
	@Test
	public void dropDown(){
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement drop=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(drop);
		//select.selectByVisibleText("Red");
		select.selectByIndex(1);
		select.selectByValue("Yellow");
	
	}
	@Test
	public void simplealert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		alert.clear();
		driver.switchTo().alert().accept();
	}
	@Test
	public void confirmationalert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert1=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		alert1.click();
		driver.switchTo().alert().accept();
		
	}
	@Test
	public void promptalert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert3=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		alert3.click();
		driver.switchTo().alert().sendKeys("Anooj");
		driver.switchTo().alert().accept();
		
	}
	

}
