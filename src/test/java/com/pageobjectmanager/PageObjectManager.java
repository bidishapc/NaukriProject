package com.pageobjectmanager;

import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.ProfileUpdatePage;
import com.pageobjectmodel.ResumeHeadLinePage;
import com.utility.FileReaderManager;

public class PageObjectManager {

    private static PageObjectManager pageObjectManager;
    private LoginPage loginPage;
    private FileReaderManager fileReader;
    private ResumeHeadLinePage resumeHeadLinePage;
    private ProfileUpdatePage profileUpdatePage;

    public ResumeHeadLinePage getResumeHeadLinePage() {
        if(resumeHeadLinePage==null){
            resumeHeadLinePage=new ResumeHeadLinePage();
        }
        return resumeHeadLinePage;
    }

     public ProfileUpdatePage getProfileUpdatePage() {
        if(profileUpdatePage==null) {
            profileUpdatePage = new ProfileUpdatePage();
        } return profileUpdatePage;
    }



    public static PageObjectManager getPageObjectManager() {
        if(pageObjectManager==null){
            pageObjectManager=new PageObjectManager();
        }
        return pageObjectManager;

    }
    public LoginPage getLoginPage() {
        if(loginPage==null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }


    public FileReaderManager getFileReader() {
        if(fileReader==null) {
            fileReader = new FileReaderManager();
        }
        return fileReader;
    }
}

