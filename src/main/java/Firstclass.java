import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created with IntelliJ IDEA.
 * User: kphani
 * Date: 31/7/12
 * Time: 9:33 PM
 * To change this template use File | Settings | File Templates.
 */

public class Firstclass {

    WebDriver driver =new FirefoxDriver();

    @Test
    public void test(){
    driver.get("http://www.google.com");

        driver.findElement(By.id("gbqfq")).sendKeys("phani");

        driver.findElement(By.id("gbqfq")).sendKeys("phani");

        driver.findElement(By.id("gbqfq")).sendKeys("phani");





   }




}
