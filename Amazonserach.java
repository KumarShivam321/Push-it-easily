package Day21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonserach {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//div[@aria-label=\"mobile\"]")).click();
		List<WebElement> first5mobileTitles = driver.findElements(By.cssSelector(".s-title-instructions-style .a-size-medium.a-color-base.a-text-normal"));

        // Display the first 5 mobile product titles
        for (int i = 0; i < 5 && i < first5mobileTitles.size(); i++) 
        {
            System.out.println("Title of Fisrt 5 Mobile are " + (i + 1) + ": " + first5mobileTitles.get(i).getText());
        }

        
	}

}
