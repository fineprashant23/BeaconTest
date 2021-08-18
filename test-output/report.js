$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("resources/features/test.feature");
formatter.feature({
  "line": 1,
  "name": "Feature to test for website- SauceLabs.com",
  "description": "",
  "id": "feature-to-test-for-website--saucelabs.com",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Check basic feature for website-SauceLabs.com",
  "description": "",
  "id": "feature-to-test-for-website--saucelabs.com;check-basic-feature-for-website-saucelabs.com",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of the page is Swag Labs",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on sort container button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user selects cheapest \u0026 the second costliest product",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user opens the basket",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user enter details and finish the purchase",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user verifies the order confirmation",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user veriies no of iframes on this page",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.user_on_login_page()"
});
formatter.result({
  "duration": 6972027572,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.title_of_the_page()"
});
formatter.result({
  "duration": 1035034013,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 2360363562,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 2200203259,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_clicks_on_sort_button()"
});
formatter.result({
  "duration": 2199373413,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_selects_cheapest_and_secondCostliest_products()"
});
formatter.result({
  "duration": 4234669820,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_opens_the_basket()"
});
formatter.result({
  "duration": 2161011482,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_clicks_on_checkout_button()"
});
formatter.result({
  "duration": 2116920413,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_enter_details_and_finish_the_purchage()"
});
formatter.result({
  "duration": 4102267762,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_verfies_the_order()"
});
formatter.result({
  "duration": 126468977,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.no_of_iframes()"
});
formatter.result({
  "duration": 1088725272,
  "status": "passed"
});
});