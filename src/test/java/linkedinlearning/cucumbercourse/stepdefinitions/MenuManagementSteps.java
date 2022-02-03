package linkedinlearning.cucumbercourse.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import linkedinlearning.cucumbercourse.RestaurantMenu;
import linkedinlearning.cucumbercourse.RestaurantMenuItem;

public class MenuManagementSteps {
	
	RestaurantMenuItem NewMenuItem;
	RestaurantMenu LocationMenu = new RestaurantMenu();
	
	@Given("I have a menu item with name {string} and price {int}")
	public void i_have_a_menu_item_with_name_and_price(String newMenuItemName, Integer price) {
	    NewMenuItem = new RestaurantMenuItem(newMenuItemName, newMenuItemName, price);
	}

	@When("I add that menu item")
	public void i_add_that_menu_item() {
	    RestaurantMenu Locationmenu;
	    LocationMenu.addMenuItem(NewMenuItem);
	}

	@Then("Menu Item with name {string} should be added")
	public void menu_item_with_name_should_be_added(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
