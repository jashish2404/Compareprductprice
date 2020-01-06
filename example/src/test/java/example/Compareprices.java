package example;

public class Compareprices {

	
	public static void compareprice(int amazonprice ,int flipkartprice)
	{
		
		if(amazonprice>flipkartprice)
		{
			System.out.println("Price of iphone in Flipkart is cheaper");
			
		}
		
		else if (amazonprice<flipkartprice) 
		{
			System.out.println("Price of iphone in Amazon is cheaper");
		}
		
		else if (amazonprice<flipkartprice) 
		{
			System.out.println("Price of iphone in Amazon & Flipkart is same ");
		}
	}
	
	
}
