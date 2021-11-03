package Main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{
    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void homePageMethod()  {
        logger.info("Test Başladı");
        AssertPage("https://www.sahibinden.com/");
        System.out.println("Adres Doğru");
        clickTo(By.xpath("//*[@id='onetrust-close-btn-container']/button"));
        driver.navigate().refresh();
        System.out.println("Çerez Kapatıldı");
        driver.navigate().refresh();
        scrollDown();
        clickTo(By.xpath("//*[@id='container']/div[3]/div/aside/div[1]/nav/ul[3]/li[6]/a"));
        AssertPage("https://www.sahibinden.com/");
        System.out.println("Adres Doğru");
        logger.info("Seçenekler Ekranına Gidiyor");












    }
}
