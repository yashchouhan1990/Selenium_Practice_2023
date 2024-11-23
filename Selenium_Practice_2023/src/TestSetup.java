import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSetup {
	
	//WebDriver driver;	
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/yashchouhan/Downloaded_Jars/chromedriver");
		//ChromeOptions cop= new ChromeOptions();
		//cop.setBinary("/Users/yashchouhan/Downloaded_Jars/chrome-mac-arm64/Google Chrome for Testing.app");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome Back");
		
		TestSetup obj= new TestSetup();
		obj.launchBrowser();
	}

}
