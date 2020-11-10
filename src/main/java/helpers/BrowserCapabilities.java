package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BrowserCapabilities {

    public static WebDriver driver;

    public static WebDriver getBrowserInstance(String Browser){

        if(Browser == "chrome")
        {
            driver = new ChromeDriver();
        }
        else if (Browser == "firefox")
        {
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        return driver;
    }

}
