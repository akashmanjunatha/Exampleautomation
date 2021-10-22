package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Frames
{
	public static WebDriver oBrowser=null;
	static void launchbrowser()
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
			Thread.sleep(2000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void framesTesting()
	{
		try
		{
			oBrowser.switchTo().frame(0);
			//oBrowser.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
			oBrowser.findElement(By.linkText("org.openqa.selenium")).click();
			oBrowser.switchTo().defaultContent();
			Thread.sleep(2000);
			oBrowser.switchTo().frame("packageFrame");
			oBrowser.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[14]/a/span")).click();
			oBrowser.switchTo().defaultContent();
			Thread.sleep(2000);
			//difference approach
			WebElement oFame=oBrowser.findElement(By.name("classFrame"));
			oBrowser.switchTo().frame(oFame);
			String content=oBrowser.findElement(By.xpath("/html/body/main/div[2]")).getText();			
			System.out.print(content);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class Framesdemo1 {

	public static void main(String[] args) { 
		Frames.launchbrowser();
		Frames.navigate();
		Frames.framesTesting();

	}

}
