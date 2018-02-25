/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author User
 */
public class NominativoForm extends org.apache.struts.action.ActionForm{

    private String nome;
    private String cognome;
    private String numero;
    
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getNumero() {return numero;}
    public void setNumero(String numero) {this.numero = numero;}
    
    public String getCognome() {return cognome;}
    public void setCognome(String cognome) {this.cognome = cognome;}
    
    
}
