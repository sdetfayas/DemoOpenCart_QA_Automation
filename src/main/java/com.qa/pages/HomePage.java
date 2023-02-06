package com.qa.pages;

import com.qa.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HomePage extends Base {
    By imgTitle = By.xpath("//img[@title='Your Store']");
    By lnkMyAccount = By.xpath("//span[text()='My Account']");
    By lnkRegister = By.xpath("//a[text()='Register']");
    By lnkLogin = By.xpath("//a[text()='Login']");
    By alertSuccess = By.xpath("//*[@id='alert']/div");
    By btnAddtoCart = By.xpath("(//button[@aria-label='Add to Cart'])[1]");
    By btnCompareProduct = By.xpath("(//button[@aria-label='Compare this Product'])[1]");
    By btnWishList = By.xpath("(//button[@aria-label='Add to Wish List'])[1]");
    By txtBoxSearch = By.name("search");
    By btnSearch = By.xpath("//*[@id='search']/button");
    By alertWishList = By.xpath("//*[@id='alert']/div");
    By lnkDesktops = By.xpath("//a[text()='Desktops']");
    By lnkMac = By.xpath("//a[text()='Mac (1)']");
    By product = By.xpath("//img[@title='MacBook']");
    By alertCompare = By.xpath("//*[@id='alert']/div");
    public boolean IsTitleDisplayed() {
           return driver.findElement(imgTitle).isDisplayed();
    }
    public void ClickMyAccount() {

        ClickByJS(driver.findElement(lnkMyAccount));
    }

    public RegistrationPage ClickRegister() {
        driver.findElement(lnkRegister).click();
        return new RegistrationPage();
    }
    public LoginPage ClickLogin() {
        driver.findElement(lnkLogin).click();
        return new LoginPage();
    }
    public void ClickByJS(WebElement element)
    {
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", element);
    }

    public void SearchProduct()
    {
        driver.findElement(txtBoxSearch).sendKeys("iPhone");
        driver.findElement(btnSearch).click();

    }
    public void AddToCart()
    {
        driver.findElement(btnAddtoCart).click();
    }
    public void AddToCompare()
    {
        driver.findElement(btnCompareProduct).click();
    }
    public void AddToWishList()
    {
        driver.findElement(btnWishList).click();
    }
    public ProductPage ClickAnyProduct()
    {
        driver.findElement(product).click();
        return new ProductPage();
    }
    public boolean IsWishListAlertDisplayed() {
        return driver.findElement(alertWishList).isDisplayed();
    }
    public boolean IsCompareAlertDisplayed() {
        return driver.findElement(alertCompare).isDisplayed();
    }
    public boolean IsSuccessAlertDisplayed() {
        return driver.findElement(alertSuccess).isDisplayed();
    }

    public ProductPage ClickAnyMenuItem()
    {
        driver.findElement(lnkDesktops).click();
        driver.findElement(lnkMac).click();
        return new ProductPage();
    }
}
