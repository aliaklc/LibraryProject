package com.library.step_definitions;

import com.library.pages.LoginPage;
import com.library.utility.ConfigurationReader;
import com.library.utility.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;


public class Login_Steps {

    LoginPage loginPage = new LoginPage();

    @Given("user goes to application as a student")
    public void user_goes_to_application_as_a_student() {

        loginPage.loginAsStudent();
    }



    @Given("user goes to application as a librarian")
    public void user_goes_to_application_as_a_librarian() {

        loginPage.loginAsLibrarian();

    }


}
