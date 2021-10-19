package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_page {

    WebDriver driver;

    public Home_page(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(how= How.XPATH, using = "/html/body/header/nav/ul/li[7]/a")
    WebElement linkSPACIAL_OFFER;

    @FindBy(how= How.ID, using = "see_offer_btn")
    WebElement btnSEE_OFFER;

    @FindBy(how= How.XPATH, using = "/html/body/header/nav/ul/li[2]/a/svg/path")
    WebElement carrinho;

    public void waitSPACIAL_OFFER(){
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOf(linkSPACIAL_OFFER));
    }

    public void waitSEE_OFFER(){
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOf(btnSEE_OFFER));
    }

    public void clickSPACIAL_OFFER(){
        linkSPACIAL_OFFER.click();
    }

    public void clickSEE_OFFER(){
        btnSEE_OFFER.click();
    }

    public void clickcarrinho(){
        carrinho.click();
    }

}
