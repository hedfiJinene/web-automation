package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    private WebDriver driver;

    // Bouton Add to Cart pour le produit spécifique
    private By addBoltTShirtButton = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private By cartIcon = By.id("shopping_cart_container");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Ajouter ce produit au panier
    public void addBoltTShirtToCart() {
        driver.findElement(addBoltTShirtButton).click();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }
}

