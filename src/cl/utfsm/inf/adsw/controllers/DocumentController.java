package cl.utfsm.inf.adsw.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.utfsm.inf.adsw.domain.Document;
import cl.utfsm.inf.adsw.model.DocumentService;
import cl.utfsm.inf.adsw.model.ErrorService;

/**
 * Servlet implementation class DocumentController
 */
@WebServlet("/DocumentController")
public class DocumentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DocumentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// this is the document to be processed
		Document documentToBeProcessed = 
				new Document (
						request.getParameter("personalData"),
						request.getParameter("financialData"),
						request.getParameter("extData")
				);
		
		// in some way, determine the process number
		int processId = 10;
		
		// this is, actually, the controlling stage!
		if (DocumentService.process(processId, documentToBeProcessed)) {
			// everything went ok!
			request.getRequestDispatcher("validationOK.jsp").forward(request, response);
		}
		else {
			// at least one validation failed :(
			request.setAttribute("errors", ErrorService.getErrorsByProcessId(processId));
		    request.getRequestDispatcher("validationErrors.jsp").forward(request, response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
