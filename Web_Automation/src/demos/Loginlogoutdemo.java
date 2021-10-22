package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ChromeBrowserTest1
{
	public static WebDriver oBrowser=null;
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Example automation\\eclipse-java-2021-06-R-win32-x86_64\\Automation\\Web_Automation\\Library\\drivers\\chromedriver.exe");//get the path by right click and property
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
			oBrowser.get("https://www.facebook.com/");
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
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("email")).sendKeys("akashkashim@gmail.com");
			oBrowser.findElement(By.name("pass")).sendKeys("akash");
			oBrowser.findElement(By.xpath("//*[@id='u_0_d_0+']")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class Loginlogoutdemo {
	public static void main(String[] args) {
		ChromeBrowserTest1.launchBrowser();
		ChromeBrowserTest1.navigate();
		
		ChromeBrowserTest1.login();
		//ChromeBrowserTest1.closeApplication();
		//ChromeBrowserTest1.minimizeFlyOutWindow();
		//ChromeBrowserTest1.logout();
		//ChromeBrowserTest1.closeApplication();
	}

}