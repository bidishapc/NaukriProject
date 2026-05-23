package com.pageobjectmodel;

import com.base.BaseClass;
import com.interfaceElements.ResumeHeadLineInterfaceElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResumeHeadLinePage extends BaseClass implements ResumeHeadLineInterfaceElements {

    @FindBy(xpath=headLine_xpath)
    private static WebElement headLineUpdate;

    @FindBy(xpath= headLineEdit_xpath)
    private static WebElement headLineEdit;

    @FindBy(id=headEnter_id)
    private static WebElement headEnter;

    public ResumeHeadLinePage() {
        PageFactory.initElements(driver,this);
    }

    public void resumeHeadLine(){
        clickOnElement(headLineUpdate);
        clickOnElement(headLineEdit);
        clickOnElement(headEnter);
    }
}
