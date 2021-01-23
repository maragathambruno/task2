package org.pomtask1;

import java.io.IOException;

import org.pombase.BaseClass;

public class pomExcetutable extends BaseClass {
	public static void main(String[] args) throws IOException {
		loadBrowser();
		launchUrl("http://adactinhotelapp.com/index.php");
		maxwindow();

		PomLoginPojo l = new PomLoginPojo();
		fill(l.getTxtUsername(), excelRead(0, 0));
		fill(l.getTxtPass(), excelRead(0, 1));
		btnClick(l.getBtnLogin());
		PomLoginPojo1 l1 = new PomLoginPojo1();
		selectTextPom(l1.getSelLocation(), excelRead(0, 2));
		selectTextPom(l1.getSelHotels(), excelRead(0, 3));
		selectTextPom(l1.getSelRoomtype(), excelRead(0, 4));
		selectTextPom(l1.getSelRoomNo(), "2 - Two");
		//selectTextPom(l1.getSelRoomNo(), "2 - Two");
		selectTextPom(l1.getSelAdaultRoom(), "2 - Two");
		selectTextPom(l1.getSelChildRoom(),"2 - Two");
		btnClick(l1.getBtnSearch());
		PomLoginPojo2 l2 = new PomLoginPojo2();
		btnClick(l2.getBtnRadio());
		btnClick(l2.getBtnCont());
		PomLoginPojo3 l3 = new PomLoginPojo3();

		fill(l3.getTxtName(), excelRead(0, 8));
		fill(l3.getTxtLastName(), excelRead(0, 9));
		fill(l3.getTxtAdrress(), excelRead(0, 10));
		fill(l3.getTxtCCnum(), excelRead(0, 11));
		selectTextPom(l3.getSelCCtype(), "Master Card");
		selectTextPom(l3.getSelMonth(), "December");
		selectTextPom(l3.getSelYear(),"2022");

		fill(l3.getTxtCvv(), excelRead(0, 15));

		btnClick(l3.getBtnBook());
		 getAttri("order_no");
		//System.out.println(attri);
	}
}
