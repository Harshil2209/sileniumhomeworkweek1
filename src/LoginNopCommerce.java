import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginNopCommerce {
    static String baseUrl = "https://demo.nopcommerce.com/";
    static String browser = "Chrome";
  //static String browser = "Firefox";
  //static String browser = "Edge";
  //static String browser = "Safari";


    public static void main(String[] args) throws InterruptedException {
        //Setup Chrome browser
        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();
       // WebDriver driver = new FirefoxDriver();  //setup firefox browser
       // WebDriver driver = new EdgeDriver();  //Setup Edge browser
       // WebDriver driver = new SafariDriver();  //Setup Safari browser

        System.setProperty("webdriver.chromedriver","chromedriver.exe"); //Selenium will use the ChromeWebDriver executable to control Chrome browser instatnces when you run your scripts
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //An implicit wait tells Selenium to wait for a certain amount of time before throwing an exception when trying to
        //find an element on a web page
        driver.manage().window().maximize();//This will maximize the browser

        //Open Url into browser
        driver.get(baseUrl);

        //Print the title of the Page
        String title = driver.getTitle();
        System.out.println("Title of the page is : " + driver.getTitle());

        //Print the current Url
        System.out.println("The current Url: " + driver.getCurrentUrl());

        //Print the page source
        String pageSource = driver.getPageSource();
        System.out.println(driver.getPageSource());
        Thread.sleep(5000);

        //Navigate to Url "https://demo.nopcommerce.com/login?returnUrl=%2F”
       driver.get ("https://demo.nopcommerce.com/login?returnUrl=%2F");
      // driver.navigate().to(new URL());

        //Print the current Url
        System.out.println(driver.getCurrentUrl());

        //Navigate back to the homepage
        driver.navigate().back();

        //Navigate to the login page
        WebElement logInLink = driver.findElement(By.linkText("Log in"));
        logInLink.click();

        //Print the current Url
        System.out.println(driver.getCurrentUrl());

        //Refresh the page
        driver.navigate().refresh();

        //Enter the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("harry123@gmail.com");

        //Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("harry123");

        //Click on login Button
        WebElement loginLink = driver.findElement(By.linkText("Log in"));


        //close browser
        driver.quit();

    }
}
