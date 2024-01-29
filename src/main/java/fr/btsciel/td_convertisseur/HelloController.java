package fr.btsciel.td_convertisseur;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
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
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        textField_Dollars.setDisable(true);
        textField_Euros.setDisable(false);
        conversion.setOnAction(event -> conversion());

    }
}

