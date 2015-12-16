package com.tester.selenium.webdriver.phantomjs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.ArrayList;


/**
 * Created by leosong on 15-12-16.
 */
public class SeleniumWebDrivePhantomJSDemo {

    public static void main(String[] args)
    {

        ArrayList<String> cliArgsCap = new ArrayList<String>();
        cliArgsCap.add("--proxy=10.90.106.1:3132");
        //cliArgsCap.add("--proxy-auth=username:password");
        cliArgsCap.add("--proxy-type=http");

        System.out.println("hello");
        DesiredCapabilities caps = DesiredCapabilities.phantomjs();
        caps.setJavascriptEnabled(true);
        caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"/usr/local/bin/phantomjs");
        caps.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, cliArgsCap);

        WebDriver driver = new PhantomJSDriver(caps);
        driver.get("http://google.com");
        System.out.println("page title:" + driver.getTitle());

    }



}
