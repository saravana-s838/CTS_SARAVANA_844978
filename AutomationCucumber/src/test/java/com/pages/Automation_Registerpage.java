package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Registerpage {
	static WebDriver dr;
	By account1=By.xpath("/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a");
	By email=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[2]/form/p[1]/input");
	By password=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[2]/form/p[2]/input");
	By registerbutton=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[2]/form/p[3]/input[3]");
public void url() { // url for launch the chrome
	System.setProperty("webdriver.chrome.driver",  "src/test/resources/driver/chromedriver");
	dr = new ChromeDriver();
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
public void RegisterPage() throws InterruptedException //using webdriver get visting the testing website
{
	dr.get("http://practice.automationtesting.in/");
	System.out.println(dr.getTitle());
	Thread.sleep(5000);
	 
}
public void RegisterDeatils()
{
	dr.findElement(account1).click(); // move to to element achiving by creating object
	dr.findElement(email).sendKeys("saravanareddy838@gmail.com"); // passing the vaild mail
	dr.findElement(password).sendKeys("7095143164!Sa"); // passing the vaild password
}	
public void submit() throws InterruptedException
{
	dr.findElement(registerbutton).click(); // loging button
Thread.sleep(3000);
	dr.close();
}}

