package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public static WebDriver driver;

    public BasePage(){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void launchBrowser(){
        System.err.close();

        driver = new ChromeDriver();
    }

    public void openUrl(){
        driver.get("https^//ilcarro.web.app");
        driver.manage().
    }
}
