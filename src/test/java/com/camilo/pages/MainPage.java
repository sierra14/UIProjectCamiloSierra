package com.camilo.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Ability;
import org.openqa.selenium.WebDriver;

public class MainPage extends PageObject {

    public void openHomePage() {
        // Asegúrate de que el navegador esté correctamente configurado
        Serenity.getDriver().get("https://www.floristeriamundoflor.com/");
    }

}
