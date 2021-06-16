package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

import java.util.List;

public class ComputerPage extends Utility {


    By desktopsLink = By.linkText("Desktops");
    By selectPosition = By.xpath("//select[@id='products-orderby']");
    By getListOfProducts = By.xpath("//h2[@class='product-title']");


    public void clickOnDesktopsLink() {
        Reporter.log("Click on desktopLink " + desktopsLink.toString() + "<br>");
        clickOnElement(desktopsLink);
    }

    //parameterize method
    public void selectPositionFromDropdown(int value) {
        Reporter.log("Select position from drop down " + selectPosition.toString() + "<br>");
        selectByIndexFromDropDown(selectPosition, value);
    }

    public List getListOfProducts() {
        Reporter.log("Get list of products " + getListOfProducts.toString() + "<br>");
        return getListfromElements(getListOfProducts);

    }
}
