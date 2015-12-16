package com.tester.testng.retry;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
/**
 * Created by leosong on 15-12-15.
 */
public class GoogleHomePageTest {

    private WebDriver driver;
    String appURL = "http://google.com";

    @BeforeClass
    public void testSetUp()
    {
        driver = new FirefoxDriver();
    }

    @Test
    public void verifyGooglePageTitle()
    {
        //driver.navigate().to(appURL);
        //String getTitle = driver.getTitle();
        //Assert.assertEquals(getTitle,"Google");
        System.out.println("==OK==");
        Assert.assertTrue(false);

    }


    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }


}
