package Week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CreateLead {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 String Title1 = "My Home | opentaps CRM";
		 String homeTitle= driver.getTitle();
		 if (Title1.equals(homeTitle))
		 {System.out.println("Im in the Home page");
		 }
		 else
			 System.out.println("not in the Home page");
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jan");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("jan");
		 driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms");
		 driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/01/85");
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mrs");
		 driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("2,00,000");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		 WebElement webEle2 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select drpDwn= new Select(webEle2);
		 drpDwn.selectByIndex(1);
		 driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("2");
		 WebElement webEle3 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		 Select drpDwn1 = new Select(webEle3);
		 drpDwn1.selectByValue("CATRQ_CAMPAIGNS");
		  WebElement webEle4= driver.findElement(By.id ("createLeadForm_industryEnumId"));
		 Select drpDwn2 = new Select(webEle4);
		 drpDwn2.selectByVisibleText("Distribution");
		 WebElement webEle5= driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 Select drpDwn3 = new Select(webEle5);
		 drpDwn3 .selectByIndex(1);
		 driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("2");
		 driver.findElement( By.id("createLeadForm_tickerSymbol")).sendKeys ("1");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("This is descp Box");
		 driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Imprt note");
		 System.out.println("Filling Contact Information");
		 WebElement webEle6 = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
         webEle6.clear();
         webEle6.sendKeys("91");
         driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
         driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567");
         driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("12");
         driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("ABC");
         driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abcd1@gmail.com");
         driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.abcd.com");
          System.out.println("Filling Primary Address");
         driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("ABCD");
         driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Ab");
         driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("T.Nagar");
         driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
         WebElement webEle7 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
         Select drpDwn4 =new Select(webEle7);
         drpDwn4.selectByValue("AA");
         driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("1234");
         WebElement webEle8 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
         Select drpDwn5 = new Select(webEle8);
         drpDwn5.selectByVisibleText("India");
         driver.findElement(By.className("smallSubmit")).click();
         String title2 = "View Lead | opentaps CRM";
    	 String titleViewPage = driver.getTitle();
    	 if(title2.equals(titleViewPage))
    		 System.out.println("In View Page");
    	 else
    		 System.out.println("Not in View page");

    	
		
		 
		 

		 
	}
		 
		 
		
		
		
		
		
		
		
		
	

		
		
		
		
	
		
		
		
		// TODO Auto-generated method stub

	

}
