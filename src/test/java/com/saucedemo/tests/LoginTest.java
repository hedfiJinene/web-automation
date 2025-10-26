package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin() {
        // 🧠 Créer une instance de la page de login
        LoginPage loginPage = new LoginPage(driver);

        // 🏃 Effectuer l’action de login
        loginPage.login("standard_user", "secret_sauce");

        // 🔎 Vérifier que la page d’accueil est bien affichée
        String currentUrl = driver.getCurrentUrl();

        // ✅ Validation : si l’URL contient "inventory", cela signifie que le login est réussi
        Assert.assertTrue(currentUrl.contains("inventory"), "Échec du login : la page d'accueil n'est pas affichée !");
    }
}

