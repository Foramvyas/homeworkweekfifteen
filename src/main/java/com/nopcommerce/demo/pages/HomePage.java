package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {

    By computerLink = By.linkText("Computers");
    By electronicsLink = By.linkText("Electronics");
    By apparelLink = By.linkText("Apparel");
    By digitalDownloadsLink = By.linkText("Digital downloads");
    By booksLink = By.linkText("Books");
    By jewelryLink = By.linkText("Jewelry");
    By giftCardsLink = By.linkText("Gift Cards");

    public void clickOnComputertab() {
        Reporter.log("Click on Computer link " + computerLink.toString() + "<br>");
        clickOnElement(computerLink);
    }
    public void clickOnElectronicsLink() {
        Reporter.log("Click on Electronics link " + electronicsLink.toString() + "<br>");
        clickOnElement(electronicsLink);
    }

    public void clickOnApparelLink() {
        Reporter.log("Click on Apparel link " + apparelLink.toString() + "<br>");
        clickOnElement(apparelLink);
    }

    public void clickOnDigitalDownloadLink() {
        Reporter.log("Click on Digital downloads link " + digitalDownloadsLink.toString() + "<br>");
        clickOnElement(digitalDownloadsLink);
    }

    public void clickOnBooksLink() {
        Reporter.log("Click on Books link " + booksLink.toString() + "<br>");
        clickOnElement(booksLink);
    }

    public void clickOnJewelryLink() {
        Reporter.log("Click on Jewelry link " + jewelryLink.toString() + "<br>");
        clickOnElement(jewelryLink);
    }

    public void clickOnGiftCardsLink() {
        Reporter.log("Click on Gift cards link " + giftCardsLink.toString() + "<br>");
        clickOnElement(giftCardsLink);
    }


}
