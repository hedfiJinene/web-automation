package com.saucedemo.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    // Déclaration du driver pour l'utiliser dans les tests
    protected WebDriver driver;

    // Cette méthode s'exécute avant chaque test (annotation TestNG)
    @BeforeMethod
    public void setUp() {
        // Configuration automatique du driver Chrome
        WebDriverManager.chromedriver().setup();

        // Création de l'instance du navigateur
        driver = new ChromeDriver();

        // Maximiser la fenêtre
        driver.manage().window().maximize();

        // Ouvrir le site SauceDemo
        driver.get("https://www.saucedemo.com/");

        System.out.println("✅ Navigateur lancé et page SauceDemo ouverte");
    }

    // Cette méthode s'exécute après chaque test (annotation TestNG)
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("🧹 Navigateur fermé");
        }
    }
}
