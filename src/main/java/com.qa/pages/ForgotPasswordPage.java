package com.qa.pages;

import org.openqa.selenium.By;

import static com.qa.base.Base.driver;

public class ForgotPasswordPage {
    By txtBoxEmail=By.id("input-email");
    By btnContinue=By.xpath("//button[text()='Continue']");
    By titleForgotPassword=By.xpath("//h1[text()='Forgot Your Password?']");
    public void EnterEmail()
    {
        driver.findElement(txtBoxEmail).sendKeys("john@gmail.com");
        driver.findElement(btnContinue).click();
    }
    public boolean IsTitleDisplayed() {
        return driver.findElement(titleForgotPassword).isDisplayed();
    }

}
