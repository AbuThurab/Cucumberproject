package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

//POM = Page Object Model
public class ObjectRepository extends BaseClass {
	public ObjectRepository() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "email")
	private WebElement TypeEmail;
	@FindBy(id = "pass")
	private WebElement Typepassword;
	@FindBy(name = "login")
	private WebElement Click;

	public WebElement getTypeEmail() {
		return TypeEmail;
	}

	public WebElement getTypepassword() {
		return Typepassword;
	}

	public WebElement getClick() {
		return Click;
	}

}
