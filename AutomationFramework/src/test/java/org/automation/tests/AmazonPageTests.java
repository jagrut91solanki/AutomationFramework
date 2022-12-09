package org.automation.tests;

import org.automation.pages.AmazonPage;
import org.testng.annotations.Test;

public class AmazonPageTests extends BaseSetup {

	@Test(testName = "Check the review score and Item Price.", description = "Verify if Review Score is <4 or not and Item Price is >$4000 or not")
	public void verify() {
		AmazonPage amazon = new AmazonPage();
		amazon.clickonHamburgerMenu();
		amazon.clickonArtandCraft();
		amazon.clickonbeadAndJwelry();
		amazon.clickonMachineTools();
		amazon.clickonDropdownLabel();
		amazon.clickonHighToLow();
		amazon.clickonThirdHighPrice();
		amazon.checkRating();
	}
}
