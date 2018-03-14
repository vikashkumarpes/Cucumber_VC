Feature: As a user I want to see all the products that I filtered

  
  Scenario: Opening a filter tab
    Given : I’m in the ‘Arma’ product locator
      And : I click on the “men” option tab
     Then : I should see “Jackets” in the menu

  Scenario: Only one gender tab should remain opened
    Given : I’m in the ‘Arma’ product locator
      And : I click on the “men” option tab
      And : I click on the “women”option tab
     Then : I should see that the “women” tab is opened
      And : I should see that the “man” tab is closed

  Scenario: Clicking on the filters
    Given : I’m in the ‘Arma’ product locator
      And : I click on the “women” filter “Jackets”
     Then : the query string should contain “genders[0]” = “women”
      And : the query string should contain “age_groups[0]” = “adults”
      And : the query string should contain “types[0]” = “women-leather- jackets-arma”
      And : the product cards are visible with the keyword “bikerjack”
      And : I should see no skirts

  Scenario: When selecting a gender filter size and color should update
    Given : I’m in the ‘Arma’ product locator
      And : I click on the women’s filter jackets
     Then : I should see that the size filter has changed
      And : I should see that the color filter has changed
      And : I click on size option “34”
     Then : the query string should contain “genders[0]” = “women”
      And : the query string should contain “age_groups[0]” = “adults”
      And : the query string should contain “types[0]” = “women-leather- jackets-arma”
      And : the query string should contain “color[0]” = “black”
     Then : I should see no skirts

  Scenario: when scrolling down I should see more products loading
     Given: I’m in the ‘Nono’ product locator
      And : I scroll down
     Then : I should see more than (one page) products
  
  
  
  

