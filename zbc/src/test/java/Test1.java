import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

    @Test(priority = 2)

    void testcase1 (){
        System.out.println("t1");


        System.setProperty("webdriver.chrome.driver","C:\\Users\\MY\\Downloads\\chromedriver_win32\\chromedriver.exe");



        WebDriver driver=new ChromeDriver();
        driver.get("https://www.zomato.com");
        String s=driver.getWindowHandle();
        System.out.println( s);


        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();


    }

    @Test(priority = 1)
    void testcase2 (){

        System.out.println("T2");
    }
}
