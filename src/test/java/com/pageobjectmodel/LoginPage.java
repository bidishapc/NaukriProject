package com.pageobjectmodel;

import com.base.BaseClass;
import com.interfaceElements.LoginPageInterfaceElements;
import com.pageobjectmanager.PageObjectManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass implements LoginPageInterfaceElements {
    @FindBy(id = username_id)
    private static WebElement username;

    @FindBy(id = password_id)
    private static WebElement password;

    @FindBy(xpath = loginButton_xpath)
    private static WebElement loginButton;

    @FindBy(xpath = title_xpath)
    private static WebElement title;

    public LoginPage() {


        PageFactory.initElements(driver, this);
    }

    public static void validLogin() {
        passInput(username, PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("username"));
        passInput(password, PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("password"));
        clickOnElement(loginButton);
    }
}


