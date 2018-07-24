package AutomationPractice.Pages;

import AutomationPractice.Utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by User on 19/11/2017.
 */
public class LoginPage extends BasePage {

    public Utils myUtility = new Utils();

    @FindBy(css = "input[id='email']")
    private WebElement emailField;

    @FindBy(css = "input[id='passwd']")
    private WebElement passwordField;

    @FindBy(css = "#SubmitLogin")
    private WebElement signInButton;

    @FindBy(xpath = ".//*[@id='login_form']")
    private WebElement loginForm;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isUserOnLoginPage() {
        myUtility.wait(loginForm);
        return loginForm.isDisplayed();
    }

    public void enterCredentials(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);

    }

    public void clickSignIn() {
        //@TODO scroll to the element and click
        signInButton.click();
    }

}
