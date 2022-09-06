package Pages;

import org.openqa.selenium.By;

public class LoginPageFacebook {

    public static By txtEmail = By.id("email");
    public static By txtEmailByName = By.name("email");
    public static By getTxtEmailByClass = By.className("inputtext _55r1 _6luy");

    public static By txtPassword = By.id("pass");
    public static By txtPasswordByName = By.name("pass");
    public static By txtPasswordByClass = By.className("inputtext _55r1 _6luy _9npi");

    public static By btnLogin = By.id("u_0_d_mA");
    public static By btnLoginByName = By.name("login");
    public static By btnLoginByClass = By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy");

    public static By btnForgotPassword = By.linkText("Forgot password?");
    public static By getBtnForgotPasswordByClass = By.className("_6ltj");



}
