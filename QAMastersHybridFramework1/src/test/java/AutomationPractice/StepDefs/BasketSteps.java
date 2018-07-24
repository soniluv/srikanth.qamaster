package AutomationPractice.StepDefs;

import AutomationPractice.Pages.BasketPage;
import AutomationPractice.Pages.HomePage;
import AutomationPractice.Utils.BrowserFactory;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class BasketSteps extends BrowserFactory{
    public BasketPage basketPage;
    public HomePage homePage;

    @When("^User selects the DRESSES$")
    public void user_selects_the_DRESSES() throws Throwable {
        basketPage = new BasketPage();
        basketPage.selectDresses();
    }

    @Then("^User can see the Dresses \"([^\"]*)\"$")
    public void user_can_see_the_Dresses(String Options) throws Throwable {
        basketPage = new BasketPage();
        basketPage.assertUserCanViewDressesOptions(Options);
    }

    @Then("^User selects one of options from \"([^\"]*)\"$")
    public void user_selects_one_of_options_from(String categories) throws Throwable {
        basketPage = new BasketPage();
        basketPage.userSelectsOptionsfromCategories(categories);
    }

    @Then("^User is able to see the available product$")
    public void user_is_able_to_see_the_available_product() throws Throwable {
        basketPage = new BasketPage();
        basketPage.assertUserAbleToSeeAvailableProducts();
    }

    @Then("^User clicks on the product$")
    public void user_clicks_on_the_product() throws Throwable {
        basketPage = new BasketPage();
        basketPage.userClicksOnTheProduct();
    }

    @Then("^User can see the Add to cart page$")
    public void user_can_see_the_Add_to_cart_page() throws Throwable {
        basketPage = new BasketPage();
        basketPage.assertUserCanSeeAddToCartPage();
    }

    @Then("^User clicks on Add to cart$")
    public void user_clicks_on_Add_to_cart() throws Throwable {
        basketPage = new BasketPage();
        basketPage.clickAddToCartPage();
    }

    @Then("^User can see the product added to into shopping cart$")
    public void user_can_see_the_product_added_to_into_shopping_cart() throws Throwable {
        basketPage = new BasketPage();
        basketPage.assertUserSeeProductAddedIntoShoppingCart();
    }

    @Then("^User clicks on Proceeds to checkout$")
    public void user_clicks_on_Proceeds_to_checkout() throws Throwable {
        basketPage = new BasketPage();
        basketPage.userClicksOnProceedsToCheckout();
    }

    @Then("^User can see the product into shopping cart summery$")
    public void user_can_see_the_product_into_shopping_cart_summery() throws Throwable {
        basketPage = new BasketPage();
        basketPage.assertUserCanSeeProductIntoShoppingCartSummery();
    }
}
