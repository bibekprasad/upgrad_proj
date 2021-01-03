package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Main {

    @Test
    void T1 (){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MY\\Downloads\\chromedriver_win32\\chromedriver.exe");



        WebDriver driver=new ChromeDriver();
        driver.get("https://www.zomato.com");
        System.out.println("te1");
	// write your code here
    }
    @Test
    void T2 (){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MY\\Downloads\\chromedriver_win32\\chromedriver.exe");



        WebDriver driver=new ChromeDriver();
        driver.get("https://www.zomato.com");

        System.out.println("te2");
        // write your code here
    }
//    @BeforeMethod
//    void T3 (){
//
//        System.out.println("Before");
//        // write your code here
//    }
//    @AfterMethod
//    void T4 (){
//
//        System.out.println("After");
//        // write your code here
//    }
}
