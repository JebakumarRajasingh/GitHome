package git;

import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/#");
		driver.manage().window().maximize();
		
		

	}

}
