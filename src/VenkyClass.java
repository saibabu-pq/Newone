import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VenkyClass {

	public static void main(String[] args) {
		
		
		//System.out.println("sqhwjhgedhwegrweuf");
		
		
		System.setProperty("webdriver.chrome.driver", "./venky/chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/watch?v=ZC7XP4ypMrE");
		
	}

}