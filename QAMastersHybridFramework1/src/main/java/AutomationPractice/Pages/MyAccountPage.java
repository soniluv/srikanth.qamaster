package AutomationPractice.Pages;

import AutomationPractice.Utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by User on 19/11/2017.
 */
public class MyAccountPage extends BasePage {
    Utils myUtility = new Utils();

    @FindBy(css = ".info-account")
    private WebElement accountInfo;

    @FindBy(css = ".account")
    private WebElement accountName;

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isUserOnMyAccountPage() {

        myUtility.waitForElementVisible(accountInfo);
        return accountInfo.isDisplayed();
    }

    public String getAccountName() {

        return accountName.getText();
    }
}
