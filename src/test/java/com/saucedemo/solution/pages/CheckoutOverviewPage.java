package com.saucedemo.solution.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CheckoutOverviewPage extends AbstractBasePage {
    public CheckoutOverviewPage(RemoteWebDriver driver) {
        super(driver);
    }

    @Override
    public String getPagePart() {
        return "checkout-step-two.html";
    }

    public void finish() {
        getDriver().findElement(By.cssSelector("#finish")).click();
    }
}
