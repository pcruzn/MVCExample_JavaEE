package cl.utfsm.inf.adsw.model;

import java.util.ArrayList;
import java.util.HashMap;

import cl.utfsm.inf.adsw.domain.Document;

public class ErrorService {
	public static void logError(int processId, Document documentWithError, int validationError) {
		// store in some way (perhaps, an SQL db, or a log file) the following tuple
		// {processId, documentWithError.getId(), validatioNError)
		
		// example: {1020, 10000000-1, 1} --> process number = 1020, document id = 900098, error = personal data error
	}
	
	public static ArrayList<HashMap<String, String>> getErrorsByProcessId (int processId) {
		// create in some way an ArrayList of HashMaps of errors
		
		// in the example we will use...
		ArrayList<HashMap<String, String>> errors = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> error = new HashMap<String, String>();
		error.put("docId", "10000000-5");
		error.put("validationError", "personal data error");
		errors.add(error);
		
		return errors;
	}
}
