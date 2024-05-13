package pagepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucedemopage 
{
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"user-name\"]")
	WebElement user;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement pass;
	
	@FindBy(name = "login-button")
	WebElement login;
	
	@FindBy (xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement p1;
	
	@FindBy (xpath = "//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
	WebElement p2;
	
	@FindBy (xpath = "//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
	WebElement p3;
	
	@FindBy (xpath = "//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
	WebElement p4;
	
	@FindBy (xpath = "//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
	WebElement p5;
	
	@FindBy (xpath = "//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
	WebElement p6;
	
	@FindBy (xpath = "//*[@id=\"shopping_cart_container\"]/a")
	WebElement cart;
	
	@FindBy (xpath = "//*[@id=\"checkout\"]")
	WebElement checkout;
	
	@FindBy (xpath = "//*[@id=\"first-name\"]")
	WebElement firstname;
	
	@FindBy (xpath = "//*[@id=\"last-name\"]")
	WebElement lastname;
	
	@FindBy (xpath = "//*[@id=\"postal-code\"]")
	WebElement postal;
	
	@FindBy (xpath = "//*[@id=\"continue\"]")
	WebElement continuebutton;
	
	@FindBy (xpath = "//*[@id=\"react-burger-menu-btn\"]")
	WebElement hamburger;
	
	@FindBy (xpath = "//*[@id=\"inventory_sidebar_link\"]")
	WebElement allitems;
	
	@FindBy (xpath = "//*[@id=\"logout_sidebar_link\"]")
	WebElement logout;
	
	public Saucedemopage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Action Methods
	
	public void loginmethod(String Usrname, String Pssword)
	{
		user.sendKeys(Usrname);
		pass.sendKeys(Pssword);
	
	}
	
	public void loginbutton()
	{
		login.click();
	}
	
	public void addtocart()
	{
		//p1.click();
		//p2.click();
		//p3.click();
		//p4.click();
		//p5.click();
		//p6.click();
		
	List<WebElement> list = driver.findElements(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/button"));
	
	for(WebElement listofitems : list)
	{
		String text = listofitems.getText();
		
		if(text.equalsIgnoreCase("Add to cart"))
		{
			listofitems.click();
		}
	}
		
	}
	
	public void cart()
	{
		cart.click();
	}
	
	public void checkout()
	{
		checkout.click();
		
	}
	
	public void clear()
	{
		user.clear();
		pass.clear();
	}
	
	public void personaldetails()
	{
		firstname.sendKeys("Abc");
		lastname.sendKeys("Def");
		postal.sendKeys("325456");
	}
	
	public void continueclick()
	{
		continuebutton.click();
	}
	
	public void sidemenu()
	{
		hamburger.click();
	}
	
	public void home()
	{
		allitems.click();
	}

	public void logout()
	{
		logout.click();
	}
}
