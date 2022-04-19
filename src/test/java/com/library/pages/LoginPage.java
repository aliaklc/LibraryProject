package com.library.pages;

import com.library.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver() , this);
    }

    // input email locator
    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputEmail;


    // input password locator
    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement inputPassword;


    // submit button
    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement submitLogin;

}
