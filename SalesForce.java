package Week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement webEle1 = driver.findElement(By.name("UserFirstName"));
		webEle1.sendKeys("ABCD");
		driver.findElement(By.name("UserLastName")).sendKeys("Jan");
		driver.findElement(By.name("UserEmail")).sendKeys("abcd1@gmail.com");
		
		WebElement webEle2 = driver.findElement(By.name("UserTitle"));
		Select drpDwn1 = new Select(webEle2);
		drpDwn1.selectByValue("Developer");
		
		driver.findElement(By.name("CompanyName")).sendKeys("ABCDE");
		WebElement webEle3 = driver.findElement(By.name("CompanyEmployees"));
		Select drpDwn2 = new Select(webEle3);
		drpDwn2.selectByValue("1600");
		
		driver.findElement(By.name("UserPhone")).sendKeys("123456789");
		
		WebElement companyCountry = driver.findElement(By.name("CompanyCountry"));
		Select drpDwn3 = new Select(companyCountry);
		drpDwn3.selectByVisibleText("India");	
		
		driver.findElement(By.className("checkbox-ui")).click();
	}
		// TODO Auto-generated method stub

	}


