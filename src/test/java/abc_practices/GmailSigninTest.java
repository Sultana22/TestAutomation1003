package abc_practices;

public class GmailSigninTest {

	public static void main(String[] args) {
		
		
		
		
System.setProperty("webdriver.chrome.driver","C:/Users/sulta/OneDrive/Documenti/Driver/chromedriver_win32/chromedriver.exe");
			WebDriver driver = new ChromeDriver(); // For Chrome Browser
			driver.get("https://www.google.com");
			driver.findElement(By.id("gb_70")).click();
			System.out.println("I clicked on the Sign in button ..............");
			Thread.sleep(5000);
			// TODOs: Complete the remaining codes
			Thread.sleep(2000);
			driver.close();
			}


	}


