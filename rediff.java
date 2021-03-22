package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://www.google.com"); 
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("world");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		driver.findElement(By.linkText("Forgot Password?")).click();
		driver.findElement(By.xpath("//input[@name='txtlogin']")).sendKeys("anjali");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
