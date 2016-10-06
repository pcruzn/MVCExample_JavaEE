package cl.utfsm.inf.adsw.model;

import cl.utfsm.inf.adsw.domain.Document;

public class DocumentService {
	public static boolean process(int processId, Document docToBeProcessed) {
		boolean status = true;
		
		if (ValidationService.validatePersonalData(docToBeProcessed)) {
			// do something
		}
		else {
			// call ErrorService to record error
			ErrorService.logError(processId, docToBeProcessed, 1);
			status = false;
		}
		
		if (ValidationService.validateFinancialData(docToBeProcessed)) {
			// do something
		}	  
		else {
			// call ErrorService to record error
			status = false;
		}
		
		if (ValidationService.validateExternalData(docToBeProcessed)) {
			// do something
		}
		else {
			// call ErrorService to record error
			status = false;
		}
		
		return status;
	}
}
