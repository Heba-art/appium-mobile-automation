package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {

    protected AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options() // Create Appium options for Android automation
                .setPlatformName("Android") // Define platform type (Android)
                .setAutomationName("UiAutomator2") // Define the automation engine (UiAutomator2 is default and stable)
                .setDeviceName("emulator-5554") // Optional: a readable name for your emulator or device
                .setUdid("emulator-5554") // The unique device ID (matches what you see in `adb devices`)
                .setNoReset(true)  // Don’t reset the app between sessions (keeps settings and login state)
                .setAutoGrantPermissions(true) // Automatically grant app permissions (location, camera, etc.)
                .setNewCommandTimeout(Duration.ofSeconds(120)) // Close the session if no command is received for 120 seconds

                // Open the Settings app and wait for any screen from it.
                .setAppPackage("com.android.settings") // Launch the Android Settings app
                .setAppActivity("com.android.settings.Settings") // Define the full name of the Settings main activity
                .setAppWaitActivity("com.android.settings.*")   // Allow Appium to wait for any activity under the Settings package
                .setAppWaitForLaunch(true);  // Wait until the Settings app is fully launched before proceeding


        // Start the AndroidDriver session and connect to the Appium server
        // Make sure Appium is running on this URL: http://127.0.0.1:4723/
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
        driver.activateApp("com.android.settings");

    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}

