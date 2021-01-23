package porg.pomtask2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.pombase.BaseClass;

public class PomLoginPojo extends BaseClass {
	public PomLoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="email")
private WebElement txtEmail;

@FindBy(id="pass")
private WebElement txtPass;

@FindBy(name="login")
private WebElement btnLogin;

public WebElement getTxtEmail() {
	return txtEmail;
}

public WebElement getTxtPass() {
	return txtPass;
}

public WebElement getBtnLogin() {
	return btnLogin;
}
}
