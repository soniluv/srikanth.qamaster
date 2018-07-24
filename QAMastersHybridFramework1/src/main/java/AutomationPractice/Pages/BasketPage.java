package AutomationPractice.Pages;

import AutomationPractice.Utils.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasketPage extends BasePage {
    public Utils myUtility = new Utils();

    @FindBy(linkText = "DRESSES")
    private WebElement dressesOptions;

    @FindBy(css = "div.product-container")
    private WebElement seeAvailableProducts;

    @FindBy(css = ".product_img_link")
    private List<WebElement> clicksOnProducts;

   @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
   private WebElement clickingAddToCartPage;

   @FindBy(xpath = "//a[@title='Proceed to checkout']//span")
   private WebElement proceedsToCheckOut;

    public BasketPage() {
        PageFactory.initElements(driver, this);
    }

    public void selectDresses(){
        dressesOptions.click();
    }

    public void assertUserCanViewDressesOptions(String Options){
        Assert.assertTrue(driver.findElement(By.linkText(Options)).isDisplayed());
    }

    public void userSelectsOptionsfromCategories(String categories){
        driver.findElement(By.linkText(categories)).click();
    }
    public void assertUserAbleToSeeAvailableProducts(){
        Assert.assertTrue(seeAvailableProducts.isDisplayed());
    }
    public void userClicksOnTheProduct(){
        List<WebElement> displayedProducts= clicksOnProducts;
        displayedProducts.get(0).click();
    }
    public void assertUserCanSeeAddToCartPage(){
        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).isDisplayed());
    }
    public void clickAddToCartPage(){
        clickingAddToCartPage.click();
    }
    public void assertUserSeeProductAddedIntoShoppingCart(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='layer_cart_product col-xs-12 col-md-6']//h2")).isDisplayed());
    }
    public void userClicksOnProceedsToCheckout(){
        proceedsToCheckOut.click();
    }
    public void assertUserCanSeeProductIntoShoppingCartSummery(){
        Assert.assertTrue(driver.findElement(By.id("cart_title")).isDisplayed());
    }
}
