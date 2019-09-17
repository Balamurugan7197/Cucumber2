package Cucumber;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomers {
WebDriver driver;
	


@Given("User should be in the Telecom home page")
public void user_should_be_in_the_Telecom_home_page() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bala\\eclipse-workspace\\CucumberSept\\driver\\chromedriver.exe");
driver = new ChromeDriver();  	
driver.get("http://demo.guru99.com/telecom/");

}

@Given("User click on Addcustomer button")
public void user_click_on_Addcustomer_button() {
driver.findElement(By.xpath("//a[text()='Add Customer']")).click();

}

@When("user enters the datas in the particular feild")
public void user_enters_the_datas_in_the_particular_feild() {
driver.findElement(By.xpath("//label[@for='done']")).click();
driver.findElement(By.id("fname")).sendKeys("Bala");
driver.findElement(By.id("lname")).sendKeys("Murugan");
driver.findElement(By.id("email")).sendKeys("bala@gmail.com");
driver.findElement(By.name("addr")).sendKeys("Madurai");
driver.findElement(By.id("telephoneno")).sendKeys("7418360467");

}

@When("user enters the datas in the particular feilds")
public void user_enters_the_datas_in_the_particular_feilds(DataTable dataTable) {
	
	List<String> datas = dataTable.asList(String.class);
	
	driver.findElement(By.xpath("//label[@for='done']")).click();
	driver.findElement(By.id("fname")).sendKeys(datas.get(0));
	driver.findElement(By.id("lname")).sendKeys(datas.get(1));
	driver.findElement(By.id("email")).sendKeys(datas.get(2));
	driver.findElement(By.name("addr")).sendKeys(datas.get(3));
	driver.findElement(By.id("telephoneno")).sendKeys(datas.get(4));
}


@When("user enters the data in the particular feilds")
public void user_enters_the_data_in_the_particular_feilds(DataTable dataTable) {
	
  Map<String,String > datas = dataTable.asMap(String.class, String.class);
	
	driver.findElement(By.xpath("//label[@for='done']")).click();
	driver.findElement(By.id("fname")).sendKeys(datas.get("fname"));
	driver.findElement(By.id("lname")).sendKeys(datas.get("lname"));
	driver.findElement(By.id("email")).sendKeys(datas.get("mail"));
	driver.findElement(By.name("addr")).sendKeys(datas.get("address"));
	driver.findElement(By.id("telephoneno")).sendKeys(datas.get("phno"));
}
@When("user click on submit button")
public void user_click_on_submit_button() {
driver.findElement(By.name("submit")).click();
}

@Then("User should be displayed customer id generated")
public void user_should_be_displayed_customer_id_generated() {
WebElement cusId = driver.findElement(By.xpath("(//td[@align='center'])[2]"));

Assert.assertTrue(cusId.isDisplayed());

}

}
