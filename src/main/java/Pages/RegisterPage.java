package Pages;

import org.openqa.selenium.By;

public class RegisterPage {
    public static By genderMale = By.id("gender-male");
    public static By genderFemale = By.id("gender-female");
    public static By firstName1 = By.id("FirstName");
    public static By lastName = By.id("LastName");
    public static By day = By.name("DateOfBirthDay");
    public static By month1 = By.name("DateOfBirthMonth");
    public static By year = By.name("DateOfBirthYear");
    public static By email1 = By.id("Email");
    public static By company1 = By.id("Company");
    public static By passwordNopCommerce = By.id("Password");
    public static By confirmPasswordNopCommerce = By.id("ConfirmPassword");
    public static By registerButtonNopCommerce = By.id("register-button");
    public static By successfulRegistrationText1 = By.className("result");
    public static By logoutButton = By.linkText("Log out");
    public static By loginButton = By.className("login-button");


}
