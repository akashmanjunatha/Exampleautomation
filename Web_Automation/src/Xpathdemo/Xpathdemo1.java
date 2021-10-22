package Xpathdemo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class ChromeBrowserTest100
{
	public static WebDriver oBrowser=null;
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "G:\\ExampleAutomation\\Automation\\Web_Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.get("file:///G:/Desktop/Java_akash/Notes/selenium/xpath_day1_07_oct_2021/XPath_Day1_07_OCT_2021/Sample.html");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void absoluteXpathdemo()
	{
		oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("akash");
		oBrowser.findElement(By.xpath("html/body/div/form/input")).clear();
	}
	static void relativexpathusingtagnamealone()
	{
		//oBrowser.findElement(By.xpath("//input[2]")).sendKeys("akash");
		//oBrowser.findElement(By.xpath("//a[2]")).click();
		//oBrowser.findElement(By.xpath("//input[@id='pwd1pass1word1']")).sendKeys("akash");
		//oBrowser.findElement(By.xpath("//input[@name='submit1btn1' or @value='Submit']")).click();	
		//oBrowser.findElement(By.xpath("//*[@*='submit1btn1']")).click();	
		//List<WebElement> olink=oBrowser.findElements(By.xpath("//a[@href]"));
		//System.out.print(olink.size());
		//olink.get(1).click();
		//oBrowser.findElement(By.xpath("//a[text()='Apache POI']")).click();
		//oBrowser.findElement(By.xpath("//*[contains(text(),'Linux')]")).click();
		oBrowser.findElement(By.xpath("//input[@id='chk2linux']")).click();
	}
}
public class Xpathdemo1{
	public static void main(String[] args) {
		ChromeBrowserTest100.launchBrowser();
		ChromeBrowserTest100.navigate();
		//ChromeBrowserTest100.absoluteXpathdemo();
		ChromeBrowserTest100.relativexpathusingtagnamealone();
		//ChromeBrowserTest100.closeApplication();
		
	}

}
