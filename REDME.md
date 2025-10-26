Ce projet contient des tests automatisés du site SauceDemo
 développés en Java avec Selenium et TestNG, en suivant le design Page Object Model (POM).
L’objectif est de valider le processus de connexion et d’assurer la stabilité fonctionnelle du site.

1_Prérequis

Java JDK 17 ou supérieur

Eclipse IDE ou IntelliJ IDEA

Maven intégré

Google Chrome (version 141 ou supérieure)

ChromeDriver compatible avec votre version de Chrome

2_Structure de projet
src/test/java
│
├── com.saucedemo.base      → Contient la classe BaseTest
├── com.saucedemo.pages     → Contient les pages (LoginPage, HomePage…)
└── com.saucedemo.tests     → Contient les tests (LoginTest…)

3_Exécution du test
Cloner le projet :
git clone https://github.com/hedfiJinene/Atlasproject.git


Ouvrir le projet dans Eclipse

Ouvrir le fichier LoginTest.java

Clic droit → Run As → TestNG Test

Technologies utilisées
Java 17
Selenium WebDriver 4.25
TestNG 7.10
Maven
Page Object Model

4_Résultat attendu

Lors de l’exécution :

Le navigateur s’ouvre

Le site SauceDemo se charge

Le test de connexion réussie s’exécute

Le navigateur se ferme automatiquement