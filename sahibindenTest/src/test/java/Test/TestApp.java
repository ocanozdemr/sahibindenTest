package Test;

import Main.HomePage;
import Main.ProductPage;
import Main.TransferPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class TestApp extends BaseTest {

    HomePage homePage;
    TransferPage transferPage;
    ProductPage productPage;

    @Test
    public void testApp() {
        homePage = new HomePage(driver);
        homePage.homePageMethod();
        transferPage = new TransferPage(driver);
        transferPage.transfer();
        productPage = new ProductPage(driver);
        productPage.productPageMethod();


    }

}
