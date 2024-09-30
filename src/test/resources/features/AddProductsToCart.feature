Feature: Add products to cart

  Scenario: Add two products from the "Agradecimientos" category to the cart
    Given I am on the main page of the store
    When I select the "Agradecimientos" category
    Then the products for this category will be displayed

    Given I am in the "Agradecimientos" category
    When I click on "Add to cart" for the first product
    Then the product will be added to the shopping cart

    When I click on "Add to cart" for the second product
    Then the second product will be added to the shopping cart

    Given I have added the products from the "Agradecimientos" category to the cart
    When I click on "CART"
    Then the added products should be displayed