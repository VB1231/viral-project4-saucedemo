import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class SauceDemoEdge {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get(baseUrl);
        //maximise the screen
        driver.manage().window().maximize();
        //set delay time for browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the page source
        System.out.println(driver.getPageSource());
        //get the title
        System.out.println(driver.getTitle());
        //get the current url
        System.out.println(driver.getCurrentUrl());
        //set username
        WebElement userField = driver.findElement(By.id("user-name"));
        userField.sendKeys("standard_user");
        //set password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");
        //close browser
        driver.quit();
    }
}
