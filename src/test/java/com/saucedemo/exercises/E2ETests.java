package com.saucedemo.exercises;

import static org.junit.Assert.assertTrue;
import org.junit.Ignore;
import org.junit.Test;
import com.saucedemo.solution.pages.CheckoutCompletePage;
import com.saucedemo.solution.pages.LoginPage;
import com.saucedemo.solution.pages.ProductsPage;
import com.saucelabs.saucebindings.DataCenter;
import com.saucelabs.saucebindings.junit4.SauceBaseTest;

public class E2ETests extends SauceBaseTest {

    @Override
    public DataCenter getDataCenter() {
        // Select data center to execute against
        return DataCenter.US_WEST; // DataCenter.EU_CENTRAL
    }

    // Here's the first test to get you started. Try to run it
    @Test()
    public void appRenders() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.visit();
        assertTrue(loginPage.isDisplayed());
    }

    @Test()
    public void loginWorks() {
        LoginPage loginPage = new LoginPage(driver);
        /*
         * Add your code below this
         */


        /*
         * ^^^^^^^^ AddYour code above this ^^^^^^^^^
         */
        assertTrue(new ProductsPage(driver).isDisplayed());
    }

    @Test()
    public void userCanCheckout() {
        /*
         * Add your code below this
         */



        /*
         * ^^^^^^^^ AddYour code above this ^^^^^^^^^
         */
        assertTrue(new CheckoutCompletePage(driver).isDisplayed());
    }

    /*
     * Don't do or look at the test below until the atomic tests section
     */
    @Test()
    public void userCanCheckoutAtomic() {
        /*
         * Add your code below this
         */

        /*
         * 1. First navigate to the LoginPage
         */

        /*
         * 2. Removing UI Login We already know that our user can successfully log in with
         * loginWorks() hence, we don't need to waste time, web requests, or add flakiness
         */

        /*
         * 3. Add item to cart without UI interactions
         *
         * We also don't care regardless of whether clicking a button will add an item to a cart We can
         * easily cover this risk with another test Hence, let's simulate adding an item to a cart
         * by updating localStorage
         */

        /*
         * 4. Truly test the checkout flow All the preconditions have been met - User is logged in -
         * User has item in a cart Does the checkout process work?
         *
         * Fill in the code, you've done this before
         */


        /*
         * ^^^^^^^^ AddYour code above this ^^^^^^^^^
         */
        assertTrue(new CheckoutCompletePage(driver).isDisplayed());
    }
}
