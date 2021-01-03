import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webDriver.chrome.Driver","C:\\Users\\MY\\Downloads\\chromedriver_win32\\chromedriver.exe");



        WebDriver driver=new ChromeDriver();
        driver.get("https://www.zomato.com");

        driver.findElement(By.xpath("//a[text()='Login']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("123456");
        System.out.println("hello");
       // driver.close();

    }
}
