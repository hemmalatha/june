package org.poj;

import org.abc.Firstone;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojclass extends Firstone {
	public pojclass() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(id="email")
	private WebElement txtUser;

	@FindBy(id="pass")
	private WebElement txtPass;

	@CacheLookup
	@FindBy(name="login")
	private WebElement BtnLogin;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnSearch() {
		return BtnLogin;
	}
}
