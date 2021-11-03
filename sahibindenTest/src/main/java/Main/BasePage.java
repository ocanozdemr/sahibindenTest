package Main;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);

    }
    public WebElement findTo(By locator){
        return driver.findElement(locator);

    }
    public void clickTo(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        findTo(locator).click();

    }
    public void sendKeys(By locator , String text){
     findTo(locator).sendKeys(text);

    }
    public List<WebElement> findToAll(By locator)
    {
        return driver.findElements(locator);
    }
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
    }
    public void AssertPage(String url)
    {
        Assert.assertEquals(url , driver.getCurrentUrl());
    }
    public void AssertText(String text ,By locator)
    {
        Assert.assertEquals(text,locator);
    }



    public String findToTo(By locator){
        return driver.findElement(locator).getText();
    }







}
