public class HomePage {

	public void goToHomePage(){
		// Load all the home page elements
	}
	public void searchProduct(){
		/* Search and filter products
		 * Add product to cart
		 */
	}
}

public class paymentPage {
	
	public void goToPaymentPage(){
		// Load all the home page elements
	}
	public void makePayment(){
		/* Choose mode of payment
		 * Validate payment credentials
		 * Connect to payment gateway
		 */
	}
}

public  class LoginPage {

	public void goToLoginPage(){
		//Load username and password fields
	}
	public validateLoginCredetials(){
		//validate username and password
		submit.click();
		//Call Login() method
	}
	
	public <page> page login(page home){
		return home();
	}
}

public  class Test{
	
	public void test(){
		new Homepage().goToHomePage.login(new PaymentPage());
		new Homepage().goToHomePage.login(new HomePage());
	}
	
}
