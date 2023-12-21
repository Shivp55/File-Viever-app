module com.example.gapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gapp to javafx.fxml;
    exports com.example.gapp;
}