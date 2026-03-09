package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductsPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void addProductToCart() {

        LoginPage login = new LoginPage(driver);
        login.login("standard_user","secret_sauce");

        ProductsPage product = new ProductsPage(driver);
        product.addBackpackToCart();
        product.openCart();
    }
}