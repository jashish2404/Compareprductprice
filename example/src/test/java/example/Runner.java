package example;

import java.text.ParseException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testbase.Testbase;

public class Runner extends Testbase
{
	Amazonpage amazonobj;
	Flipkartpage flipkartobj;
	
	Runner()
	{
		 super();	
		
	}
	
	@BeforeMethod
	public void setup()
	{
		initialaisation();
		amazonobj=new Amazonpage();
		
	}
	
	@Test()
	public void comapre() throws ParseException
	{
		amazonobj.url("amazonurl");
		amazonobj.Searchproduct(); 
		
		int amazonprice=amazonobj.getamazprice();
		
		flipkartobj=new Flipkartpage();
		flipkartobj.url("flipkart");
		flipkartobj.Searchproduct();
		
		int flipkartprice=flipkartobj.getflipkartprice();
		
		Compareprices.compareprice(amazonprice, flipkartprice);
		
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
		
	}
	
	
	
	
	
	
}
