package com.qa.pages;

import org.openqa.selenium.By;

import static com.qa.base.Base.driver;

public class RegistrationPage {
   By txtBoxFirstName=By.id("input-firstname");
   By txtBoxLastName=By.id("input-lastname");
   By txtBoxEmail=By.id("input-email");
   By txtBoxPassword=By.id("input-password");
   By rdoBtnNewsLetterYes=By.id("input-newsletter-yes");
   By chkBoxAgree=By.name("agree");
   By btnContinue=By.xpath("//button[text()='Continue']");
   By titleRegisterAccount=By.xpath("//h1[text()='Register Account']");


   public void RegisterAccount()
   {
       driver.findElement(txtBoxFirstName).sendKeys("John");
       driver.findElement(txtBoxLastName).sendKeys("Michael");
       driver.findElement(txtBoxEmail).sendKeys("john@gmail.com");
       driver.findElement(txtBoxPassword).sendKeys("Test@123");
       driver.findElement(rdoBtnNewsLetterYes).click();
       driver.findElement(chkBoxAgree).click();
       driver.findElement(btnContinue).click();
   }
    public boolean IsTitleDisplayed() {
        return driver.findElement(titleRegisterAccount).isDisplayed();
    }
}
