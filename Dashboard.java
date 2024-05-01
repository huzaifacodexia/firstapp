package org.example;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

@Test
public class Dashboard {
public   static AndroidDriver driver;
    @Test
    public void dashboard() throws MalformedURLException, InterruptedException {
    UiAutomator2Options option = new UiAutomator2Options();

        option.setDeviceName("TEST");
        option.autoGrantPermissions();
        option.setCapability("platformName", "Android");
        option.setCapability("platfromVersion", "12");
        option.setCapability("automationname", "UiAutomator2");
        option.setCapability("noreset", "False");


        option.setApp("/Users/a123/IdeaProjects/TestNGProject/src/test/java/Resource/Android-MyDemoAppRN.1.3.0.build-244.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), option);
//        AddProductToCart addProductToCart = new AddProductToCart();
//        addProductToCart.addproducttocart(AndroidDriver driver);


    }
}
