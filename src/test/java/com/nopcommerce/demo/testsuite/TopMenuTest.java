package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    TopMenuPage topMenuPage = new TopMenuPage();


    @Test
    public void verifyUserShouldNavigateToComputerPage() throws InterruptedException {
        Thread.sleep(1000);
        topMenuPage.selectMenu("Computers");
        String expectedMessage = "Computers";
        String actualMessage = topMenuPage.verifyComputerPage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void verifyUserShouldNavigateToElectronicsPage() throws InterruptedException {
        topMenuPage.selectMenu("Electronics");
        String expectedMessage1 = "Electronics";
        String actualMessage1 = topMenuPage.verifyElectronicsPage();
        Assert.assertEquals(actualMessage1, expectedMessage1);
    }

    @Test
    public void verifyUserShouldNavigateToApparel() throws InterruptedException {

        topMenuPage.selectMenu("Apparel");
        String expectedMessage2 = "Apparel";
        String actualMessage2 = topMenuPage.verifyApparelPage();
        Assert.assertEquals(actualMessage2, expectedMessage2);
    }

    @Test
    public void verifyUserShouldNavigateToDigitalDownloads() throws InterruptedException {

        topMenuPage.selectMenu("Digital downloads");
        String expectedMessage3 = "Digital downloads";
        String actualMessage3 = topMenuPage.verifyDigitalDownloadPage();
        Assert.assertEquals(actualMessage3, expectedMessage3);
    }

    @Test
    public void verifyUserShouldNavigateToBooks() throws InterruptedException {
        topMenuPage.selectMenu("Books");
        String expectedMessage4 = "Books";
        String actualMessage4 = topMenuPage.verifyBooksPage();
        Assert.assertEquals(actualMessage4, expectedMessage4);
    }

    @Test
    public void verifyUserShouldNavigateToJewelry() throws InterruptedException {
        topMenuPage.selectMenu("Jewelry");
        String expectedMessage5 = "Jewelry";
        String actualMessage5 = topMenuPage.verifyJewelryPage();
        Assert.assertEquals(actualMessage5, expectedMessage5);
    }

    @Test
    //Methof fail for screenshot
    public void verifyUserShouldNavigateToGiftCards() throws InterruptedException {
        topMenuPage.selectMenu("Gift Cards");
        String expectedMessage6 = "Gift Car";
        String actualMessage6 = topMenuPage.verifyGiftCardPage();
        Assert.assertEquals(actualMessage6, expectedMessage6);

    }
}