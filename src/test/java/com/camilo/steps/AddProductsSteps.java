package com.camilo.steps;

import com.camilo.pages.MainPage;
import com.camilo.tasks.ViewCart;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.webdriver.WebDriverFacade;

public class AddProductsSteps {

    private MainPage mainPage;

    @Given("I am on the main page of the store")
    public void iAmOnTheMainPageOfTheStore() {
        mainPage.openHomePage();
    }

    @When("I select the {string} category")
    public void iSelectTheCategory(String category) {
        // Lógica para seleccionar la categoría
    }

    @Then("the products for this category will be displayed")
    public void theProductsForThisCategoryWillBeDisplayed() {
        // Verificar que los productos se muestran
    }

    @When("I click on {string} for the first product")
    public void iClickOnAddToCartForTheFirstProduct(String action) {
        // Lógica para agregar el primer producto al carrito
    }

    @When("I click on {string} for the second product")
    public void iClickOnAddToCartForTheSecondProduct(String action) {
        // Lógica para agregar el segundo producto al carrito
    }

    @When("I click on {string}")
    public void iClickOnCart(String action) {
        ViewCart.now().performAs(Actor.named("User"));
    }

    @Then("the added products should be displayed")
    public void theAddedProductsShouldBeDisplayed() {
        // Verificar que los productos agregados se muestran en el carrito
    }
}