package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private WebDriver driver;
    private By firstProductName = By.cssSelector(".cart_item .inventory_item_name");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFirstProductName() {
        return driver.findElement(firstProductName).getText();
    }
}

