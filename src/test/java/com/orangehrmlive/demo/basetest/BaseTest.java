package com.orangehrmlive.demo.basetest;

import com.orangehrmlive.demo.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser= PropertyReader.getInstance().getProperty("browser");
    //String browser= PropertyReader.getInstance().getProperty("browser");
    // String browser = "Chrome";
    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);


    }
    @AfterMethod
    public void tearDown(){
       // closeBrowser();
    }
}
