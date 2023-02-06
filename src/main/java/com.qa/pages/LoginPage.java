package com.qa.pages;

import org.openqa.selenium.By;

import static com.qa.base.Base.driver;

public class LoginPage{

    By txtBoxEmail=By.id("input-email");
    By txtBoxPassword=By.id("input-password");
    By btnLogin=By.xpath("//button[text()='Login']");
    By titleLoginPage=By.xpath("//h2[text()='Returning Customer']");
    By lnkForgotPassword=By.xpath("(//a[text()='Forgotten Password'])[1]");

    public void Login()
    {
        driver.findElement(txtBoxEmail).sendKeys("john@gmail.com");
        driver.findElement(txtBoxPassword).sendKeys("Test@123");
        driver.findElement(btnLogin).click();
    }
    public boolean IsTitleDisplayed() {
        return driver.findElement(titleLoginPage).isDisplayed();
    }
    public ForgotPasswordPage ClickForgotPassword()
    {
        driver.findElement(lnkForgotPassword).click();
        return new ForgotPasswordPage();
    }

}
