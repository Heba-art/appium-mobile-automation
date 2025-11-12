# 📱 Appium Mobile Automation 

# 🧪 Appium | Java | UiAutomator2 | TestNG | Maven

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-007396?style=flat&logo=openjdk&logoColor=white"/>
  <img src="https://img.shields.io/badge/Framework-TestNG-orange?style=flat&logo=testng&logoColor=white"/>
  <img src="https://img.shields.io/badge/Automation-Appium-4729A3?style=flat&logo=appium&logoColor=white"/>
  <img src="https://img.shields.io/badge/Engine-UiAutomator2-blueviolet?style=flat&logo=android&logoColor=white"/>
  <img src="https://img.shields.io/badge/Build-Maven-C71A36?style=flat&logo=apachemaven&logoColor=white"/>
  <img src="https://img.shields.io/badge/Device-Android%20Emulator-green?style=flat&logo=android&logoColor=white"/>
  <img src="https://img.shields.io/badge/Status-Passing-brightgreen?style=flat"/>
  <img src="https://img.shields.io/badge/Report-TestNG%20Results-success?style=flat&logo=githubactions&logoColor=white"/>
</p>

---

## 🧠 About the Project

This project demonstrates how to automate Android system applications using Appium, Java, and UiAutomator2.
The main goal is to test and verify the Android Settings app (com.android.settings) on an emulator through a structured and maintainable automation framework.
It includes multiple test cases that validate key components of the Settings app—ensuring its pages, icons, and toggles are displayed and responsive.

---

## 🚀 Project Overview

The automation suite launches and verifies the Settings app using Appium’s UiAutomator2 engine.
It first attempts to detect if the app opens automatically; if not, it performs a fallback launch.
Each test case covers an essential Settings feature — from the Search icon to Wi-Fi, Bluetooth, Sound, and more.
---

## 🧩 Tech Stack

| Tool | Purpose |
|------|----------|
| **Java** | Main programming language |
| **Appium** | Mobile automation framework |
| **UiAutomator2** | Android automation engine |
| **Maven** | Build and dependency management |
| **TestNG** | Test framework for execution and reporting |

---

## 🏗️ Project Structure

```bash
AppiumMobileAutomation/
│
├── pom.xml                      # Maven dependencies & build settings
├── testng.xml                   # TestNG suite configuration (includes all test classes)
│
├── LICENSE                      # License information (MIT)
├── README.md                    # Project documentation
├── TestCases.md                 # Detailed test cases table
│
└── src/
    └── test/
        └── java/
            └── tests/
                ├── BaseTest.java                    # Initializes & tears down Appium driver session
                │
                ├── TC01_OpenSettingsApp.java        # Opens Settings app and verifies current package
                ├── TC02_VerifySearchIcon.java       # Validates visibility & state of Search bar
                ├── TC03_VerifyNetworkOption.java    # Checks presence of "Network & Internet" option
                ├── TC04_OpenWiFiSettings.java       # Navigates into Wi-Fi section & verifies toggle/list
                ├── TC05_VerifyBluetoothSettings.java # Validates Bluetooth section in Connected Devices
                ├── TC06_ValidateSoundSettings.java   # Opens "Sound & Vibration" and verifies page
                ├── TC07_CheckDisplaySettings.java    # Validates brightness slider in Display settings
                ├── TC08_VerifyStorageInfo.java       # Checks Storage section for usage information
                ├── TC09_ScrollToBatteryOption.java   # Scrolls and verifies Battery option visibility
                └── TC10_ReturnToHomeScreen.java      # Navigates back to main Settings home screen

```


---

## ⚙️ Configuration Steps

Before running, make sure to:
1. Install **Appium Server** and ensure it’s running on `http://127.0.0.1:4723/`.
2. Start your Android **emulator** (for example: `emulator-5554`).
3. Verify that the device appears under `adb devices`.
4. .Verify your environment variables:
   JAVA_HOME
   ANDROID_HOME

---

## 🧠 Test Execution Logic

1. Wait for Settings app to open automatically.
2. If not found, use driver.activateApp("com.android.settings").
3. Validate the current package name.
4. If failure occurs, capture a screenshot and log it for debugging.
5. Run subsequent UI validations such as buttons, labels, and scroll actions.

---

## 🧪 Running the Test

Run tests using Maven:

```bash
mvn clean test
```
---

## 📸 Test Example Output

📱 Current package (1st check): com.android.settings
✅ TC01 Passed: Settings opened successfully on first try!
✅ TC02 Passed: Search icon is visible and enabled.
[INFO] BUILD SUCCESS

---

## 🛠️ Requirements

Java JDK 17+

Maven 3.9+

Appium Server 2.x

Android SDK + Emulator (API Level 30 or higher)

Properly configured PATH variables

---

## 📊 Future Enhancements

🧩 Add Allure Reports for visual analytics

🧠 Implement Page Object Model (POM) for better maintainability

⚙️ Integrate CI/CD with GitHub Actions or Jenkins

📲 Add test coverage for other system apps (Camera, Phone, etc.)

---

## 🧾 License

This project is licensed under the MIT License – you’re free to use and modify it with proper attribution.

---
## 💡 Author

Heba AL-Rubaye

Automation Test Engineer | QA Enthusiast
