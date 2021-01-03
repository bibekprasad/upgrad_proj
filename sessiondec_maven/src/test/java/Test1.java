import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Test1 {

    @Test(priority = 2)
    void testcase1 () throws InterruptedException {
        System.out.println("t1");


        System.setProperty("webdriver.chrome.driver","C:\\Users\\MY\\Downloads\\chromedriver_win32\\chromedriver.exe");



        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.zomato.com");
        String baseUrl = "http://www.google.co.uk/";
        driver.get(baseUrl);
        driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL + "t");

        for(int i=0;i<6;i++)
        {
            driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL + "t");
            Thread.sleep(1000);
            System.out.println("Open a newtab.");
        }

        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
       driver.switchTo().window(tabs.get(0)); //switches to new tab
        driver.get("https://www.facebook.com");
//
//        driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL +"t");


        driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL+"3");
        // switch back to main screen
        driver.get("https://www.news.google.com");

//        driver.get("https://www.salesforce.com/in/");

//        String s=driver.getWindowHandle();
//        System.out.println(tabs);
//        Thread.sleep(5000);



//        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
//
//        Thread.sleep(5000);
       // driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("8546523651");
           //driver.findElement(By.id("username")).sendKeys("bc@gmail.com");
//          driver.findElement(By.cssSelector("input#username")).sendKeys("abc@gmail.com");

    }

//    @Test(priority = 1)
//    void testcase2 (){
//        System.out.println("T2");
//    }
}
