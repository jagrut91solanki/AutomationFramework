# AutomationFramework
Automation Testing | Web | Java | OOPS | Selenium WebDriver | TestNG | Maven | ExtentReport 

# Introduction
This Test Automation Framework is created using Java + Selenium Web Driver + TestNG. Which can be used across different web based applications.
#  Prerequisites
What things you need to install the software and how to install them:

* Java (1.8  or later)
* Maven (3.6.1 or later)
* Integrated Development Environment (Eclipse Suggested)

# Installation
These instructions assume you are using Eclipse.

On the command line: Clone the project from git.

git clone https://github.com/jagrut91solanki/AmazonAutomation.git

1. Open Eclipse
2. File -> Open Projects from File system...
3. Next to Import Source click the Directory button and browse to the installed location.
4. Click the Finish button.
5. Right-Click on the project in the Project Explorer.
6. Maven -> Update Project...
7. Wait for the status bar in the lower right-hand corner to finish before continuing.

## Running the Tests ##

On the command line type: mvn test

In Eclipse:

1. Rightclick on Project and Run as maven test
2. Rightclick on Testng.xml File and Run as Testng Runner
3. Open Command Line Terminal from Eclipse and give path of Project and use maven test  

## Project Components ##

Below are the component details of the framework:

* Browser interaction using
    ###### Selenium ######
  
* Test Data
  
  Supports to read and maintain data from multiple file types like:
  
    *  Properties File
    *  JSON File
      
 * Test Scripts
 
 TestNg is used as a test framework in order to generate test script taking into account the Page Object Model design pattern.
 
* Build Tool

Using maven, project dependencies are managed. Test can be run using pom.xml and testng.xml.

* Reporting

Reporting Generates html report automatically by using Extent Report 5. By attaching screenshots and execution videos of the failed test cases. However, user can set the framework to take screenshots and videos of passed or/and skipped test cases. All reports are generated in reports-test-output folder. Report automatically opens in default browser. Note: Exception logs and fail reasons are added to the report as well. All images are in Base64 and videos in mp4.

* Utilities

Holds common methods to re-use in order to achieve maximum re-usability.

## Settings for Properties file ##

* url of the test environment.
* environment where the test has to be performed.
* testername inorder to keep track.
* downloadwebdriver to decide if tester want to place the drivers or wants the framework to download it with the help of WebDriverManager.
* runmode decides whether to run test cases on local, grid. Accepts yes or no.
* if runmode is yes then user has to provide the remote url in remoteurl.
* To delete old report data:
* deleteoldreports - to elect if tester wants to delete old reports. Accepts yes or no.
* numberofdays - if yes than how old the files should be. Value in number of days.
* overridereports to elect if tester want all reports to be merged in one i.e., current reports plus old ones or create new report for each test suite run. Accepts yes or no. Screenshots: *passedscreenshot - to take screenshot of passed test cases. Accepts yes or no. *retryfailedtestcasesto re-run fail test cases. Accepts yes or no. Not recommended setting to set it as yes.

## Execution ##


https://user-images.githubusercontent.com/38151216/206831845-a80a69f9-70c4-49e0-b909-370625f9d269.mp4

