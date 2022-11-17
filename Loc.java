package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Jsel\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.redbus.in/");
        WebElement a = driver.findElement(By.xpath("//input[@id='src']"));
        a.sendKeys("kovilambakkam");
        WebElement b = driver.findElement(By.xpath("//input[@id='dest']"));
        b.sendKeys("madipakkam");
       // driver.close();
	}

}
