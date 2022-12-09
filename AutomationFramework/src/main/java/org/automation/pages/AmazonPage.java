package org.automation.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AmazonPage extends BasePage {

	By hamburgerMmenu = By.xpath("//a[@id='nav-hamburger-menu']");
	By artAndCraft = By.xpath("//div[normalize-space()='Arts & Crafts']");
	By branding = By.xpath("//a[normalize-space()='Beading & Jewelry Making']");
	By machineAndTools = By.xpath("//span[contains(text(),'Engraving Machines & Tools')]");
	By dropDownLabel = By.xpath("//span[@class='a-dropdown-label']");
	By highToLow = By.xpath("//a[@id='s-result-sort-select_2']");
	By thirdHighPrice = By.xpath("//div[@data-component-type = 's-search-result' and @data-index = '3']");
	By review = By.xpath("//span[@class='a-size-medium a-color-base']");
	By itemPrice = By.xpath("//span[@class='a-price a-text-price a-size-medium apexPriceToPay']");

	public void clickonHamburgerMenu() {
		click(hamburgerMmenu, "Click on Hamburger Menu");
	}

	public void clickonArtandCraft() {
		click(artAndCraft, "Click on Art and Craft");
	}

	public void clickonbeadAndJwelry() {
		click(branding, "Click on bead And Jwelry");
	}

	public void clickonMachineTools() {
		click(machineAndTools, "Click on Machine Tools");
	}

	public void clickonDropdownLabel() {
		click(dropDownLabel, "Click on Dropdown Label");
	}

	public void clickonHighToLow() {
		click(highToLow, "Click on High to Low");
	}

	public void clickonThirdHighPrice() {
		click(thirdHighPrice, "Click on Third highest Price");
	}

	public void checkRating() {
		String text = getText(review, "Rating is");
		int index = text.indexOf("out");
		String finalIndex = text.substring(0, index);
		float i = Float.parseFloat(finalIndex);
		if (i < 4) {
			Assert.fail("Review score is " + i + " Which is less than 4");
		}
	}

	public void checkPrice() {
		String text = getText(itemPrice, "Iterm Price is");
		String finalText = text.replaceAll("[$,]", "");
		Float i = Float.parseFloat(finalText);
		if (i > 4000) {
			Assert.fail("Item Price is : " + i + " Which is Grater than 4000");
		}
	}

}
