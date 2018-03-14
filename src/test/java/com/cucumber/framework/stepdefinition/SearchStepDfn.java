
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
public class SearchStepDfn {

	private HomePage hPage;
	private ItemsBag bag;
	
	@Given("^: I’m in the ‘Arma’ product locator$")
	public void _i_am_in_the_Aroma_page() throws Throwable {
		ObjectRepo.driver.get(ObjectRepo.reader.getWebsite1());
		hPage = new HomePage(ObjectRepo.driver);
		ObjectRepo.data.put("HomePage", hPage);
	}

	@And("^: I click on a product card$")
    public void _i_click_on_a_product_card(String itemprop) throws Throwable {
		Assert.assertTrue(hPage.itemprop(name));
	}

	
	@Then("^: I should see all the product details$")
	public void _i_should_see_all_the_product_details(Long price,String classname,String image) 
			throws Throwable {
		Assert.assertEquals(hPage.price("fu-card__price"));
		Assert.assertEquals(hPage.classname("mdl-button__ripple-container"));
		Assert.assertEquals(hPage.class(""img-responsive fu-modal-product--image"));
	}
	
}
