package example;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.Testbase;

public class Flipkartpage extends Testbase
{

	
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	WebElement closebutton;
	
	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
	WebElement searchfiled;
	
	@FindBy(xpath="//button[@class='vh79eN']")
	WebElement serachicon;
	
	
	
	
	@FindBy(xpath="//*[@class='_1vC4OE _2rQ-NK']")
	List<WebElement> productlist;
	
	public Flipkartpage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void Searchproduct() throws ParseException
	{
		closebutton.click();
		searchfiled.sendKeys("iPhone XR(64GB)-Yellow"); 
		serachicon.click();
	}
	
	public int getflipkartprice()
	{
		int Flipkartprice=0;
	
		for (WebElement webElement : productlist) {
			String flipkartprice=webElement.getText();
			flipkartprice.replaceAll("^\"|\"$", "");
		
			
			String flipkartpricevalue=flipkartprice.substring(1);
			Flipkartprice = Integer.parseInt(flipkartpricevalue.replaceAll(",", ""));
			System.out.println("Flipkart price    "+Flipkartprice );
			
			break;
		}
		return Flipkartprice;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
