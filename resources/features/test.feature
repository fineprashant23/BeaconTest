Feature: Feature to test for website- SauceLabs.com

@Test
Scenario: Check basic feature for website-SauceLabs.com

Given user is already on login page
When title of the page is Swag Labs
When user enters username and password
And user clicks on Login button
When user clicks on sort container button
And user selects cheapest & the second costliest product
Then user opens the basket
And user clicks on checkout button
Then user enter details and finish the purchase
Then user verifies the order confirmation
Then user veriies no of iframes on this page