Added   # BeaconTest

About Project : A Skeleton framework is created using Cucumber Webdriver Java- BDD approach(Gherkin Language) using common methods & iframe.

Required POM dependencies:
-------------------------------
Junit
Cucumber-Java
Cucumber-Junit
Gherkin
Cucumber-Java-Deps
Cucumber-Reporting
Selenium -Java
Cucumber-Jvm



Test Description:
-------------------
Created a E2E test that comprises the below steps:
This Automation script is to validate below steps:
Login to https://www.saucedemo.com/ using the "standard_user" account
Sort the products by Price (high to low)
Add the Costliest and 2nd cheapest product to your basket
Open the basket
Checkout
Enter details and Finish the purchase
Then find no of iframes on this page and Switch to another frame
Quit the Browser

Steps to Run the test:
-------------------------
Step1:
Clone the project from the below repositiry:
https://github.com/fineprashant23/BeaconTest.git

Method1:
Open this project in Eclipse or any other editor of your choice
Go to /src/test/java/ directory and run runner.TestRunner.java
Right Click and select 'Run as: Junit Test'. This will start test execution for the scenario mentioned above.
For Test Report
Validate console for Test progress & execution.
Refresh the project directory and validate test report from  /test-output/ directory. Open index.html file in any browser.

Method 2:
Step2:  Open the command line and navigate to your local project folder
Step3: Run 'mvn test'
This will run automation test case for above mentioned scenario.
