# Selenium Automation Project

A beginner-friendly browser automation project built using **Java, Selenium WebDriver, TestNG, and Maven**.

This project demonstrates automated web testing through browser interaction, element identification, form submission, and result validation.

## Tech Stack

- **Language:** Java 17
- **Automation:** Selenium WebDriver 4.52.0
- **Testing Framework:** TestNG 7.12.0
- **Build Tool:** Maven
- **Browser:** Brave Browser
- **Version Control:** Git and GitHub

## Project Structure

```text
Selenium_Automation/
├── src/
│   └── test/
│       └── java/
│           └── BraveTest.java
├── pom.xml
└── .gitignore
```

## Implemented Test Cases

### Web Form Automation

The automated test performs the following steps:

1. Launches the Brave browser.
2. Opens the Selenium WebDriver test page.
3. Validates the page title.
4. Locates the text input field.
5. Enters test data.
6. Submits the form.
7. Validates the successful submission message.
8. Closes the browser session.

## Prerequisites

Make sure you have the following installed:

- Java JDK 17 or later
- Apache Maven
- Brave Browser
- Git

## How to Run

Clone the repository:

```bash
git clone https://github.com/Imdad2005/Selenium_Automation.git
```

Navigate into the project:

```bash
cd Selenium_Automation
```

Run the automated tests:

```bash
mvn clean test
```

## Concepts Practised

- Selenium WebDriver
- Browser automation
- Web element locators
- TestNG annotations and assertions
- Maven dependency management
- Explicit waits
- Git version control

## Author

**Imdad Aqueel**

[GitHub Profile](https://github.com/Imdad2005)

---

*This project is part of my hands-on learning journey in software testing and test automation.*
