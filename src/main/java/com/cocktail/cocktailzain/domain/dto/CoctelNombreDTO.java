package com.cocktail.cocktailzain.domain.dto;

import java.util.ArrayList;

public class CoctelNombreDTO{
    private ArrayList<DrinksDTO> drinks;

    public ArrayList<DrinksDTO> getDrinks() {
        return drinks;
    }

    public void setDrinks(ArrayList<DrinksDTO> drinks) {
        this.drinks = drinks;
    }
}
