package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    @Test
    public void testAddProductToCart() {
        // Se connecter
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce"); // utilisateur de test SauceDemo

        // Ajouter un produit
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addBoltTShirtToCart();
        productsPage.goToCart();

        // Vérifier le panier
        CartPage cartPage = new CartPage(driver);
        String productName = cartPage.getFirstProductName();
        System.out.println("Produit ajouté au panier : " + productName);

        Assert.assertNotNull(productName, "Le nom du produit ne doit pas être null");
        Assert.assertFalse(productName.isEmpty(), "Le nom du produit ne doit pas être vide");
    }
}

