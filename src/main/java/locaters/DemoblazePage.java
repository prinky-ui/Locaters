package locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoblazePage {

	public static void main(String[] args) {
		System.out.println("Program Started");
		WebDriverManager.chromedriver();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		if(driver.getTitle().equals("STORE")) {
		
		System.out.println("Page Landed on correct website");
		
		} else {
			
			System.out.println("Page not Landed on correct websit");
		}
			
		
		}
		
	}
