package com.library.pages;

import com.library.utility.ConfigurationReader;
import com.library.utility.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
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


    public void loginAsStudent() {
        Driver.getDriver().get(ConfigurationReader.getValue("env"));
        inputEmail.sendKeys(ConfigurationReader.getValue("studentEmail27"));
        inputPassword.sendKeys(ConfigurationReader.getValue("studentPassword27"));
        submitLogin.sendKeys(Keys.ENTER);
    }

    public void loginAsLibrarian() {

        Driver.getDriver().get(ConfigurationReader.getValue("env"));
        inputEmail.sendKeys(ConfigurationReader.getValue("librarianEmail33"));
        inputPassword.sendKeys(ConfigurationReader.getValue("librarianPassword33"));
        submitLogin.sendKeys(Keys.ENTER);
    }


}
