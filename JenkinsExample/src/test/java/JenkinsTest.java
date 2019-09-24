import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JenkinsTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\workspace1\\projects\\carina-demo\\utilities\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.findElement(By.name("q")).sendKeys("maven repository selenium java");
        driver.quit();
    }
}
