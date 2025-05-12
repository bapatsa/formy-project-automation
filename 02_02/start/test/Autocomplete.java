import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Ex_Files_Selenium_EssT/chromedriver-win64/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete=driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1918 New Bristol Ln, Brentwood");




        WebElement autocompleteResult=driver.findElement(By.className("pac-item"));
        autocompleteResult.click();

        driver.quit();
    }
}
