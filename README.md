# 📱 Appium Mobile Automation – Android Settings Test

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

This project demonstrates how to automate Android applications using **Appium**, **Java**, and **UiAutomator2**.  
The main goal is to open and verify the **Settings app** on an Android emulator through a simple and reliable test case.

---

## 🚀 Project Overview

The project uses the **Appium automation framework** to launch and validate the `com.android.settings` app on an Android emulator.  
It includes a test that waits for the Settings app to open automatically, and if it doesn’t, triggers a fallback mechanism to open it manually.

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
├── pom.xml # Maven configuration file
├── testng.xml # TestNG suite configuration
│
└── src/
└── test/
└── java/
└── tests/
├── BaseTest.java # Sets up and tears down the Appium driver
├── FirstTest.java # Contains the test logic to open Settings
└── openSettingsTest.java # Main test class
```


---

## ⚙️ Configuration

Before running, make sure to:
1. Install **Appium Server** and ensure it’s running on `http://127.0.0.1:4723/`.
2. Start your Android **emulator** (for example: `emulator-5554`).
3. Verify that the device appears under `adb devices`.

---

## 🧠 How the Test Works

1. The test first tries to detect whether the **Settings app** is already open.  
2. If not detected within the timeout, it automatically uses `driver.activateApp("com.android.settings")` to open it manually.  
3. Once opened, it verifies that the current package equals `com.android.settings`.
4. If both checks fail, a screenshot is captured for debugging.

---

## 🧪 Running the Test

Run tests using Maven:

```bash
mvn clean test
```

## 📸 Test Example Output

📱 Current package (1st check): com.android.settings

✅ Settings app opened successfully on first try!

[INFO] BUILD SUCCESS

## 🛠️ Requirements

Java JDK 17+

Maven 3.9+

Appium Server 2.x

Android SDK with an active emulator or physical device

Environment variables properly set (JAVA_HOME, ANDROID_HOME)
## 🧾 License

This project is licensed under the MIT License – you’re free to use and modify it with proper attribution.
## 💡 Author

Heba AL-Rubaye

Automation Test Engineer | QA Enthusiast
