package com.pageobjectmodel;

import com.base.BaseClass;
import com.interfaceElements.ProfileUpdateInterfaceElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class ProfileUpdatePage extends BaseClass implements ProfileUpdateInterfaceElements {
   @FindBy(xpath = profileEdit_xpath)
    private static WebElement profileEdit;

   @FindBy(linkText = viewUpdate_linkText)
private static WebElement viewUpdate;

   @FindBy(xpath = popupClose_xpath)
   private static WebElement popClose;

    public ProfileUpdatePage() {

        PageFactory.initElements(driver, this);
    }
        public static void profileupdate()  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        clickOnElement(popClose);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        clickOnElement(profileEdit);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        clickOnElement(viewUpdate);

        }

    }

