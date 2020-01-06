package example;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import testbase.Testbase;

public class Amazonpage extends Testbase
{

	
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchfiled;
	
	@FindBy(xpath="//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")
	WebElement serachicon;
	
	
	
	
	@FindBy(xpath="//span[@class='a-price-whole']")
	List<WebElement> productlist;
	
	public Amazonpage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void Searchproduct() throws ParseException
	{
		searchfiled.sendKeys("iPhone XR(64GB)-Yellow"); 
		serachicon.click();
		
		
	}
	
	public int getamazprice() throws ParseException
	{
		int amazonpricei=0;
		for (WebElement webElement : productlist) {
			String amazonprice=webElement.getText();
			amazonprice.replaceAll("^\"|\"$", "");
			amazonpricei = Integer.parseInt(amazonprice.replaceAll(",", ""));
			System.out.println("Amazon price    "+amazonpricei);
		
			break;
		}
		return amazonpricei;
		
	}
	

	
	
	
	
}
