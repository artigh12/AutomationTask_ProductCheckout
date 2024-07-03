package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ElementPom {

	
	@FindBy(how=How.XPATH,using="//span[text()='Products']") private WebElement Products;
	@FindBy(how=How.XPATH,using="//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement Add;
	@FindBy(how=How.XPATH,using="//a[@class='shopping_cart_link']") private WebElement Cart;
	@FindBy(how=How.XPATH,using="//span[text()='Your Cart']") private WebElement ShoppingBag;
	@FindBy(how=How.XPATH,using="//button[@id='checkout']") private WebElement Checkout;
	@FindBy(how=How.XPATH,using="//span[text()='Checkout: Your Information']") private WebElement Information;
	@FindBy(how=How.XPATH,using="//input[@id='first-name']") private WebElement FirstName;
	@FindBy(how=How.XPATH,using="//input[@id='last-name']") private WebElement LastName;
	@FindBy(how=How.XPATH,using="//input[@id='postal-code']") private WebElement PostalCode;
	@FindBy(how=How.XPATH,using="//input[@id='continue']") private WebElement ContinueBtn;
	@FindBy(how=How.XPATH,using="//span[text()='Checkout: Overview']") private WebElement Overview;
	@FindBy(how=How.XPATH,using="//button[@id='finish']") private WebElement FinishBtn;
	@FindBy(how=How.XPATH,using="//h2[text()='Thank you for your order!']") private WebElement OrderConfirmed;
	public WebElement getProducts() {
		return Products;
	}
	public WebElement getAdd() {
		return Add;
	}
	public WebElement getCart() {
		return Cart;
	}
	public WebElement getShoppingBag() {
		return ShoppingBag;
	}
	public WebElement getCheckout() {
		return Checkout;
	}
	public WebElement getInformation() {
		return Information;
	}
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getPostalCode() {
		return PostalCode;
	}
	public WebElement getOverview() {
		return Overview;
	}
	public WebElement getFinishBtn() {
		return FinishBtn;
	}
	public WebElement getOrderConfirmed() {
		return OrderConfirmed;
	}
	public WebElement getContinueBtn() {
		return ContinueBtn;
	}
	
	
}
