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
public class AddProductToCart extends Dashboard{



    @Test
    public void addproducttocart() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"store item\"])[1]/android.view.ViewGroup[1]/android.widget.ImageView")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Add To Cart\"]")).click();
//        driver.close();
Thread.sleep(2000);
driver.findElement(new AppiumBy.ByAccessibilityId("Add To Cart")).click();

    }
}
