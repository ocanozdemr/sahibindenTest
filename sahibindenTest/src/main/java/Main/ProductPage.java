package Main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends BasePage{
    private static final Logger logger = LogManager.getLogger(BasePage.class);
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public void productPageMethod(){

        List<WebElement> listem = findToAll(By.cssSelector("div[class='searchResultCover']"));
        System.out.println("Şirket Sayısı = " + listem.size());
        AssertPage("https://www.sahibinden.com/lojistik-depolama-paketleme-hizmetleri/trabzon?searchText=Nakliyat&source=1");
        System.out.println("Adres Doğru");
        clickTo(By.xpath("//*[@id='profileSearchResults']/a[2]/div/div[2]/div/div/img"));
        AssertPage("https://www.sahibinden.com/hizmetler/p/hologlu-nakliyat-huseyin-atasoy#source=1");
        System.out.println("Adres Doğru");
        clickTo(By.cssSelector("a[class='btn showNumber']"));
        String element = findToTo(By.xpath("//*[contains(text(),' Hüseyin Atasoy')]"));
        String element1 = findToTo(By.xpath("//*[@id='rightColumn']/div[1]/div/div[1]/div[1]/div[2]/div/p/a"));
        System.out.println("" + element + " = " + element1);

        logger.info("Test Bitti");


    }

}
