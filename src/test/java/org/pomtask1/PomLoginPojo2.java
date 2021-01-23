package org.pomtask1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.pombase.BaseClass;

public class PomLoginPojo2 extends BaseClass {
	public PomLoginPojo2() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "radiobutton_0")
	private WebElement btnRadio;

	@FindBy(id = "continue")
	private WebElement btnCont;

	public WebElement getBtnRadio() {
		return btnRadio;
	}

	public WebElement getBtnCont() {
		return btnCont;
	}

}
