package cl.utfsm.inf.adsw.model;

import cl.utfsm.inf.adsw.domain.Document;

public class ValidationService {
	public static boolean validatePersonalData (Document documentToBeValidated) {
		// for this example, personalData = 10000000-5 has an error
		if (documentToBeValidated.getPersonalData().equals("10000000-5")) {
			return false;
		} else 
			return true;
	}
	
	public static boolean validateFinancialData (Document documentToBeValidated) {
		// for this example, financial data is always ok!
		return true;
	}
	
	public static boolean validateExternalData (Document documentToBeValidated) {
		// for this example, external data is always ok!
		return true;
	}
}
