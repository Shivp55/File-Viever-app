package com.example.gapp;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class StudentRegistration extends Application {


    @Override
    public void start(Stage stageStart) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        

        Scene s = new Scene(root);
        stageStart.setScene(s);
        stageStart.setResizable(false);
        stageStart.setTitle("Student Registration");
        stageStart.show();

    }

}