package org.pomtask1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.pombase.BaseClass;

public class PomLoginPojo4 extends BaseClass{
	public PomLoginPojo4() {
		PageFactory.initElements(driver, this);

}
	@FindBy(id = "")
	private WebElement btnRadio;

	@FindBy(id = "")
	private WebElement btnCont;

	

}
