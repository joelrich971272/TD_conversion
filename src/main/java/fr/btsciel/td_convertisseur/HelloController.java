package fr.btsciel.td_convertisseur;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements  Initializable{
    @FXML
    private Label dialogW;
    public Button conversion ;
    public TextField textField_Dollars ;
    public TextField textField_Euros ;

    @FXML
    protected void onHelloButtonClick() {
            Alert dialogW = new Alert(Alert.AlertType.WARNING) ;
            dialogW.setTitle("A warning dialog-box");
            dialogW.setHeaderText(null);
            dialogW.setContentText("Caution : Low Level Battery !");
            dialogW.showAndWait() ;
        }


    final double Taux_E_D = 1.1 ;
    public void conversion(){
        textField_Euros.setText(String.valueOf(Double.parseDouble(textField_Euros + Taux_E_D)));
        private void dollarsEuros(){
            textField_Euros.setEditable(true);
            textField_Euros.setDisable(false);
            textField_Euros.setEditable(false);
            textField_Euros.setDisable(true);
        }
    }

    private void ComboSelection(Event event){
        (ComboBox)event.getSource();

    }
    private ArrayList<String> fabriquedonnees(){
        ArrayList<String> mesPrompt = new ArrayList<>() ;
        mesPrompt.add("Prompt 1");
        mesPrompt.add("Prompt 2");
        mesPrompt.add("Prompt 3");
        mesPrompt.add("Prompt 4");
        mesPrompt.add("Prompt 5");
        mesPrompt.forEach(element -> boxSelection.getItems().add(element));
        return mesPrompt ;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        textField_Dollars.setDisable(true);
        textField_Euros.setDisable(false);
        conversion.setOnAction(event -> conversion());


    }
}

