package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test03 {
public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");	
		WebElement searchBox=driver.findElement(By.xpath("//input[@type='text']"));
		searchBox.sendKeys("Nike Shoe");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement username=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		username.sendKeys("8056702086");
		WebElement password=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		password.sendKeys("sathish07");
		WebElement login=driver.findElement(By.xpath("(//span[text()='Login'])[1]"));
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement product01=driver.findElement(By.xpath("(//a[contains(@class,'IRpwTa')])[1]"));
		product01.click();
		
//		Set<String> totalwindows = driver.getWindowHandles();
//		System.out.println(totalwindows);
//		
//		List<String> li=new ArrayList<String>();
//		li.addAll(totalwindows);
//		
//		driver.switchTo().window(li.get(1));
//		
		
		
		
		
		
		
}



}
