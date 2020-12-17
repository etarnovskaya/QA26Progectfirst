package com.telran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoToGoogle {

    WebDriver wd;

    @Test
    public void gotogoogle(){
        wd = new ChromeDriver();
        wd.get("https:/google.com");
        //wd.findElements(By.id("")).
        wd.quit();
    }

}
