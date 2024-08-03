package phptravelscases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class testregesteration {
	WebDriver driver=null;
	@BeforeTest
	public  void setup(){
		String baseUrl = "https://phptravels.com/demo/";
		System.setProperty("webdriver.gecko.driver","D:\\Tessting\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(baseUrl);
	}
	@Test
	public void fill() {

		String actualTitle = driver.getTitle();
		System.out.println("actualTitle"+ actualTitle);

		WebElement FirstName	 = driver.findElement(By.name("first_name"));
		FirstName.sendKeys("Shady");


		WebElement LastName	 = driver.findElement(By.className("last_name"));
		LastName.sendKeys("Mohammed");

		WebElement businessName	 = driver.findElement(By.className("business_name"));
		businessName.sendKeys("Automation");

		WebElement Email = driver.findElement(By.className("email"));
		Email.sendKeys("shadyMohamed@gmail.com");

		WebElement number1	= driver.findElement(By.id("numb1"));
		String num1= number1.getText();
		Integer.parseInt(num1);

		WebElement number2	 = driver.findElement(By.id("numb2"));
		String num2= number2.getText();
		Integer.parseInt(num2);

		int  sum =Integer.parseInt(num2)+ Integer.parseInt(num1);
		driver.findElement(By.id("number")).sendKeys(String.valueOf(sum));}

	@AfterTest
	public void closedriver() {
		driver.findElement (By.id("demo")).click();
		driver.quit();
	}
}


