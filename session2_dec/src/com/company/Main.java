package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.setProperty("webdriver.chrome.driver","C:\\Users\\MY\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com"); //launch google homepage
        driver.quit();
    }
}
