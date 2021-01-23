package porg.pomtask2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.pombase.BaseClass;

public class pomExcetutable extends BaseClass {
	public static void main(String[] args) throws IOException {
		loadBrowser();
		launchUrl("https://www.facebook.com/");
		maxwindow();

		PomLoginPojo l = new PomLoginPojo();
		fill(l.getTxtEmail(), excelRead(0, 0));
		fill(l.getTxtPass(), excelRead(1, 0));
		btnClick(l.getBtnLogin());
		
		

		closebrowser();

	}

}
