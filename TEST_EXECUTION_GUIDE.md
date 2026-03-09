# Selenium Java Automation Framework Guide

## Overview

This framework is built using:

* **Java**
* **Selenium WebDriver**
* **TestNG**
* **Maven**
* **Extent Reports**
* **Log4j (Logging)**

It is designed to execute UI automation tests and generate reports when tests pass or fail.

---

# Project Structure

```
selenium-java-automation-framework
│
├── src
│   ├── main/java
│   │   ├── base        → WebDriver setup
│   │   ├── pages       → Page Object classes
│   │   └── utils       → Utilities (Screenshot, Logger, etc.)
│   │
│   └── test/java
│       ├── tests       → Test classes
│       └── listeners   → TestNG listeners
│
├── screenshots        → Failure screenshots
├── logs               → Execution logs
├── test-output        → TestNG reports
├── extentReports      → Extent HTML reports
│
├── pom.xml
├── testng.xml
└── README.md
```

---

# How to Execute Tests

## Method 1 — Run Using TestNG XML

1. Locate the file:

```
testng.xml
```

2. In your IDE (Eclipse / IntelliJ):

```
Right Click → testng.xml
Run As → TestNG Suite
```

This will execute all test classes defined inside the TestNG suite file.

---

## Method 2 — Run Using Maven

From the project root directory, run:

```bash
mvn clean test
```

Maven will:

1. Compile the project
2. Execute TestNG tests
3. Generate reports

---

# Test Execution Flow

```
TestNG.xml
     ↓
Test Classes
     ↓
Page Object Methods
     ↓
Selenium WebDriver Actions
     ↓
Listeners Capture Results
     ↓
Reports + Screenshots Generated
```

---

# Where to Check Test Results

## TestNG Report

After execution, open:

```
test-output/index.html
```

This shows:

* Passed tests
* Failed tests
* Skipped tests
* Execution time

---

## Extent Report

If Extent Reports are enabled, open:

```
extentReports/ExtentReport.html
```

This report provides:

* Detailed test steps
* Pass / Fail status
* Logs
* Screenshot attachment

---

# Where to Find Failure Screenshots

When a test fails, the listener captures a screenshot automatically.

Location:

```
screenshots/
```

Example:

```
screenshots/LoginTest_failure.png
```

These screenshots help debug UI failures.

---

# Where to Check Logs

Execution logs are saved in:

```
logs/
```

Logs contain:

* Test execution steps
* Errors
* Debug information

---

# What Happens When a Test Fails

If a test fails:

1. TestNG listener detects failure
2. Screenshot is captured
3. Screenshot is stored in `screenshots/`
4. Failure is logged
5. Status is updated in the report

---

# Running a Single Test

Open the test class and run:

```
Right Click → Run As → TestNG Test
```

---

# Prerequisites

Install the following before running the framework:

* Java JDK 11+
* Maven
* Git
* IDE (Eclipse / IntelliJ)

---

# Clone the Repository

```
git clone https://github.com/<your-username>/selenium-java-automation-framework.git
```

---

# Author

Automation Framework created for learning and UI test automation.
