package pageUIs.user;

public class RegisterPageUI {

	public static final String FIRSTNAME_TEXTBOX = "//input[@id=\"FirstName\"]";
	public static final String LASTNAME_TEXTBOX = "//input[@id=\"LastName\"]";
	public static final String EMAIL_TEXTBOX = "//input[@id=\"Email\"]";
	public static final String PASSWORD_TEXTBOX = "//input[@id=\"Password\"]";
	public static final String CONFIRM_PASSWORD_TEXTBOX = "//input[@id=\"ConfirmPassword\"]";
	public static final String REGISTER_BUTTON = "//button[@id=\"register-button\"]";
	public static final String FIRSTNAME_ERROR_MESSAGE = "//span[@id=\"FirstName-error\"]";
	public static final String LASTNAME_ERROR_MESSAGE = "//span[@id=\"LastName-error\"]";
	public static final String EMAIL_ERROR_MESSAGE = "//span[@id=\"Email-error\"]";
	public static final String PASSWORD_ERROR_MESSAGE = "//span[@id=\"Password-error\"]";
	public static final String CONFIRM_PASSWORD_ERROR_MESSAGE = "//span[@id=\"ConfirmPassword-error\"]";
	public static final String REGISTER_SUCCESS_MESSAGE = "//div[@class=\"result\"]";
	public static final String EXISTING_EMAIL_ERROR_MESSAGE = "//li[text()=\"The specified email already exists\"]";
	public static final String WRONG_EMAIL_MESSAGE = "//li[text()=\"Wrong email\"]";
	public static final String LOGIN_LINK = "//a[@class=\"ico-login\"]";
	public static final String LOGOUT_LINK = "//a[@class=\"ico-logout\"]";
}
