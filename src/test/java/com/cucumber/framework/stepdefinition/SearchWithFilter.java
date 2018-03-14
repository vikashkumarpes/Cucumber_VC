
package com.cucumber.framework.stepdefinition;

import org.testng.Assert;

import com.cucumber.framework.helper.PageObject.homepage.HomePage;
import com.cucumber.framework.helper.PageObject.itemsbag.ItemsBag;
import com.cucumber.framework.settings.ObjectRepo;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Vikash.Kr
 *
 */
public class SearchWithFilter {
	
	private HomePage hPage;
	private ItemsBag bag;
	
	@Given("^: I’m in the ‘Arma’ product locator$")
	public void _i_am_in_the_Aroma_page() throws Throwable {
		ObjectRepo.driver.get(ObjectRepo.reader.getWebsite1());
		hPage = new HomePage(ObjectRepo.driver);
		ObjectRepo.data.put("HomePage", hPage);
	}

	@And("^: I click on the “men” option tab$")
    public void _i_click_on_the_men_option_tab(String men) throws Throwable {
		Assert.assertTrue(hPage.checkForName(adultsMen));
	}

	
	@Then("^: I should see “Jackets” in the menu$")
	public void _i_should_see_Jackets_in_the_menu(String linkText) throws Throwable {
		Assert.assertEquals(hPage.linkText("Jackets"));
	}
	

	@And("^: I click on the “women” option tab$")
    public void _i_click_on_the_women_option_tab(String women) throws Throwable {
		Assert.assertTrue(hPage.checkForName(adultsWomen));
	}

	
	@Then("^: I should see that the “women” tab is opened$")
	public void _i_should_see_women_tab_is_opened(String linkText) throws Throwable {
		Assert.assertEquals(hPage.linkText("Tops"));
	}
	
	@And("^: I should see that the “man” tab is closed$")
    public void _i_should see_that_the_man_tab_is_closed(String men) throws Throwable {
		Assert.assertTrue(hPage.elementNotVisible("adultsMen"));
	}
	
	@Then("^: I should see that the “women” tab is opened$")
	public void _i_should_see_women_tab_is_opened(String linkText) throws Throwable {
		Assert.assertEquals(hPage.linkText("Tops"));
	}

	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



































