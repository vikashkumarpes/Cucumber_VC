package com.cucumber.framework.configuration.browser;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author Vikash
 */
public class HtmlUnitBrowser {
	
	public Capabilities getHtmlUnitDriverCapabilities() {
		DesiredCapabilities unit = DesiredCapabilities.htmlUnitWithJs();
		return unit;
	}
	
	public WebDriver getHtmlUnitDriver(Capabilities cap) {
		return new HtmlUnitDriver(cap);
	}

}
