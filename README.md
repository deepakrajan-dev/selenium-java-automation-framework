

# Selenium Automation Framework – Beginner Guide

## 1. What is Software Testing?

Software Testing is the process of verifying that a software application works correctly according to requirements.

Example:

If a user logs into a website:

1. Enter username
2. Enter password
3. Click Login

Testing checks:

* Does login work with correct credentials?
* Does it show an error for incorrect credentials?
* Does the user reach the dashboard after login?

Testing ensures the **software behaves as expected**.

---

# 2. Manual Testing vs Automation Testing

## Manual Testing

Manual testing means a tester manually performs test steps.

Example:

1. Open browser
2. Go to website
3. Enter username
4. Enter password
5. Click login

Problems with manual testing:

* Time consuming
* Repetitive work
* Prone to human error

---

## Automation Testing

Automation testing uses **scripts to perform testing automatically**.

Example Selenium script:

* Open browser
* Navigate to website
* Enter username
* Enter password
* Click login
* Validate result

Advantages:

* Faster execution
* Repeatable
* Less manual effort
* Useful for regression testing

---

# 3. What is Selenium?

Selenium is a tool used to **automate web browsers**.

Example Selenium command:

```java
driver.get("https://www.google.com");
```

This tells the browser to open Google.

Selenium can:

* Open browser
* Click buttons
* Enter text
* Validate elements
* Read data from the webpage

---

# 4. Why Do We Need a Framework?

If automation scripts are written randomly:

* Code becomes messy
* Hard to maintain
* Difficult to reuse

A framework helps **organize automation code properly**.

Framework separates:

* Test scripts
* Page actions
* Utilities
* Reports
* Configuration

Benefits:

* Clean structure
* Reusable code
* Easy maintenance
* Scalable automation

---

# 5. What is Maven?

Maven is a **build and dependency management tool**.

It helps to:

* Download required libraries automatically
* Manage dependencies
* Build the project
* Run tests easily

Example dependencies used in automation:

* Selenium
* TestNG
* Extent Reports
* Log4j

Example dependency in `pom.xml`:

```xml
<dependency>
 <groupId>org.seleniumhq.selenium</groupId>
 <artifactId>selenium-java</artifactId>
 <version>4.18.1</version>
</dependency>
```

Without Maven you must manually download jar files.

With Maven everything is **managed automatically**.

---

# 6. What is TestNG?

TestNG is a **testing framework used with Selenium**.

It provides:

* Test execution
* Test organization
* Test reporting
* Parallel execution
* Annotations

Example test:

```java
@Test
public void loginTest() {

}
```

TestNG identifies this method as a **test case**.

---

# 7. What are TestNG Annotations?

Annotations control the execution flow of tests.

Common annotations:

* `@BeforeMethod`
* `@Test`
* `@AfterMethod`

Execution flow:

```
@BeforeMethod → @Test → @AfterMethod
```

Example:

```java
@BeforeMethod
public void setup(){
    open browser
}

@Test
public void loginTest(){
    perform login
}

@AfterMethod
public void close(){
    close browser
}
```

---

# 8. Why Do We Use Packages?

Packages help **organize the project into logical groups**.

Example structure:

```
src/main/java

base
pages
utils
listeners
reports

src/test/java

tests
```

Package purposes:

| Package   | Purpose             |
| --------- | ------------------- |
| base      | Browser setup       |
| pages     | Page actions        |
| tests     | Test scripts        |
| utils     | Utility methods     |
| listeners | Capture test events |
| reports   | Generate reports    |

---

# 9. What is Page Object Model (POM)?

Page Object Model is a **design pattern used in automation**.

Each webpage is represented as a class.

Example:

```
LoginPage.java
```

Methods inside the page class:

```
enterUsername()
enterPassword()
clickLogin()
```

Test classes simply call these methods.

Benefits:

* Reusable code
* Cleaner test scripts
* Easier maintenance

---

# 10. Why Do We Use Listeners?

Listeners monitor **test execution events**.

Events include:

* Test start
* Test success
* Test failure

Example usage:

When a test fails:

* Capture screenshot
* Log error
* Attach screenshot to report

---

# 11. Why Do We Take Screenshots?

When automation fails we need proof of what happened.

Example failure:

```
Login button not clickable
```

Screenshot helps developers understand the issue quickly.

Automation frameworks capture screenshots **automatically when tests fail**.

---

# 12. What is Extent Report?

Extent Report is an **HTML report for test execution results**.

It shows:

* Test name
* Status (Pass / Fail)
* Execution time
* Error message
* Screenshot

Example:

```
Login Test → Passed
Add To Cart Test → Failed
```

Reports help teams quickly understand test results.

---

# 13. Why Logging is Important

Logging records execution steps.

Example logs:

```
Opening browser
Navigating to login page
Entering username
Login successful
```

Logs help debug failures and track execution flow.

---

# 14. Automation Framework Execution Flow

Typical automation execution flow:

```
TestNG
   ↓
Test Class
   ↓
Page Object
   ↓
Selenium Actions
   ↓
Listener
   ↓
Screenshot + Report
```

---

# 15. Example Project Structure

```
AutomationProject

pom.xml

src
 ├── main/java
 │      base
 │      pages
 │      utils
 │      listeners
 │      reports
 │
 └── test/java
        tests

screenshots
reports
logs
```

---

# 16. Benefits of a Good Automation Framework

* Clean project structure
* Reusable components
* Easy maintenance
* Faster test execution
* Professional automation practices

---

# 17. Common Tools Used with Selenium

Modern automation frameworks often use:

```
Selenium
TestNG
Maven
Git
Jenkins
Docker
Extent Reports
Log4j
```

These tools help create **scalable and reliable automation solutions**.

---

# Conclusion

An automation framework helps testers:

* Write organized test scripts
* Execute tests efficiently
* Capture failures automatically
* Generate reports
* Maintain large automation projects easily

A good framework makes automation **reliable, scalable, and maintainable**.
