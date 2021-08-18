package stepDefs;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	
WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_on_login_page() throws InterruptedException{
		
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+ "/driver/chrome/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
		
	}
	
	@When("^title of the page is Swag Labs$") 
	public void title_of_the_page() throws InterruptedException	{
		String title = driver.getTitle();
		System.out.println("Title of this page is : "+title);
		Thread.sleep(1000);
		Assert.assertEquals("Swag Labs", title);
	}
	
	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws InterruptedException{
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
	}
	
	@And("^user clicks on Login button$")
	public void user_clicks_on_Login_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);
	}
	
	@When("^user clicks on sort container button$")
	public void user_clicks_on_sort_button() throws InterruptedException {
		driver.findElement(By.xpath("//select[@class='product_sort_container']")).sendKeys("Price (high to low)");
		Thread.sleep(2000);
		
	}
	
	@And("^user selects cheapest & the second costliest product$")
	public void user_selects_cheapest_and_secondCostliest_products() throws InterruptedException {
		
		List<WebElement> webElementList = driver.findElements(By.xpath("//div[@class='inventory_item_price']//following::button[text()='Add to cart']"));
		 webElementList.get(1).click();
		 Thread.sleep(2000);
		 webElementList.get(webElementList.size() - 1).click();
		 Thread.sleep(2000);
	}
	
	@When("^user opens the basket$")
	public void user_opens_the_basket() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='shopping_cart_container']")).click();
		Thread.sleep(2000);
	}
	
	@And("^user clicks on checkout button$")
	public void user_clicks_on_checkout_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		Thread.sleep(2000);
	}
	
	@Then("^user enter details and finish the purchase$")
	public void user_enter_details_and_finish_the_purchage() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Test_user_first_name");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Test_user_last_name");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("Test_user_post_code");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='checkout_buttons']//following::input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		Thread.sleep(1000);
			
	}
	
	@Then("^user verifies the order confirmation$")
	public void user_verfies_the_order(){
		String thanks_for_your_order = driver.findElement(By.xpath("(//*[text()='THANK YOU FOR YOUR ORDER'])")).getText();
		String order_dispatched = driver.findElement(By.xpath("(//*[@id='checkout_complete_container']//following::div[@class='complete-text'])")).getText();
		System.out.println(thanks_for_your_order);
		System.out.println(order_dispatched);
		Assert.assertEquals("THANK YOU FOR YOUR ORDER", thanks_for_your_order);
		Assert.assertEquals("Your order has been dispatched, and will arrive just as fast as the pony can get there!", order_dispatched);
		
	}
	
	@Then("^user veriies no of iframes on this page$")
	public void no_of_iframes() {
		int totalIframes = driver.findElements(By.xpath("//iframe")).size();
		System.out.println("Total no of iframes on this page is : "+totalIframes);
		List<WebElement> iframes = driver.findElements(By.xpath("//iframe"));
        System.out.println(iframes.size());
        for (WebElement iframe : iframes) {
        	driver.switchTo().frame(iframe);
            System.out.println(driver.findElement(By.id("sauce")).getText());
        }
		driver.quit();
	}

}
