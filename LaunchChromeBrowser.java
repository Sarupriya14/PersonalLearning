import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarup\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.selenium.dev/");
	driver.manage().window().maximize();
	
	
}
}
