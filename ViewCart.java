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
public class ViewCart extends AddProductToCart{

    public void viewcart() throws InterruptedException {
Thread.sleep(2000);
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"cart badge\"]/android.widget.ImageView")).click();
Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Proceed To Checkout\"]")).click();
    }
}
