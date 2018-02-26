/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import model.*;

import org.hibernate.Transaction;

/**
 *
 * @author User
 */
public class NominativoAction extends org.apache.struts.actions.MappingDispatchAction{
    
    public ActionForward creaNominativo(ActionMapping mapping,
                             ActionForm form,
                             HttpServletRequest request, 
                             HttpServletResponse response
                             ) throws IOException, ServletException {
        
        Nominativo nuovo = new Nominativo();
        nuovo.setNome(request.getParameter("nome"));
        nuovo.setCognome(request.getParameter("cognome"));
        nuovo.setCellulare(request.getParameter("numero"));
        
        mapping.setProperty("nome", "ciao");
        
        return mapping.findForward("ok");
    }
}
