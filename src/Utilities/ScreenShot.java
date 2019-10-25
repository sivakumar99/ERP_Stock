package Utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.gargoylesoftware.css.util.ThrowCssExceptionErrorHandler;

public class ScreenShot 
{
public static void Takescreen(WebDriver driver, String sname) throws Throwable
{
	String path="D:\\mrng930batch\\ERP_Stock\\screens\\"+sname+".png";
			File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screen,  new File(path));
}
}

