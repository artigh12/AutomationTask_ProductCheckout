package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.ElementPom;
import com.PageObject.LoginPom;

public class VerifyTC001 extends BaseClass {

	@Test
	public void executeTC001() throws Exception {

		
		 String filepath=System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\data.xlsx";
		 FileInputStream file=new FileInputStream(filepath); XSSFWorkbook wb=new
		 XSSFWorkbook(file);
		 String userName=wb.getSheet("testData").getRow(0).getCell(0).getStringCellValue();
		 String Password=wb.getSheet("testData").getRow(0).getCell(1).getStringCellValue();
		 String Firstname=wb.getSheet("testData").getRow(1).getCell(0).getStringCellValue();
		 String Lastname=wb.getSheet("testData").getRow(1).getCell(1).getStringCellValue();
		 String Postalcode=wb.getSheet("testData").getRow(1).getCell(2).getStringCellValue();


		LoginPom login = PageFactory.initElements(driver, LoginPom.class);
		login.getUserName().sendKeys(userName);
		login.getPassword().sendKeys(Password);
		login.getLoginButton().click();

		ElementPom element = PageFactory.initElements(driver, ElementPom.class);
		// verify home page
		boolean value = element.getProducts().isDisplayed();
		Assert.assertTrue(value);
		// add to cart
		element.getAdd().click();
		element.getCart().click();
		// verify cart
		boolean value1 = element.getShoppingBag().isDisplayed();
		Assert.assertTrue(value1);
		// checkout
		element.getCheckout().click();
		// verify information
		boolean value2 = element.getInformation().isDisplayed();
		Assert.assertTrue(value2);
		// Add Information
		element.getFirstName().sendKeys(Firstname);
		element.getLastName().sendKeys(Lastname);
		element.getPostalCode().sendKeys(Postalcode);
		element.getContinueBtn().click();
		// verify order summary
		boolean value3 = element.getOverview().isDisplayed();
		Assert.assertTrue(value3);
		// place order
		element.getFinishBtn().click();
		// verify that order is placed
		boolean value4 = element.getOrderConfirmed().isDisplayed();
		Assert.assertTrue(value4);

	}

}
