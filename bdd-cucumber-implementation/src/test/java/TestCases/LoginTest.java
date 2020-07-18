package TestCases;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

public class LoginTest {
    public static WebDriver driver;
    public static String baseUrl;
    public static String userName = "aslihankcbs";
    public static String email = "kocabasasli66@gmail.com";
    public static String userPassword = "mobilhanem123";
    public static String confirmPassword = "mobilhanem123";

    @Given("I'm going to the register page")
    public void iGoingToTheLoginPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kocab\\OneDrive\\Masaüstü\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        driver.manage().timeouts().pageLoadTimeout(200, SECONDS);
        driver.manage().window().maximize();
        baseUrl = "http://test.mobilhanem.com.tr/registration/";
        driver.get(baseUrl);
    }

    @When("I'm filling in the username, email, password and confirm password field")
    public void iFillingTheUsernameAndPasswordFields() {
        driver.findElement(By.id("user_login")).sendKeys(userName);
        driver.findElement(By.id("user_email")).sendKeys(email);
        driver.findElement(By.id("user_pass")).sendKeys(userPassword);
        driver.findElement(By.id("user_confirm_password")).sendKeys(confirmPassword);
    }

    @And("I click the submit button")
    public void iClickTheLoginButton() {
        driver.findElement(By.xpath("//button[@type='submit']"));
    }

    @Then("I see the home page")
    public void iSeeTheHomePage() {
        Assert.assertEquals(driver.getTitle(), "Registration – Test Mobilhanem");
        driver.quit();
    }

}