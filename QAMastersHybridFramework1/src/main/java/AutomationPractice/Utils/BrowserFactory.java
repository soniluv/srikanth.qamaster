package AutomationPractice.Utils;

import AutomationPractice.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory extends  BasePage {
    public static void startBrowser() {
        String path = System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");


        if (AutomationConstants.BROWSER_TYPE.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", path + "geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (AutomationConstants.BROWSER_TYPE.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (AutomationConstants.BROWSER_TYPE.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", path + "IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }


        driver.get(AutomationConstants.baseURL);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
    }

    public static void stopBrowser() {
        if (driver != null) {
            driver.close();
          driver.quit();
        }
    }

    public static WebDriver getDriver() {
        if (driver == null) {

            BrowserFactory.startBrowser();
        }
        return driver;
    }
}
