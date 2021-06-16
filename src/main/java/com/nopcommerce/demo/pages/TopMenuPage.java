package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class TopMenuPage extends Utility {

    HomePage homePage = new HomePage();

    By verifyComputerText = By.partialLinkText("Compute");
    By verifyElectronicsText = By.partialLinkText("Electroni");
    By verifyApparelText = By.partialLinkText("Appar");
    By verifyDigitalDowanloadText = By.partialLinkText("Digital downloa");
    By verifyBooksText = By.partialLinkText("Books");
    By verifyJewelryText = By.partialLinkText("Jewel");
    By verifyGiftsCardsText = By.partialLinkText("Gift Car");

    public void selectMenu(String menu) throws InterruptedException {
        Thread.sleep(1000);
        if (menu == "Computers") {
            homePage.clickOnComputertab();
        } else if (menu == "Electronics") {
            homePage.clickOnElectronicsLink();
        } else if (menu == "Apparel") {
            homePage.clickOnApparelLink();
        } else if (menu == "Digital downloads") {
            homePage.clickOnDigitalDownloadLink();
        } else if (menu == "Books") {
            homePage.clickOnBooksLink();
        } else if (menu == "Jewelry") {
            homePage.clickOnJewelryLink();
        } else if (menu == "Gift Cards") {
            homePage.clickOnGiftCardsLink();
        }
    }

    public String verifyComputerPage() {
        Reporter.log("Verify user navigate to computer page successfully " + verifyComputerText.toString() + "<br>");
        return getTextFromElement(verifyComputerText);
    }

    public String verifyElectronicsPage() {
        Reporter.log("Verify user navigate to electronics page successfully " + verifyElectronicsText.toString() + "<br>");
        return getTextFromElement(verifyElectronicsText);
    }
    public String verifyApparelPage() {
        Reporter.log("Verify user navigate to apparel page successfully " + verifyApparelText.toString() + "<br>");
        return getTextFromElement(verifyApparelText);
    }

    public String verifyDigitalDownloadPage() {
        Reporter.log("Verify user navigate to digital download page successfully " + verifyDigitalDowanloadText.toString() + "<br>");
        return getTextFromElement(verifyDigitalDowanloadText);
    }
    public String verifyBooksPage() {
        Reporter.log("Verify user navigate to books page successfully " + verifyBooksText.toString() + "<br>");
        return getTextFromElement(verifyBooksText);
    }
    public String verifyJewelryPage() {
        Reporter.log("Verify user navigate to jewelry page successfully " +verifyJewelryText.toString() + "<br>");
        return getTextFromElement(verifyJewelryText);
    }
    public String verifyGiftCardPage() {
        Reporter.log("Verify user navigate to giftCard page successfully " + verifyGiftsCardsText.toString() + "<br>");
        return getTextFromElement(verifyGiftsCardsText);
    }

}