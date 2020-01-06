package testbase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;



public class Testbase 
{

	
	
public static WebDriver driver;
static Properties prop;
	
	

public Testbase()
{
	try {
		prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\example\\src\\test\\resources\\configfiles\\testdata.properties");
		prop.load(file);
		}
		catch (Exception e)
		{
		e.printStackTrace();
	
		}

}
	public  static void initialaisation()
	{
		
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
			driver=new ChromeDriver();
				
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public  void url(String url)
	{
		driver.get(prop.getProperty(url));
	}
}




