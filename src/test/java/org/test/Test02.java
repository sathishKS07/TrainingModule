package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test02 {

public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/guru99home/");	
	
	driver.switchTo().frame(2);
	WebElement frame1 =driver.findElement(By.xpath("//p[text()='The requested URL was not found on this server.']"));
    System.out.println(frame1.getText());
	
	// sdfsdfsdf//
    //fdsfsdfds//
    //fsdds
	
	

	
	
	
	
}	
}
