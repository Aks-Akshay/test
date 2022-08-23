package using_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Byname {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Selenium/geckodriver.exe");
		WebDriver f=new FirefoxDriver();
		f.get("file:///G:/seleniumhtml/New%20Text%20Document.html");
		Thread.sleep(2000);
		f.findElement(By.name("n1")).click();
		

	}

}
