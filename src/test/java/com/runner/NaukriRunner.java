package com.runner;

import com.base.BaseClass;
import com.listener.ExtentReport_Test;
import com.listener.ITestListenerClass;
import com.pageobjectmanager.PageObjectManager;
import org.testng.ITestNGListener;
import org.testng.annotations.*;

@Listeners(ITestListenerClass.class)
public class NaukriRunner extends BaseClass {

    @BeforeClass
    public void setupProperty() {
        launchBrowser(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("browser"));
        launchUrl(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("url"));

    }
    @Test(priority = 2)
    public void validProfileUpdate()
    {
        PageObjectManager.getPageObjectManager().getProfileUpdatePage().profileupdate();
    }
    @Test(priority = 3)
    public void naukriEditResume(){
        PageObjectManager.getPageObjectManager().getResumeHeadLinePage().resumeHeadLine();
    }

    @Test(priority = 1)
    public void naukriValidLogin() {
        ExtentReport_Test.extenttest=extentReports.createTest("Login Test" +":"+
                Thread.currentThread().getStackTrace()[1].getMethodName().toString()).info("Naukri Application Testing");
        PageObjectManager.getPageObjectManager().getLoginPage().validLogin();
    }

    @AfterClass
    public void tearDown() {
    //    browserTermination();
    }
@BeforeSuite
    public void reportStart() {
        extentReportStart(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("start"));
    }
@AfterSuite
    public void reportEnd() {
        extentReportTearDown(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("end"));
    }
}

