package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class rediffmoney {

	
	//initialize webdriver
	public static WebDriver driver ;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@Given("^i open browser with url \"([^\"]*)\"$")
	public void i_open_browser_with_url(String url) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	
	@When("^I click SignIn button$")
	public void i_click_SignIn_button()   {
		 
		driver.findElement(By.xpath("//a[@title='Already a user? Sign in']")).sendKeys(Keys.ENTER);
	}

	@Then("^i should see rediff money Login Page$")
	public void i_should_see_rediff_money_Login_Page()  {
		 if(driver.findElement(By.id("login")).isDisplayed()){
		    	System.out.println("Application launched successfully");
		    }
	}

	@When("^i enter Username as \"([^\"]*)\"$")
	public void i_enter_Username_as(String username)  {
		driver.findElement(By.id("useremail")).sendKeys(username);
	}

	@When("^i enter Password as \"([^\"]*)\"$")
	public void i_enter_Password_as(String pword)  {
		driver.findElement(By.id("userpass")).sendKeys(pword);
		
	}

	@When("^i click submit button$")
	public void i_click_submit_button() throws Throwable {
		driver.findElement(By.id("loginsubmit")).click();
		Thread.sleep(2000);
	}
	
	@Then("^i should see Portfolio page$")
	public void i_should_see_Portfolio_page() throws Throwable {
		Thread.sleep(1000);
		if(driver.findElement(By.xpath("//a[@class='black']")).isDisplayed()){
			   System.out.println("My Portfolio screen displayed");
		   }
	}
	
	//for portfolio stocks
	// for add stock1
	@Then("^i click add stock button$")
	public void i_click_add_stock_button() throws Throwable {
		driver.findElement(By.id("addStock")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("^i add stock name$")
	public void i_add_stock_name() throws Throwable {
		driver.findElement(By.id("addstockname")).sendKeys("hd");
		driver.findElement(By.xpath("//div[@id='14030055']")).click();
	}

	@Then("^i add date of purchase in stock$")
	public void i_add_date_of_purchase_in_stock() throws Throwable {
		driver.findElement(By.id("stockAddDate")).sendKeys("27-06-2022");
	}

	@Then("^i add quantity$")
	public void i_add_quantity() throws Throwable {
		driver.findElement(By.id("addstockqty")).sendKeys("5");
	}

	@Then("^i add purchase price$")
	public void i_add_purchase_price() throws Throwable {
		driver.findElement(By.id("addstockprice")).sendKeys("50000");
	}

	@Then("^i add exchange type$")
	public void i_add_exchange_type() throws Throwable {
		driver.findElement(By.xpath("//label[@for='bse']")).click();
	}

	@Then("^i click add button$")
	public void i_click_add_button() throws Throwable {
		driver.findElement(By.id("addStockButton")).click();
		Thread.sleep(2000);
	}

	

	// for add stock2
	@Given("^click add stock button second time$")
	public void click_add_stock_button_second_time()  {
		driver.findElement(By.id("addStock")).sendKeys(Keys.ENTER);
	}

	@Given("^add stock name second time$")
	public void add_stock_name_second_time()  {
		driver.findElement(By.id("addstockname")).sendKeys("re");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='12150008']")).click();
	}

	@Then("^add date of purchase second time$")
	public void add_date_of_purchase_second_time()  {
		driver.findElement(By.id("stockAddDate")).sendKeys("27-06-2022");
		
	}

	@Then("^add quantity second time$")
	public void add_quantity_second_time()  {
		driver.findElement(By.id("addstockqty")).sendKeys("10");
	}

	@Then("^add purchase price second time$")
	public void add_purchase_price_second_time()  {
		driver.findElement(By.id("addstockprice")).sendKeys("40000");
	}

	@Then("^add exchange type second time$")
	public void add_exchange_type_second_time()  {
		driver.findElement(By.xpath("//label[@for='bse']")).click();
		
	}

	@Then("^click add button second time$")
	public void click_add_button_second_time() throws InterruptedException {
		driver.findElement(By.id("addStockButton")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	// for add stock3
	@Given("^click add stock button third time$")
	public void click_add_stock_button_third_time()  {
		driver.findElement(By.id("addStock")).sendKeys(Keys.ENTER);
		
	}
	
	


	@Given("^add stock name third time$")
	public void add_stock_name_third_time()  {
		driver.findElement(By.id("addstockname")).sendKeys("as");
		driver.findElement(By.xpath("//div[@id='11580001']")).click();
	}

	@Then("^add date of purchase third time$")
	public void add_date_of_purchase_third_time()  {
		driver.findElement(By.id("stockAddDate")).sendKeys("27-06-2022");
		
	}

	@Then("^add quantity third time$")
	public void add_quantity_third_time()  {
		driver.findElement(By.id("addstockqty")).sendKeys("15");
	}

	@Then("^add purchase price third time$")
	public void add_purchase_price_third_time()  {
		driver.findElement(By.id("addstockprice")).sendKeys("30000");
	}

	@Then("^add exchange type third time$")
	public void add_exchange_type_third_time()  {
		driver.findElement(By.xpath("//label[@for='bse']")).click();
	}

	@Then("^click add button third time$")
	public void click_add_button_third_time() throws Throwable {
		driver.findElement(By.id("addStockButton")).click();
		Thread.sleep(2000);
	}
	
	
	//add MF1
		@Given("^add MF button$")
		public void add_MF_button() {
			driver.findElement(By.id("addmf")).click();
		}

		@Then("^add MF name$")
		public void add_MF_name() {
			driver.findElement(By.id("mfname")).sendKeys("mir");
			//Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='14053944,2066']")).click();
		}

		@Then("^add initial amount$")
		public void add_initial_amount() {
			driver.findElement(By.id("mfinitialAmt")).sendKeys("10000");
		}
		
		@Then("^add date of purchase in MF$")
		public void add_date_of_purchase_in_MF(){
			driver.findElement(By.id("addMFDate")).sendKeys("23-06-2022");
		}

		@Then("^add add unit$")
		public void add_add_unit()  {
			driver.findElement(By.id("mfprice")).sendKeys("1000");
		}

		@Then("^click MF button$")
		public void click_MF_button() throws InterruptedException{
			driver.findElement(By.id("addMFButton")).click();
			Thread.sleep(2000);
		}
		
		//add MF2
		

	@Given("^add MF button second time$")
	public void add_MF_button_second_time() {
		driver.findElement(By.id("addmf")).click();
	}

	@Then("^add MF name second time$")
	public void add_MF_name_second_time()  {
		driver.findElement(By.id("mfname")).sendKeys("sa");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='14058383,2066']")).click();
	}

	@Then("^add initial amount second time$")
	public void add_initial_amount_second_time()  {
		driver.findElement(By.id("mfinitialAmt")).sendKeys("10000");
		//Thread.sleep(1000);
		
		
	}

	@Then("^add date of purchase in MF second time$")
	public void add_date_of_purchase_in_MF_second_time() {
		driver.findElement(By.id("addMFDate")).sendKeys("23-06-2022");
	}

	@Then("^add add unit second time$")
	public void add_add_unit_second_time()  {
		driver.findElement(By.id("mfprice")).sendKeys("1000");
	}

	@Then("^click MF button second time$")
	public void click_MF_button_second_time() throws InterruptedException  {
		driver.findElement(By.id("addMFButton")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	//add MF3
	@Given("^add MF button third time$")
	public void add_MF_button_third_time(){
		driver.findElement(By.id("addmf")).sendKeys(Keys.ENTER);
	}

	@Then("^add MF name third time$")
	public void add_MF_name_third_time() {
		driver.findElement(By.id("mfname")).sendKeys("pf");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='14051397,2066']")).click();
	}

	@Then("^add initial amount third time$")
	public void add_initial_amount_third_time()  {
		driver.findElement(By.id("mfinitialAmt")).sendKeys("10000");
		
	}

	@Then("^add date of purchase in MF third time$")
	public void add_date_of_purchase_in_MF_third_time()  {
		driver.findElement(By.id("addMFDate")).sendKeys("23-06-2022");
	}

	@Then("^add add unit third time$")
	public void add_add_unit_third_time()  {
		driver.findElement(By.id("mfprice")).sendKeys("1000");
	}

	@Then("^click MF button third time$")
	public void click_MF_button_third_time() throws InterruptedException  {
		driver.findElement(By.id("addMFButton")).click();
		Thread.sleep(2000);
	}

	//delete portfolio stocks
	
	@Given("^i scroll page till add stock button$")
	public void i_scroll_page_till_add_stock_button() throws Throwable {
		WebElement addstokbtn = driver.findElement(By.id("addStock"));
		js.executeScript("arguments[0].scrollIntoView();", addstokbtn);
		Thread.sleep(1000);
	}


@When("^i click first stock radio button$")
public void i_click_first_stock_radio_button() throws Throwable {
	driver.findElement(By.xpath("//input[@id='equityid11580001']")).click();
}

@When("^i click first stock delete button$")
public void i_click_first_stock_delete_button() throws Throwable {
	driver.findElement(By.className("deleteEquity")).click();
	Alert alert1 = driver.switchTo().alert();
	Thread.sleep(2000);
	alert1.accept();
	Thread.sleep(3000);
}

@Then("^i second stock click radio button$")
public void i_second_stock_click_radio_button() throws Throwable {
	driver.findElement(By.xpath("//input[@id='equityid14030055']")).click();
}

@Then("^i second stock click dete button$")
public void i_second_stock_click_dete_button() throws Throwable {
	driver.findElement(By.className("deleteEquity")).click();
	Thread.sleep(1000);
	Alert alert2 = driver.switchTo().alert();
	alert2.accept();
	Thread.sleep(3000);
}

@Then("^i third stock click radio button$")
public void i_third_stock_click_radio_button() throws Throwable {
	driver.findElement(By.xpath("//input[@id='equityid12150008']")).click();
}

@Then("^i third stock click delete button$")
public void i_third_stock_click_delete_button() throws Throwable {
	driver.findElement(By.className("deleteEquity")).click();
	Alert alert3 = driver.switchTo().alert();
	alert3.accept();
	Thread.sleep(3000);
}


//delete portfolio MF 


@Given("^i click first MF radio button$")
public void i_click_first_MF_radio_button() throws Throwable {
driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[4]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")).click();
}

@Then("^i click first MF delete button$")
public void i_click_first_MF_delete_button() throws Throwable {
driver.findElement(By.xpath("//tr[@class='active_tr']//input[@title='Delete']")).click();
Alert alert4 = driver.switchTo().alert();
alert4.accept();
Thread.sleep(3000);
}

@Then("^i click second MF radion button$")
public void i_click_second_MF_radion_button() throws Throwable {
driver.findElement(By.xpath("//input[@name='rdmfid']")).click();
Thread.sleep(1000);
}

@Then("^i click second MF delete button$")
public void i_click_second_MF_delete_button() throws Throwable {
driver.findElement(By.xpath("//input[@class='deleteMutualFund']")).click();
Alert alert5 = driver.switchTo().alert();
alert5.accept();
Thread.sleep(2000);
}

@Then("^i click third MF radio button$")
public void i_click_third_MF_radio_button() throws Throwable {
	driver.findElement(By.xpath("//input[@name='rdmfid']")).click();
}

@Then("^i click third MF delte button$")
public void i_click_third_MF_delte_button() throws Throwable {
	driver.findElement(By.xpath("//input[@class='deleteMutualFund']")).click();
	Alert alert6 = driver.switchTo().alert();
	alert6.accept();
	Thread.sleep(2000);
}

// my watchlist add stock 1


@When("^i click on my watchlist icon$")
public void i_click_on_my_watchlist_icon() throws Throwable {
	driver.findElement(By.xpath("//a[normalize-space()='My Watchlist']")).click();
	Thread.sleep(2000);
}

@Then("^i click on watchlist add stock one$")
public void i_click_on_watchlist_add_stock_one() throws Throwable {
	driver.findElement(By.id("add-stock-button")).sendKeys(Keys.ENTER);
}

@Then("^i enter add stock name one time$")
public void i_enter_add_stock_name_one_time() throws Throwable {
	driver.findElement(By.id("stocksearch")).sendKeys("sa");
	driver.findElement(By.xpath("//div[@id='10670029']")).click();
	Thread.sleep(1000);
}

@Then("^i add max rs one time$")
public void i_add_max_rs_one_time() throws Throwable {
	driver.findElement(By.id("maxprice")).sendKeys("30000");
}

@Then("^i add min rs one time$")
public void i_add_min_rs_one_time() throws Throwable {
	driver.findElement(By.id("minprice")).sendKeys("20000");
}

@Then("^click add button one time$")
public void click_add_button_one_time() throws Throwable {
	driver.findElement(By.id("add-stock-submit")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
}

//Mywatchlist add stock2


@Given("^i click on watchlist add stock second time$")
public void i_click_on_watchlist_add_stock_second_time() throws Throwable {
	driver.findElement(By.id("add-stock-button")).click();
}

@Then("^i enter add stock name second time$")
public void i_enter_add_stock_name_second_time() throws Throwable {
	driver.findElement(By.id("stocksearch")).sendKeys("ds");
	//Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@id='17010024']")).click();
}

@Then("^i add max rs second time$")
public void i_add_max_rs_second_time() throws Throwable {
	driver.findElement(By.id("maxprice")).sendKeys("30000");
}

@Then("^i add min rs second time$")
public void i_add_min_rs_second_time() throws Throwable {
	driver.findElement(By.id("minprice")).sendKeys("20000");
}

@Then("^click mywatchlist add button second time$")
public void click_mywatchlist_add_button_second_time() throws Throwable {
	driver.findElement(By.id("add-stock-submit")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
}


//mywatchlist add stock 3

@Given("^i click on watchlist add stock third time$")
public void i_click_on_watchlist_add_stock_third_time() throws Throwable {
	driver.findElement(By.id("add-stock-button")).sendKeys(Keys.ENTER);
}

@Then("^i enter add stock name third time$")
public void i_enter_add_stock_name_third_time() throws Throwable {
	driver.findElement(By.id("stocksearch")).sendKeys("jg");
	driver.findElement(By.xpath("//div[@id='11060038']")).click();
}

@Then("^i add max rs third time$")
public void i_add_max_rs_third_time() throws Throwable {
	driver.findElement(By.id("maxprice")).sendKeys("30000");
}

@Then("^i add min rs third time$")
public void i_add_min_rs_third_time() throws Throwable {
	driver.findElement(By.id("minprice")).sendKeys("20000");
}

@Then("^click mywatchlist add button third time$")
public void click_mywatchlist_add_button_third_time() throws Throwable {
	driver.findElement(By.id("add-stock-submit")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
}

//mywatchlist add MF1


@Given("^i clik watchlist MF one time$")
public void i_clik_watchlist_MF_one_time() throws Throwable {
	driver.findElement(By.id("add-mf-button")).click();
}

@Then("^i add MF name one time$")
public void i_add_MF_name_one_time() throws Throwable {
	driver.findElement(By.id("mfsearch")).sendKeys("sd");
	driver.findElement(By.xpath("//div[@id='140517182,2066']")).click();
}

@Then("^i add max price one time$")
public void i_add_max_price_one_time() throws Throwable {
	driver.findElement(By.id("mfmaxprice")).sendKeys("20000");
}

@Then("^i add minprice first time$")
public void i_add_minprice_first_time() throws Throwable {
	driver.findElement(By.id("mfminprice")).sendKeys("10000");
}

@Then("^i click watlict MF button one time$")
public void i_click_watlict_MF_button_one_time() throws Throwable {
	driver.findElement(By.id("add-mf-submit")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
}

//mywatchlist add MF 2

@Given("^i clik watchlist MF second time$")
public void i_clik_watchlist_MF_second_time() throws Throwable {
	driver.findElement(By.id("add-mf-button")).click();
}

@Then("^i add MF name second time$")
public void i_add_MF_name_second_time() throws Throwable {
	driver.findElement(By.id("mfsearch")).sendKeys("ka");
	driver.findElement(By.xpath("//div[@id='140513985,2066']")).click();
}

@Then("^i add max price second time$")
public void i_add_max_price_second_time() throws Throwable {
	driver.findElement(By.id("mfmaxprice")).sendKeys("20000");
}

@Then("^i add minprice second time$")
public void i_add_minprice_second_time() throws Throwable {
	driver.findElement(By.id("mfminprice")).sendKeys("10000");
}

@Then("^i click watlict MF button second time$")
public void i_click_watlict_MF_button_second_time() throws Throwable {
	driver.findElement(By.id("add-mf-submit")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
}

@Given("^i clik watchlist MF third time$")
public void i_clik_watchlist_MF_third_time() throws Throwable {
	driver.findElement(By.id("add-mf-button")).sendKeys(Keys.ENTER);
}

@Then("^i add MF name third time$")
public void i_add_MF_name_third_time() throws Throwable {
	driver.findElement(By.id("mfsearch")).sendKeys("ry");
	driver.findElement(By.xpath("//div[@id='140516202,2067']")).click();
}

@Then("^i add max price third time$")
public void i_add_max_price_third_time() throws Throwable {
	driver.findElement(By.id("mfmaxprice")).sendKeys("60000");
}

@Then("^i add minprice third time$")
public void i_add_minprice_third_time() throws Throwable {
	driver.findElement(By.id("mfminprice")).sendKeys("30000");
}

@Then("^i click watlict MF button third time$")
public void i_click_watlict_MF_button_third_time() throws Throwable {
	driver.findElement(By.id("add-mf-submit")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
}

//delete mywatch list stocks


@Given("^i click delete stock one link$")
public void i_click_delete_stock_one_link() throws Throwable {
	driver.findElement(By.xpath("//tr[@id='17010024row']//img[@alt='Delete']")).click();
}

@Then("^i click delete yes confirm button one time$")
public void i_click_delete_yes_confirm_button_one_time() throws Throwable {
	driver.findElement(By.xpath("//tr[@id='17010024row']//a[@class='delete-stock-confirm'][normalize-space()='Yes']")).click();
	Thread.sleep(2000);}

@Then("^i clik delete stock second link$")
public void i_clik_delete_stock_second_link() throws Throwable {
	driver.findElement(By.xpath("//tr[@id='11060038row']//img[@alt='Delete']")).click();
}

@Then("^i click delete yes confiem button second time$")
public void i_click_delete_yes_confiem_button_second_time() throws Throwable {
	driver.findElement(By.xpath("//tr[@id='11060038row']//a[@class='delete-stock-confirm'][normalize-space()='Yes']")).click();
	Thread.sleep(2000);
}

@Then("^i click delete stock third link$")
public void i_click_delete_stock_third_link() throws Throwable {
	driver.findElement(By.xpath("//tr[@id='10670029row']//img[@alt='Delete']")).click();
}

@Then("^i click delete yes confirm button third time$")
public void i_click_delete_yes_confirm_button_third_time() throws Throwable {
	driver.findElement(By.xpath("//tr[@id='10670029row']//a[@class='delete-stock-confirm'][normalize-space()='Yes']")).click();
	Thread.sleep(2000);
}

//delete mywatchlist mutual funds

@Given("^i click delete MF one link$")
public void i_click_delete_MF_one_link() throws Throwable {
	driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/a[1]/img[1]")).click();
	Thread.sleep(1000);
}

@Then("^i click MF delete yes confirm button one time$")
public void i_click_MF_delete_yes_confirm_button_one_time() throws Throwable {
	driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[3]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[8]/div[2]/span[2]/a[1]")).click();
	Thread.sleep(2000);
}

@Then("^i clik MF delete stock second link$")
public void i_clik_MF_delete_stock_second_link() throws Throwable {
	driver.findElement(By.xpath("//a[@class='delete-mf-action']//img[@alt='Delete']")).click();
}

@Then("^i click MF delete yes confiem button second time$")
public void i_click_MF_delete_yes_confiem_button_second_time() throws Throwable {
	driver.findElement(By.xpath("//a[@class='delete-mf-confirm']")).click();
	Thread.sleep(2000);
}

@Then("^i click MF delete stock third link$")
public void i_click_MF_delete_stock_third_link() throws Throwable {
	driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/a[1]/img[1]")).click();
	
}

@Then("^i click MF delete yes confirm button third time$")
public void i_click_MF_delete_yes_confirm_button_third_time() throws Throwable {
	driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[3]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[8]/div[2]/span[2]/a[1]")).click();
	Thread.sleep(2000);
}


@Then("^i click signout button$")
public void i_click_signout_button() throws Throwable {
	driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
	Thread.sleep(1000);
	driver.quit();
}
}


