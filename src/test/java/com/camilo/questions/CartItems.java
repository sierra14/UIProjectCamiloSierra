package com.camilo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CartItems implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        // Implementar lógica para obtener los artículos del carrito
        return "";
    }

    public static CartItems displayed() {
        return new CartItems();
    }
}
