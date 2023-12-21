package com.example.gapp;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML

    private TextField fName;
    @FXML
    private TextField lName;
    @FXML
    private TextField year;
    @FXML
    private TextField pwd;
    @FXML

    private Button buttonExit;

    @FXML
    private void handleButtonAction(ActionEvent event) {

        if(fName.getText().equals("") || lName.getText().equals("") || year.getText().equals("")) {
            label.setText("Please enter first and last name and year of birth");
            pwd.setText("");
        }
        else{
            label.setText("Hello "+fName.getText()+" "+lName.getText()+"!" );
            pwd.setText(fName.getText()+"*"+year.getText());

        }

    }

    @FXML
    private void handleButtonExitAction (ActionEvent event){
        Stage stage=(Stage) buttonExit.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}