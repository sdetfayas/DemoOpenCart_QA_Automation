package com.qa.pages;

import org.openqa.selenium.By;

import static com.qa.base.Base.driver;

public class ProductPage {
    By alertSuccess = By.xpath("//*[@id='alert']/div");
    By btnAddtoCart = By.xpath("(//button[@aria-label='Add to Cart'])[1]");
    By lnkDescription = By.xpath("//a[text()='Description']");
    By lnkSpecification = By.xpath("//a[text()='Specification']");
    By lnkReviews= By.xpath("//a[text()='Reviews (0)']");
    public void AddToCart()
    {
        driver.findElement(btnAddtoCart).click();
    }
    public boolean IsSuccessAlertDisplayed() {
        return driver.findElement(alertSuccess).isDisplayed();
    }

    public boolean IsDescriptionDisplayed() {
        return driver.findElement(lnkDescription).isDisplayed();
    }
    public boolean IsSpecificationDisplayed() {
        return driver.findElement(lnkSpecification).isDisplayed();
    }
    public boolean IsReviewsDisplayed() {
        return driver.findElement(lnkReviews).isDisplayed();
    }




}
