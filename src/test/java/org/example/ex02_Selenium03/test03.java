package org.example.ex02_Selenium03;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test03 {

    @Description("open the url")
    @Test
    public void test_selenium001()throws Exception {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        if (driver.getPageSource().contains("CURA Healthcare Service")) {
            System.out.println("CURA Healthcare Service is visible!");
            Assert.assertTrue(true);
        } else {
            throw new Exception("CURA Healthcare Service is Not visible.");
        }
        driver.close();
    }
}
