package org.test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test01 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		List<WebElement> tables=driver.findElements(By.tagName("table"));
		System.out.println(tables.size());
		System.out.println();
		WebElement table1= driver.findElement(By.id("customers"));
		String text=table1.getText();
		System.out.println(text);
		System.out.println();
		List<WebElement> table1rows=table1.findElements(By.tagName("tr"));
		System.out.println(table1rows.size());
		System.out.println();
		List<WebElement> table1heads=table1.findElements(By.tagName("th"));
		System.out.println(table1heads.size());
		
		for (int i = 0; i < table1rows.size(); i++) {
			WebElement RowsDatas=table1rows.get(i);
			System.out.println(RowsDatas.getText());
			
		}
		
		List<WebElement> slectionBox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for (int i = 0; i < slectionBox.size(); i++) {
			
			WebElement eachBox=slectionBox.get(i);
			eachBox.click();
			
		}
		
		WebElement findElement = driver.findElement(By.xpath("//input[@type='submit']"));
		findElement.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
