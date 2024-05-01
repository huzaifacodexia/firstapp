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
public class CheckOut extends ViewCart{

    public void checkout() throws InterruptedException {

      Thread.sleep(2000);
      driver.findElement(new AppiumBy.ByAccessibilityId("Full Name* input field")).sendKeys("Syed Muhammad Huzaifa Bukhari");
        driver.findElement(new AppiumBy.ByAccessibilityId("Address Line 1* input field")).sendKeys("Islampura");
        driver.findElement(new AppiumBy.ByAccessibilityId("Address Line 2 input field")).sendKeys("Rewaz garden");
        driver.findElement(new AppiumBy.ByAccessibilityId("City* input field")).sendKeys("Lahore");
        driver.findElement(new AppiumBy.ByAccessibilityId("State/Region input field")).sendKeys("Punjab");
        driver.findElement(new AppiumBy.ByAccessibilityId("Zip Code* input field")).sendKeys("54600");
        driver.findElement(new AppiumBy.ByAccessibilityId("Country* input field")).sendKeys("Pakistan");
        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAccessibilityId("To Payment button")).click();

driver.findEelemnt();

    }

    public void cardpayment() throws InterruptedException {

      Thread.sleep(2000);
      driver.findElement(new AppiumBy.ByAccessibilityId("Full Name* input field")).sendKeys("Syed Muhammad Huzaifa Bukhari");
      driver.findElement(new AppiumBy.ByAccessibilityId("Card Number* input field")).sendKeys("424242424242424");
      driver.findElement(new AppiumBy.ByAccessibilityId("Expiration Date* input field")).sendKeys("05/24");
      driver.findElement(new AppiumBy.ByAccessibilityId("Security Code* input field")).sendKeys("757");
      driver.findElement(By.xpath("//android.widget.TextView[@text=\"Review Order\"]")).click();

      Thread.sleep(2000);
      driver.findElement(new AppiumBy.ByAccessibilityId("Place Order button")).click();
    }
}
