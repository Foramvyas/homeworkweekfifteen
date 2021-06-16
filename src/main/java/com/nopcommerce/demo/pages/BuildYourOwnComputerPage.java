package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {


    By addToCart = By.xpath("//div[@class='item-box'][1]//button[text()='Add to cart']");
    By buildOwnComputerText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By selectProcessor = By.xpath("//select[@id='product_attribute_1']");
    By selectRam = By.ByLinkText.xpath("//select[@id='product_attribute_2']");
    By hddRadio = By.xpath("//dd[@id='product_attribute_input_3']//label[text()='400 GB [+$100.00]']");
    By oSRadio = By.xpath("//input[@id='product_attribute_4_9']");
    By softwareOne = By.xpath("//input[@id='product_attribute_5_10']");
    By softwareTwo = By.xpath("//input[@id='product_attribute_5_12' and @ name='product_attribute_5']");
    By verifyPrice = By.xpath("//span[@id='price-value-1']");
    By clickAddToCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By verifyShoppingCartMessage = By.xpath("//p[text()='The product has been added to your ']");
    By clickOnGreenBar = By.xpath("//span[@class='close']");

    public void clickOnAddToCartButton() {
        Reporter.log("Click on add to cart " + addToCart.toString() + "<br>");
        clickOnElement(addToCart);
    }

    public String verifyTextBuildYourOwnComputer() {
        Reporter.log("Verify User Navigate to Build your own Computer product page " + buildOwnComputerText.toString() + "<br>");
        return getTextFromElement(buildOwnComputerText);
    }
    public void setSelectProcessorFromDropDownMenu(int value) {
        Reporter.log("select the processor from drop down " + selectProcessor.toString() + "<br>");
        selectByIndexFromDropDown(selectProcessor, value);
    }
    public void setSelectRam(int value) {
        Reporter.log("select the Ram from drop down " + selectRam.toString() + "<br>");
        selectByIndexFromDropDown(selectRam, value);
    }
    public void clickOnHdd(String HDD) {
        Reporter.log("click On Hdd from radio button " + hddRadio.toString() + "<br>");
        clickOnElement(hddRadio);
    }
    public void clickOnOsRadio(String osRadio) {
        Reporter.log("Click on Os Radio from list" + oSRadio.toString() + "<br>");
        clickOnElement(oSRadio);
    }

    public void clickOnMicrosoftOffice(String software1) {
        Reporter.log("Click on MicrosoftOffice from checkbox " + softwareOne.toString() + "<br>");
        clickOnElement(softwareOne);
        clickOnElement(softwareOne);
    }
    public void clickOnSoftwareTotalCommander(String software2) {
        Reporter.log("Click on Total Commander " + softwareTwo.toString() + "<br>");
        clickOnElement(softwareTwo);
    }

    public String setVerifyPrice() {
        Reporter.log("Verify  the total Price $1475.00 " + verifyPrice.toString() + "<br>");
        return getTextFromElement(verifyPrice);
    }
      public void setClickAddToCartButton() {
        Reporter.log("Click add to cart " + clickAddToCart.toString() + "<br>");
        clickOnElement(clickAddToCart);
    }
    public String verifyShoppingCartText() {
        Reporter.log("Verify Shopping Cart Text " + verifyShoppingCartMessage.toString() + "<br>");
        return getTextFromElement(verifyShoppingCartMessage);
    }
    public void clickOnCrossGreenBar() {
        Reporter.log("Click on Green Bar " + clickOnGreenBar.toString() + "<br>");
        clickOnElement(clickOnGreenBar);
    }






}
