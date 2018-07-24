Feature: User see the product in the basket page
  As a user
  I want to select the product
  So that I can see the product in basket page

  Background:
    Given User is on the home page
@basket
    Scenario Outline: User should be able to select the product and send to the basket
      When User selects the DRESSES
      Then User can see the Dresses "<Options>"
      And User selects one of options from "<categories>"
      Then User is able to see the available product
      And User clicks on the product
      Then User can see the Add to cart page
      And User clicks on Add to cart
      Then User can see the product added to into shopping cart
      And User clicks on Proceeds to checkout
      Then User can see the product into shopping cart summery
  Examples:
        | Options | categories |
        | Casual Dresses | Evening Dresses|




