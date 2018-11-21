package com.capg.paymentwallet.test;

public class Test {

/*	private static IAccountService service;

	@BeforeClass
	public static void createInstance() {
		service = new AccountServiceImpl();

	}

	@org.junit.Test
	public void testCreateAccount() throws Exception {
		CustomerBean bean = new CustomerBean();
		bean.setFirstName("rohini");
		bean.setLastName("Thunuguntla");
		bean.setPhoneNo("9059900989");
		bean.setPanNum("ASDF12345S");
		bean.setAddress("vijayawada");
		bean.setEmailId("rohini6rani@gmail.com");
		AccountBean bean1 = new AccountBean();
		bean1.setBalance(5000);
		bean1.setInitialDeposit(500);
		bean1.setCustomerBean(bean);
		bean1.setDateOfOpening(new Date());
		service.createAccount(bean1);
	}

	@org.junit.Test(expected = CustomerException.class)
	public void testCreateAccountForFirstName() throws Exception {
		CustomerBean bean = new CustomerBean();
		bean.setFirstName("ri");
		bean.setLastName("Thunuguntla");
		bean.setPhoneNo("9059900989");
		bean.setPanNum("ASDF12345S");
		bean.setAddress("vijayawada");
		bean.setEmailId("rohini6rani@gmail.com");
		AccountBean bean1 = new AccountBean();
		bean1.setBalance(5000);
		bean1.setInitialDeposit(500);
		bean1.setCustomerBean(bean);
		bean1.setDateOfOpening(new Date());
		service.createAccount(bean1);
	}

	@org.junit.Test(expected = CustomerException.class)
	public void testCreateAccountForLastName() throws Exception {
		CustomerBean bean = new CustomerBean();
		bean.setFirstName("rohini");
		bean.setLastName("T");
		bean.setPhoneNo("9059900989");
		bean.setPanNum("ASDF12345S");
		bean.setAddress("vijayawada");
		bean.setEmailId("rohini6rani@gmail.com");
		AccountBean bean1 = new AccountBean();
		bean1.setBalance(5000);
		bean1.setInitialDeposit(500);
		bean1.setCustomerBean(bean);
		bean1.setDateOfOpening(new Date());
		service.createAccount(bean1);
	}

	@org.junit.Test(expected = CustomerException.class)
	public void testCreateAccountForPhnNoLength() throws Exception {
		CustomerBean bean = new CustomerBean();
		bean.setFirstName("rohini");
		bean.setLastName("Thunuguntla");
		bean.setPhoneNo("905990989");
		bean.setPanNum("ASDF12345S");
		bean.setAddress("vijayawada");
		bean.setEmailId("rohini6rani@gmail.com");
		AccountBean bean1 = new AccountBean();
		bean1.setBalance(5000);
		bean1.setInitialDeposit(500);
		bean1.setCustomerBean(bean);
		bean1.setDateOfOpening(new Date());
		service.createAccount(bean1);
	}

	@org.junit.Test(expected=CustomerException.class)
	public void testCreateAccountForPhnNoStarting() throws Exception {
		CustomerBean bean = new CustomerBean();
		bean.setFirstName("rohini");
		bean.setLastName("Thunuguntla");
		bean.setPhoneNo("2059900989");
		bean.setPanNum("ASDF12345S");
		bean.setAddress("vijayawada");
		bean.setEmailId("rohini6rani@gmail.com");
		AccountBean bean1 = new AccountBean();
		bean1.setBalance(5000);
		bean1.setInitialDeposit(500);
		bean1.setCustomerBean(bean);
		bean1.setDateOfOpening(new Date());
		service.createAccount(bean1);
	}

	@org.junit.Test(expected = CustomerException.class)
	public void testCreateAccountForPanNoLength() throws Exception {
		CustomerBean bean = new CustomerBean();
		bean.setFirstName("rohini");
		bean.setLastName("Thunuguntla");
		bean.setPhoneNo("9059900989");
		bean.setPanNum("ASDF1234");
		bean.setAddress("vijayawada");
		bean.setEmailId("rohini6rani@gmail.com");
		AccountBean bean1 = new AccountBean();
		bean1.setBalance(5000);
		bean1.setInitialDeposit(500);
		bean1.setCustomerBean(bean);
		bean1.setDateOfOpening(new Date());
		service.createAccount(bean1);
	}

	@org.junit.Test(expected = CustomerException.class)
	public void testCreateAccountForAddressLength() throws Exception {
		CustomerBean bean = new CustomerBean();
		bean.setFirstName("rohini");
		bean.setLastName("Thunuguntla");
		bean.setPhoneNo("9059900989");
		bean.setPanNum("ASDF12345S");
		bean.setAddress("v");
		bean.setEmailId("rohini6rani@gmail.com");
		AccountBean bean1 = new AccountBean();
		bean1.setBalance(5000);
		bean1.setInitialDeposit(500);
		bean1.setCustomerBean(bean);
		bean1.setDateOfOpening(new Date());
		service.createAccount(bean1);
	}

	@org.junit.Test(expected = CustomerException.class)
	public void testCreateAccountForEmail() throws Exception {
		CustomerBean bean = new CustomerBean();
		bean.setFirstName("rohini");
		bean.setLastName("Thunuguntla");
		bean.setPhoneNo("9059900989");
		bean.setPanNum("ASDF12345S");
		bean.setAddress("vijayawada");
		bean.setEmailId("rohini6ranigmail.com");
		AccountBean bean1 = new AccountBean();
		bean1.setBalance(5000);
		bean1.setInitialDeposit(500);
		bean1.setCustomerBean(bean);
		bean1.setDateOfOpening(new Date());
		service.createAccount(bean1);
	}

	@org.junit.Test(expected = CustomerException.class)
	public void testCreateAccountForEmailcom() throws Exception {
		CustomerBean bean = new CustomerBean();
		bean.setFirstName("rohini");
		bean.setLastName("Thunuguntla");
		bean.setPhoneNo("9059900989");
		bean.setPanNum("ASDF12345S");
		bean.setAddress("vijayawada");
		bean.setEmailId("rohini6rani@gmail");
		AccountBean bean1 = new AccountBean();
		bean1.setBalance(5000);
		bean1.setInitialDeposit(500);
		bean1.setCustomerBean(bean);
		bean1.setDateOfOpening(new Date());
		service.createAccount(bean1);
	}

	@org.junit.Test(expected = CustomerException.class)
	public void testCreateAccountForinitialDepositNegative() throws Exception {
		CustomerBean bean = new CustomerBean();
		bean.setFirstName("rohini");
		bean.setLastName("Thunuguntla");
		bean.setPhoneNo("9059900989");
		bean.setPanNum("ASDF12345S");
		bean.setAddress("vijayawada");
		bean.setEmailId("rohini6ranigmail.com");
		AccountBean bean1 = new AccountBean();
		bean1.setBalance(5000);
		bean1.setInitialDeposit(-500);
		bean1.setCustomerBean(bean);
		bean1.setDateOfOpening(new Date());
		service.createAccount(bean1);
	}

	@org.junit.Test
	public void testDeposit() throws Exception {
		AccountBean bean = new AccountBean();
		bean.setBalance(5000);
		double depositAmount = 500;
		service.deposit(bean, depositAmount);

	}

	@org.junit.Test(expected= CustomerException.class)
	public void testDepositNegative() throws Exception {
		AccountBean bean = new AccountBean();
		bean.setBalance(5000);
		double depositAmount = -100;
		System.out.println(service.deposit(bean, depositAmount));

	}

	@org.junit.Test
	public void testWithDraw() throws Exception {
		AccountBean bean = new AccountBean();
		bean.setBalance(5000);
		double withdrawAmount = 100;
		service.withdraw(bean, withdrawAmount);

	}

	@org.junit.Test(expected= CustomerException.class)
	public void testWithDrawNegative() throws Exception {
		AccountBean bean = new AccountBean();
		bean.setBalance(5000);
		double withdrawAmount = -100;
		service.withdraw(bean, withdrawAmount);

	}

	@org.junit.Test
	public void testFundTransfer() throws Exception {
		AccountBean bean = new AccountBean();
		bean.setBalance(5000);
		AccountBean bean1 = new AccountBean();
		bean1.setBalance(3000);
		double transferAmount = 500;
		service.fundTransfer(bean, bean1, transferAmount);

	}

	@org.junit.Test(expected= CustomerException.class)
	public void testFundTransferNegative() throws Exception {
		AccountBean bean = new AccountBean();
		bean.setBalance(5000);
		AccountBean bean1 = new AccountBean();
		bean1.setBalance(3000);
		double transferAmount = -500;
		service.fundTransfer(bean, bean1, transferAmount);

	}
	@org.junit.Test
	public void findAccount() throws Exception{
		int accountid=1;
	AccountBean bean=service.findAccount(accountid);
		assertNotNull(bean);
		
	}
	@org.junit.Test
	public void findAccountNegative() throws Exception{
		int accountid=111;
	AccountBean bean=service.findAccount(accountid);
		assertNull(bean);
		
	}*/

}
