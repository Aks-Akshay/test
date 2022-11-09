package css_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_maps {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.gecko.driver", "./Selenium/geckodriver.exe");
	 WebDriver f=new FirefoxDriver();
	 f.get("https://www.google.com/maps/@12.9365218,77.559666,13z");
	 f.findElement(By.cssSelector("button[id='hArJGc']")).click();
	 Thread.sleep(3000);
	 f.findElement(By.cssSelector("input[aria-label='Choose starting point, or click on the map...']")).sendKeys("mysore");
	 Thread.sleep(2000);
	 f.findElement(By.cssSelector("input[aria-controls='sbsg52']")).sendKeys("bangalore");
	 //f.findElement(By.cssSelector("input[aria-controls='sbsg52']")).click();
	 Thread.sleep(6000);
	 f.findElement(By.cssSelector("img[class='OzmNAc']")).click();
	 
	}

}
