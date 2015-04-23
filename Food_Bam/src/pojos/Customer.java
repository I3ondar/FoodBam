package pojos;

public class Customer {

	private int customerID;
	private String custFirstName;
	private String custLastName;
	private String custEmail;
	
	private Customer(){
		this.customerID = 0;
		this.custFirstName = "";
		this.custLastName = "";
		this.custEmail = "";
	}

	/**
	 * @param customerID
	 * @param custFirstName
	 * @param custLastName
	 * @param custEmail
	 */
	public Customer(int customerID, String custFirstName, String custLastName,
			String custEmail) {
		this.customerID = customerID;
		this.custFirstName = custFirstName;
		this.custLastName = custLastName;
		this.custEmail = custEmail;
	}

	/**
	 * @return the customerID
	 */
	public int getCustomerID() {
		return customerID;
	}

	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	/**
	 * @return the custFirstName
	 */
	public String getCustFirstName() {
		return custFirstName;
	}

	/**
	 * @param custFirstName the custFirstName to set
	 */
	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}

	/**
	 * @return the custLastName
	 */
	public String getCustLastName() {
		return custLastName;
	}

	/**
	 * @param custLastName the custLastName to set
	 */
	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}

	/**
	 * @return the custEmail
	 */
	public String getCustEmail() {
		return custEmail;
	}

	/**
	 * @param custEmail the custEmail to set
	 */
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	
	
	
}
