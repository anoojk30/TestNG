package testscript;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AssignmentAlert extends Base {
	@Test
	public void alert()
	{
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement span=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions actions=new Actions(driver);
		actions.contextClick(span).build().perform();
		
	}
	@Test
	public void confirmationalert()
	{
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement click1=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions actions = new Actions(driver);
		actions.doubleClick(click1).build().perform();
		driver.switchTo().alert().accept();
		
	}
	@Test
	public void moveelement(){
		driver.navigate().to("https://demoqa.com/menu/");
		WebElement move=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(move).build().perform();
		
	}
	@Test
	
	public void dragdrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag=driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement drop=driver.findElement(By.xpath("//div[@class='drop-box ui-droppable']"));
		Actions actions=new Actions(driver);
		//actions.doubleClick().build().perform();
		//actions.moveToElement(drop).build().perform();
		actions.dragAndDrop(drag, drop).build().perform();
		
	}
	@Test
	public void addtocart() {
		driver.navigate().to("https://demowebshop.tricentis.com/register");
		WebElement gender=driver.findElement(By.xpath("//input[@id='gender-male']"));
		gender.click();
		WebElement firstname=driver.findElement(By.xpath("//input[@id='FirstName']"));
		firstname.sendKeys("Anooj");
		WebElement lastname=driver.findElement(By.xpath("//input[@id='LastName']"));
		lastname.sendKeys("K");
		WebElement Email=driver.findElement(By.xpath("//input[@id='Email']"));
		Email.sendKeys("anoojk30@gmail.com");
		WebElement Password=driver.findElement(By.xpath("//input[@id='Password']"));
		Password.sendKeys("Anooj@123");
		WebElement ConfirmPassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		ConfirmPassword.sendKeys("Anooj@123");
		WebElement register=driver.findElement(By.xpath("//input[@id='register-button']"));
		register.click();
		
		
	}
	@Test
	public void iframe() {
		driver.navigate().to("https://www.dezlearn.com/nested-iframes-example/");
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='parent_iframe']"));
		driver.switchTo().frame(iframe);
		WebElement parent=driver.findElement(By.xpath("//button[@id='u_5_5']"));
		parent.click();
		WebElement iframe1=driver.findElement(By.xpath("//iframe[@id='iframe1']"));
		driver.switchTo().frame(iframe1);
		WebElement child=driver.findElement(By.xpath("//button[@id='u_5_6']"));
		child.click();
	}
	@Test
	public void dropdown() {
		driver.navigate().to("https://www.geodatasource.com/software/country-region-dropdown-menu-demo");
		WebElement region=driver.findElement(By.xpath("//select[@class='form-control gds-cr']"));
		Select select=new Select(region);
		select.selectByVisibleText("India");
		WebElement country=driver.findElement(By.xpath("//select[@id='gds-cr-two']"));
		Select countrydropdown=new Select(country);
		countrydropdown.selectByVisibleText("Karnataka");
		
		
		
	}
	@Test
	public void alerts() {
		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		WebElement simple=driver.findElement(By.xpath("//button[@id='alertBox']"));
		simple.click();
		driver.switchTo().alert().accept();
		WebElement confirmation=driver.findElement(By.xpath("//button[@id='confirmBox']"));
		confirmation.click();
		driver.switchTo().alert().accept();
		WebElement prompt=driver.findElement(By.xpath("//button[@id='promptBox']"));
		prompt.sendKeys("Anooj");
		prompt.click();
		driver.switchTo().alert().accept();
		
	}
	@Test
	public void checkboxs() {
		driver.navigate().to("https://total-qa.com/checkbox-example/#google_vignette");
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement box:checkbox) 
			box.click();
		}
		@Test
		
		public void register() {
			
			driver.navigate().to("https://formsmarts.com/html-form-example");
			WebElement iframe=driver.findElement(By.xpath("//iframe[@class='fs_embed']"));
			driver.switchTo().frame(iframe);
			WebElement form=driver.findElement(By.xpath("//input[@placeholder='Your first name']"));
			form.sendKeys("Anooj");
			WebElement form1=driver.findElement(By.xpath("//input[@id='u_Sdt_338354']"));
			form1.sendKeys("K");
			WebElement form3=driver.findElement(By.xpath("//input[@id='u_Sdt_4608']"));
			form3.sendKeys("anoojk30@gmail.com");
			WebElement form4=driver.findElement(By.xpath("//select[@id='u_Sdt_338367']"));
			Select option=new Select(form4);
			option.selectByVisibleText("Support Inquiry");
			WebElement form5=driver.findElement(By.xpath("//textarea[@id='u_Sdt_4609']"));
			form5.sendKeys("Register");
			WebElement form6=driver.findElement(By.xpath("//input[@class='button-primary submit']"));
			form6.click();
			
		
	}
		@Test
		public void techlistic()
		{
			driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
			WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
			firstname.sendKeys("Anooj");
			WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
			lastname.sendKeys("K");
			WebElement gender=driver.findElement(By.xpath("//input[@id='sex-0']"));
			gender.click();
			WebElement experience=driver.findElement(By.xpath("//input[@id='exp-4']"));
			experience.click();
			WebElement date=driver.findElement(By.xpath("//input[@id='datepicker']"));
			date.sendKeys("02/08/2024");
			List<WebElement> profession=driver.findElements(By.xpath("//input[@name='profession']"));
			for(WebElement pro:profession)
			pro.click();	
			List<WebElement> tools=driver.findElements(By.xpath("//input[@id='tool']"));
			for(WebElement tool:tools)
			tool.click();
			WebElement continents=driver.findElement(By.xpath("//select[@id='continents']"));
			Select cont=new Select(continents);
			cont.selectByVisibleText("Asia");
			WebElement selenium=driver.findElement(By.xpath("//select[@id='selenium_commands']"));
			Select sele=new Select(selenium);
			sele.selectByVisibleText("Wait Commands");
			WebElement upload=driver.findElement(By.xpath("//input[@id='photo']"));
			upload.sendKeys("C:\\Users\\HP\\Downloads\\OIP.jfif");
			WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
			submit.click();
			
		
		}
		@Test
		
		public void robofill() {
			driver.navigate().to("https://www.roboform.com/filling-test-all-fields");
			WebElement title =driver.findElement(By.xpath("//input[@name='01___title']"));
			title.sendKeys("Mr");
			WebElement firstname=driver.findElement(By.xpath("//input[@name='02frstname']"));
			firstname.sendKeys("Anooj");
			WebElement middlename=driver.findElement(By.xpath("//input[@name='03middle_i']"));
			middlename.sendKeys("");
			WebElement lastname=driver.findElement(By.xpath("//input[@name='04lastname']"));
			lastname.sendKeys("K");
			WebElement fullname=driver.findElement(By.xpath("//input[@name='04fullname']"));
			fullname.sendKeys("Anooj K");
			WebElement company=driver.findElement(By.xpath("//input[@name='05_company']"));
			company.sendKeys("UST");
			WebElement position=driver.findElement(By.xpath("//input[@name='06position']"));
			position.sendKeys("Tester");
			WebElement add1=driver.findElement(By.xpath("//input[@name='10address1']"));
			add1.sendKeys("Trivandrum");
			WebElement add2=driver.findElement(By.xpath("//input[@name='11address2']"));
			add2.sendKeys("Nemom");
			WebElement addr2=driver.findElement(By.xpath("//input[@name='13adr_city']"));
			addr2.sendKeys("Triavndrum");
			WebElement state=driver.findElement(By.xpath("//input[@name='14adrstate']"));
			state.sendKeys("Kerala");
			WebElement country=driver.findElement(By.xpath("//input[@name='15_country']"));
			country.sendKeys("India");
			WebElement zip=driver.findElement(By.xpath("//input[@name='16addr_zip']"));
			zip.sendKeys("695020");
			WebElement home=driver.findElement(By.xpath("//input[@name='20homephon']"));
			home.sendKeys("0471");
			WebElement work=driver.findElement(By.xpath("//input[@name='21workphon']"));
			firstname.sendKeys("903753");
			WebElement fax=driver.findElement(By.xpath("//input[@name='22faxphone']"));
			fax.sendKeys("320");
			WebElement cell=driver.findElement(By.xpath("//input[@name='23cellphon']"));
			cell.sendKeys("537020");
			WebElement email=driver.findElement(By.xpath("//input[@name='24emailadr']"));
			email.sendKeys("Anoojk30@gnail.com");
			WebElement userid=driver.findElement(By.xpath("//input[@name='30_user_id']"));
			userid.sendKeys("Anoojk30");
			WebElement card=driver.findElement(By.xpath("//select[@name='40cc__type']"));
			Select select=new Select(card);
			select.selectByVisibleText("Master Card");
			WebElement ccnumber=driver.findElement(By.xpath("//input[@name='41ccnumber']"));
			ccnumber.sendKeys("12345");
			WebElement cvv=driver.findElement(By.xpath("//input[@name='43cvc']"));
			firstname.sendKeys("856");
			WebElement card1=driver.findElement(By.xpath("//select[@name='42ccexp_mm']"));
			WebElement card2=driver.findElement(By.xpath("//select[@name='43ccexp_yy']"));
			Select select1=new Select(card1);
			select1.selectByValue("2");
			Select select2=new Select(card2);
			select2.selectByValue("2020");
			WebElement month=driver.findElement(By.xpath("//select[@name='66mm']"));
			WebElement date=driver.findElement(By.xpath("//select[@name='67dd']"));
			WebElement year=driver.findElement(By.xpath("//select[@name='68yy']"));
			Select select3=new Select(month);
			select3.selectByValue("7");
			Select select4=new Select(date);
			select4.selectByValue("30");
			Select select5=new Select(year);
			select5.selectByValue("2009");
			WebElement username=driver.findElement(By.xpath("//input[@name='44cc_uname']"));
			username.sendKeys("Anooj");
			WebElement issuer=driver.findElement(By.xpath("//input[@name='45ccissuer']"));
			issuer.sendKeys("ICICI");
			WebElement ccnum=driver.findElement(By.xpath("//input[@name='46cccstsvc']"));
			ccnum.sendKeys("123456");
			WebElement sex=driver.findElement(By.xpath("//input[@name='60pers_sex']"));
			sex.sendKeys("Male");
			WebElement social=driver.findElement(By.xpath("//input[@name='61pers_ssn']"));
			social.sendKeys("5467");
			WebElement driv=driver.findElement(By.xpath("//input[@name='62driv_lic']"));
			driv.sendKeys("90908");
			WebElement age=driver.findElement(By.xpath("//input[@name='66pers_age']"));
			age.sendKeys("29");
			WebElement birth=driver.findElement(By.xpath("//input[@name='67birth_pl']"));
			birth.sendKeys("Trivandrum");
			WebElement income=driver.findElement(By.xpath("//input[@name='68__income']"));
			income.sendKeys("4500");
			WebElement custom=driver.findElement(By.xpath("//input[@name='71__custom']"));
			custom.sendKeys("Trivandrum");
			WebElement comment=driver.findElement(By.xpath("//input[@name='72__commnt']"));
			comment.sendKeys("Hello");
			WebElement reset=driver.findElement(By.xpath("//input[@value='Reset']"));
			reset.click();
			
			
			
		}
	
	
	

}
