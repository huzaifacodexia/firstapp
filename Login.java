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
public class Login extends ViewCart{

    public void login() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAccessibilityId("Username input field")).sendKeys("bob@example.com");
        driver.findElement(new AppiumBy.ByAccessibilityId("Password input field")).sendKeys("10203040");
        driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Login\"])[2]")).click();

    }
}
