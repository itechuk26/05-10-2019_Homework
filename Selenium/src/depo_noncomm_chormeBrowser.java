import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by : Divyesh Patel
 * since : Saturday  05/10/2019
 * Time  : 19:45
 **/

public class depo_noncomm_chormeBrowser {

    public static void main(String[] args)
    {
        String baseurl = "https://demo.nopcommerce.com/";
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement login_link = driver.findElement(By.linkText("Log in"));
        login_link.click();

        WebElement email_field = driver.findElement(By.id("Email"));
        email_field.sendKeys("dev_patelin@yahoo.com");

        WebElement password_field = driver.findElement(By.id("Password"));
        password_field.sendKeys("Raja1234");

        WebElement login_button = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        login_button.click();
    }
}
