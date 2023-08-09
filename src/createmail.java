import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./venky/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1275321954%3A1689754306969972&authuser=0&continue=https%3A%2F%2Fmail.google.com&ec=GAlAFw&hl=en&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElement(By.xpath("//div[@class='XOrBDc']")).click();
		driver.findElement(By.xpath("//span[text()='For my personal use']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sairaj");
		driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		//driver.findElement(By.xpath("//select[@id='month']")).click();
		driver.findElement(By.xpath("//input[@id='day']")).click();
	//	driver.findElement(By.xpath("//select[@id='month']")).click()
		//driver.findElement(By.xpath("//select[@id='month']")).click()
	//	driver.findElement(By.xpath("//select[@id='month']")).click()
	//	driver.findElement(By.xpath("//select[@id='month']")).click()
	//	driver.findElement(By.xpath("//select[@id='month']")).click()
	//	driver.findElement(By.xpath("//select[@id='month']")).click()

		
		
		
		
		
				
		

	}

}
