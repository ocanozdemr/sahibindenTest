package Main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.jar.Attributes;

public class TransferPage extends BasePage {
    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public TransferPage(WebDriver driver) {
        super(driver);
    }

    public void transfer() {

        clickTo(By.cssSelector("input[placeholder='Aradığınız hizmeti yazın (örnek: çilingir)']"));
        AssertPage("https://www.sahibinden.com/hizmetler");
        System.out.println("Adres Doğru");
        sendKeys(By.cssSelector("input[placeholder='Aradığınız hizmeti yazın (örnek: çilingir)']"), "Nakliyat");
        AssertPage("https://www.sahibinden.com/hizmetler");
        System.out.println("Adres Doğru");
        clickTo(By.xpath("//*[@id='SearchForm']/div[1]/select/option[75]"));
        AssertPage("https://www.sahibinden.com/hizmetler");
        System.out.println("Adres Doğru");
        clickTo(By.xpath("//*[@id='SearchForm']/div[2]/select/option[7]"));
        AssertPage("https://www.sahibinden.com/hizmetler");
        System.out.println("Adres Doğru");
        clickTo(By.cssSelector("a[class='btn btn-strong']"));
        clickTo(By.xpath("//*[@id='searchResultSummaryPage']/div[2]/div[1]/ul/li/div/div/ul/li[3]/a"));





       /* clickTo(By.xpath("//*[@id='SearchForm']/div[1]"));
        clickTo(By.cssSelector("//*[@id='SearchForm']/div[1]/select/option[75]"));  */


    }
}
