package co.com.banistmo.util;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchWindow {
    private  SwitchWindow() {
    }

    public static boolean switchWindow(ChromeDriver driver) {

        String mainWindow = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(mainWindow)) {
                driver.close();
                driver.switchTo().window(handle);
                driver.manage().window().maximize();
                return true;
            } else {
                driver.switchTo().window(mainWindow);
            }
        }
        return false;
    }
}

