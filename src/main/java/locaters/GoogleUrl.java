package locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GoogleUrl {

	public static void main(String[] args) throws InterruptedException {
	System.out.println("Program Started.......");
	
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	Thread.sleep(5000);
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	System.out.println(driver.getCurrentUrl());
	driver.navigate().refresh();
	driver.close();
	
	System.out.println("Program Ended.......");
	
	}

}
