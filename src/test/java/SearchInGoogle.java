import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchInGoogle {

    WebDriver webDriver;

    public void launchBrowser(){
        System.setProperty("webDriver.chrome.driver","C:/Users/karth/Downloads/chromedriver-win64");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.google.com/");
    }

    public void searchProduct() throws InterruptedException {
        Thread.sleep(1000);
        WebElement webElement = webDriver.findElement(By.id("APjFqb"));
        webElement.sendKeys("flipkart.com");
        webElement.sendKeys(Keys.ENTER);
    }

    public static void main(String[] args) throws InterruptedException {
        SearchInGoogle searchInGoogle = new SearchInGoogle();
        searchInGoogle.launchBrowser();
        Thread.sleep(1000);
        searchInGoogle.searchProduct();
    }
}
