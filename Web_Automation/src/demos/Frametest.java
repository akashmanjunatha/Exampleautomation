package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class FramesTest
{
	public static WebDriver oBrowser=null;
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Example automation\\eclipse-java-2021-06-R-win32-x86_64\\Automation\\Web_Automation\\Library\\drivers\\chromedriver.exe");
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
			oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void framesTesting()
	{
		try
		{
			oBrowser.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class Frametest {
	public static void main(String[] args) {
		FramesTest.launchBrowser();
		FramesTest.navigate();
		FramesTest.framesTesting();
	}

}