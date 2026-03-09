package utils;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.apache.commons.io.FileUtils;

public class ScreenshotUtils {

    public static String captureScreenshot(WebDriver driver, String name) {

        String path = System.getProperty("user.dir") + "/screenshots/" + name + ".png";

        try {

            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            File dest = new File(path);

            dest.getParentFile().mkdirs();

            FileUtils.copyFile(src, dest);

            System.out.println("Screenshot saved at: " + path);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return path;
    }
}