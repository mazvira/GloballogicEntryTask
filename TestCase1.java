import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestCase1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.BROWSER_NAME,"Chrome");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://semantic-ui.com/examples/login.html");

        WebElement email = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("password"));

        email.sendKeys("abcd@gmail.com");
        password.sendKeys("abcdefghlkjl");

        driver.findElement(By.className("submit-button")).submit();


        driver.close();

    }
}
