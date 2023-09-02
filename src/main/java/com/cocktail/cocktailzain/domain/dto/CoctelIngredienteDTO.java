package com.cocktail.cocktailzain.domain.dto;

import java.util.ArrayList;

public class CoctelIngredienteDTO {
    private ArrayList<DrinksIngredienteDTO> drinks;

    public ArrayList<DrinksIngredienteDTO> getDrinks() {
        return drinks;
    }

    public void setDrinks(ArrayList<DrinksIngredienteDTO> drinks) {
        this.drinks = drinks;
    }
}
