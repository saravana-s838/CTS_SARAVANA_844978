package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Testcasepage {
static WebDriver dr;
By testcase=By.xpath("/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a");
By navi=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div/div[1]/div[1]/ul/li[1]/div[1]/a/i[1]");
By sr=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div/div[1]/div[1]/ul/li[1]/div[2]/p/span[3]");
public void url() { // url for launch the chrome
	System.setProperty("webdriver.chrome.driver",  "src/test/resources/driver/chromedriver");
	dr = new ChromeDriver();
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
public void TestcasePage() throws InterruptedException //using webdriver get visting the testing website
{
	dr.get("http://practice.automationtesting.in/");
	System.out.println(dr.getTitle());
	Thread.sleep(5000);
}
public void testcaseDeatils()
{
	dr.findElement(testcase).click();
	dr.findElement(navi).click();
}
public void submit4() throws InterruptedException
{
	String e="3) Click on Shop Menu";
	 String e1=dr.findElement(sr).getText();
	 if(e.equals(e1))
	 {
		 System.out.println("pass");// loging button
	 }
	 else
	 {
		 System.out.println("FAIL");
	 }
Thread.sleep(3000);
	dr.close();
}}
