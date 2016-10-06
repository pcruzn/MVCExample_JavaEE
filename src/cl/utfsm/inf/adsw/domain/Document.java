package cl.utfsm.inf.adsw.domain;

public class Document {

	private String personalData;
	private String financialData;
	private String orderData;
	
	// normally, Document constructor will be used to create Document objects
	public Document (String personalData, String financialData, String orderData) {
		this.setPersonalData(personalData);
		this.setFinancialData(financialData);
		this.setOrderData(orderData);
	}

	// next lines are getters and setters
	// most of the time, getters will be used (parameter setting will be carried out
	// by using class' constructor)
	public String getPersonalData() {
		return personalData;
	}
	
	// DocId in this example is the same as personalData!!
	public String getDocId() {
		return personalData;
	}

	public void setPersonalData(String personalData) {
		this.personalData = personalData;
	}

	public String getFinancialData() {
		return financialData;
	}

	public void setFinancialData(String financialData) {
		this.financialData = financialData;
	}

	public String getOrderData() {
		return orderData;
	}

	public void setOrderData(String orderData) {
		this.orderData = orderData;
	}
	
	
	
}
