package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WikipediaPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Artificial intelligence");
		driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();
		driver.findElement(By.xpath("//Span[text()='History']"));
		
	    System.out.println (driver.getTitle());
		
		
		

	}

}
