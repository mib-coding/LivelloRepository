package livelloTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LivelloAutomation {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		
		if (browser.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			}
		else if (browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			}
		if (browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			}

		driver.get("https://www.livello.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("comp-l0rb3d5e1")).click();
		String currentUrl = driver.getCurrentUrl();
		driver.get(currentUrl);
		driver.findElement(By.xpath("//*[@id=\"comp-kfzirm79\"]")).click();
		
	}
}
