/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Entities.Ordonnance;
import Entities.Produit;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import services.CRUDOrdonnance;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class FirstFormOrdonnanceController implements Initializable {

    @FXML
    private TextField tfDateOrd;
    @FXML
    private Button btnEnregistrer;
    @FXML
    private TextField tfNomPrePatient;
    @FXML
    private TextField tfMédicaments;
    @FXML
    private TextField tfModeUtilis;
    @FXML
    private Button btnActualiser;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveOrdonnance(ActionEvent event) {
        //suvegarde dans la BD
        String dateAjout = tfDateOrd.getText();
        String nomPrénomPatient = tfNomPrePatient.getText();
        String produit = tfMédicaments.getText();
       // String médicaments = tfMédicaments.getText(); //???
        String modeUtilisation = tfModeUtilis.getText();
        Ordonnance ord = new Ordonnance(dateAjout, modeUtilisation, nomPrénomPatient, produit);
        CRUDOrdonnance pcd = new CRUDOrdonnance();
        pcd.ajouterOrdonnance(ord);
        System.out.println("Ordonnance ajoutée!!");
       // JOptionPane.showConfirmDialog(parentComponent, null);
                                          
        
        //Redirection 
    }
    
}
