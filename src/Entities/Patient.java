/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author HP
 */
public class Patient {
    private int idPatient;
    private String nomPatient; 
    private String prénomPatient;

    public Patient() {
    }

    public Patient(int idPatient) {
        this.idPatient = idPatient;
    }

    public Patient(int idPatient, String nomPatient, String prénomPatient) {
        this.idPatient = idPatient;
        this.nomPatient = nomPatient;
        this.prénomPatient = prénomPatient;
    }

    public Patient(String nomPatient, String prénomPatient) {
        this.nomPatient = nomPatient;
        this.prénomPatient = prénomPatient;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public String getNomPatient() {
        return nomPatient;
    }

    public void setNomPatient(String nomPatient) {
        this.nomPatient = nomPatient;
    }

    public String getPrénomPatient() {
        return prénomPatient;
    }

    public void setPrénomPatient(String prénomPatient) {
        this.prénomPatient = prénomPatient;
    }

    @Override
    public String toString() {
        return "Patient{" + "idPatient=" + idPatient + ", nomPatient=" + nomPatient + ", pr\u00e9nomPatient=" + prénomPatient + '}';
    }
    
    
    
}
