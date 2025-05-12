import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Ex_Files_Selenium_EssT/chromedriver-win64/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField=driver.findElement(By.id("datepicker"));
        dateField.sendKeys("05/19/2025");
        dateField.sendKeys(Keys.ENTER); // you can use enter or return for entering on datepicker field


        driver.quit();
    }
}