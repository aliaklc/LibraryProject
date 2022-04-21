package com.library.step_definitions;

import com.library.pages.LoginPage;
import com.library.pages.US2_Page;
import com.library.utility.ConfigurationReader;
import com.library.utility.DB_Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US2_Steps {

    US2_Page us2_page = new US2_Page();
    LoginPage loginPage = new LoginPage();

    @Given("I am in the homepage of the library app")
    public void i_am_in_the_homepage_of_the_library_app() {


    }

    @When("I take borrowed books number")
    public void i_take_borrowed_books_number() {

    }

    @Then("borrowed books number information must match with DB")
    public void borrowed_books_number_information_must_match_with_db() throws InterruptedException {

        loginPage.loginAsLibrarian();

        Thread.sleep(3000);
        String actual = us2_page.borrowedBooks.getText();


        DB_Util.createConnection(ConfigurationReader.getValue("JDBCurl"), ConfigurationReader.getValue("Username"),
                ConfigurationReader.getValue("Password"));
        DB_Util.runQuery("select count(*) from book_borrow where is_returned  = 0; ");

        String expected = DB_Util.getFirstRowFirstColumn();


        System.out.println(expected + " | " + actual);

        Assert.assertEquals(expected,actual);


    }

}
