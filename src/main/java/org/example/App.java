package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App 
{
    static AppiumDriver driver;
    public static void main( String[] args ) throws MalformedURLException {
      //driver=   WebDriverManager.chromedriver().create();

        System.out.println( "Hello World!" );
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Samsung S22");
        cap.setCapability( MobileCapabilityType.UDID, "R3CT305M22W");
        cap.setCapability( MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //cap.setCapability("browserName", "Chrome");
        //cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        cap.setCapability("appPackage","com.sec.android.app.popupcalculator");
        cap.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, cap);


    }
}
