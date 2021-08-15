package Week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://www.opencart.com/index.php?route=account/register");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement webEle1 = driver.findElement(By.id("input-username"));
		 webEle1.sendKeys("ABC");
		 driver.findElement(By.id("input-firstname")).sendKeys("jan");
		 driver.findElement(By.id("input-lastname")).sendKeys("N");
		 driver.findElement(By.id("input-email")).sendKeys("abcd1@gmail.com");
		 WebElement webEle2 = driver.findElement(By.id("input-country"));
		 Select drpDwn =new  Select(webEle2);
		 drpDwn.selectByValue("99");
		 driver.findElement(By.id("input-password")).sendKeys("123A@1");
		 		
		// TODO Auto-generated method stub

	}

}
