package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.ilcarro.pages.BasePage.driver;

public class HomePage  extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "h1")
    WebElement title;
    public HomePage isHomePageTitleDisplayed() {
        assert isElementDisplayed(title);
        return this;
    }
}

