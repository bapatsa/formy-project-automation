import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Ex_Files_Selenium_EssT/chromedriver-win64/chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");


        driver.findElement(By.id("first-name")).sendKeys("Seema");
        driver.findElement(By.id("last-name")).sendKeys("Bapat ");
        driver.findElement(By.id("job-title")).sendKeys("QA Analyst");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-2")).click();
        driver.findElement(By.cssSelector("option[value='3']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("103/19/2025");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();



        driver.quit();
    }
}
