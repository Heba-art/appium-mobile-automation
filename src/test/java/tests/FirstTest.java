package tests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;


public class FirstTest extends BaseTest {

    @Test
    public void openSettingsTest() {
        // Create an explicit wait object with a maximum timeout of 30 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        try {
            // 🔹 FIRST ATTEMPT: Wait for the Settings app to open automatically
            wait.until((WebDriver wd) -> {
                // Get the current package name from the active app
                String pkg = driver.getCurrentPackage();
                System.out.println("📱 Current package (1st check): " + pkg);

                // Return true only when the package name equals "com.android.settings"
                return "com.android.settings".equals(pkg);
            });

            // If the above condition becomes true, print a success message and exit the test
            System.out.println("✅ Settings opened successfully on first try!");
            return;

        } catch (TimeoutException e1) {
            // If 30 seconds pass and the Settings app is still not open, move to fallback
            System.out.println("⏳ Settings not detected, trying to open manually...");
        }

        // 🔹 SECOND ATTEMPT: Manually open the Settings app
        try {
            // Use Appium’s activateApp() to bring Settings to the foreground
            driver.activateApp("com.android.settings");

            // Wait up to 20 seconds for the Settings package to appear again
            new WebDriverWait(driver, Duration.ofSeconds(20)).until((WebDriver wd) -> {
                String pkg = driver.getCurrentPackage();
                System.out.println("📱 Current package (2nd check): " + pkg);
                return "com.android.settings".equals(pkg);
            });

            // Print success message if the fallback worked
            System.out.println("✅ Settings opened successfully after fallback!");

        } catch (Exception e2) {
            // If fallback also fails, capture a screenshot for debugging
            try {
                byte[] png = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                Files.createDirectories(Path.of("target"));
                Files.write(Path.of("target", "settings-open-failed.png"), png);
                System.out.println("📸 Screenshot saved in target/settings-open-failed.png");
            } catch (Exception ignored) {
                // Ignore any screenshot errors
            }

            // Explicitly fail the test so it shows as "FAILED" in the report
            Assert.fail("❌ Failed to open Settings app even after fallback.", e2);
        }
    }
}