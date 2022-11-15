import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SauceDemoChrome {
    public static void main(String[] args) {
        String baseUrl="https://www.saucedemo.com/";
        System.setProperty("webdrive.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(baseUrl);
        //maximise the window
        driver.manage().window().maximize();
        //time delay set
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get page source
        System.out.println(driver.getPageSource());
        //get title
        System.out.println(driver.getTitle());
        //get current url
        System.out.println(driver.getCurrentUrl());
        //set username
        WebElement userField = driver.findElement(By.id("user-name"));
        userField.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");
        //click on submit /login
        WebElement submitField = driver.findElement(By.id("login-button"));
        submitField.click();
        //close Browser
        driver.quit();
    }
}
