package NopCommerceAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;


public class BrowserSelector extends Utils
{
    LoadProp loadProps = new LoadProp();

    public void setUpBrowser()
    {
        String browser = loadProps.getProperty("Browser");
        if(browser.equalsIgnoreCase("Firefox")){

            System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\BrowserDriver\\geckodriver.exe");

            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("chrome")){

            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe");

            driver = new ChromeDriver();


        } else if(browser.equalsIgnoreCase("ie")){

            System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");

            driver = new InternetExplorerDriver();

        }
        else{

            System.out.println("Browser name is empty or typed wrong "+ browser );
        }



    }

}
