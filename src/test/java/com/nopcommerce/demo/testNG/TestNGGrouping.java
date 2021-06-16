package com.nopcommerce.demo.testNG;

import org.testng.annotations.Test;

public class TestNGGrouping {

    @Test(groups = {"smoke","sanity","regression"})
    public void verifyProductArrangeInAlphabeticalOrder(){
        System.out.println("Product Arrange In Alphabetical Order");
    }
    @Test(groups = {"sanity","regression"})
    public void verifyProductAddedToShoppingCartSuccessfully(){
        System.out.println("User add the product successfully in shopping cart");
    }



}
