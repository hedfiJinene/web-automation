package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    // Déclaration du driver
    private WebDriver driver;

    // 🎯 Localisateurs (éléments de la page)
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("h3[data-test='error']");

    // 🔧 Constructeur
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // 🧠 Méthodes d’action sur la page
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    // 💡 Méthode principale pour effectuer une connexion complète
    public void login(String username, String password) {
        enterUsername("standard_user");
        enterPassword("secret_sauce");
        clickLogin();
    }

    // 🔎 Méthode pour récupérer un message d’erreur (si login incorrect)
    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}
