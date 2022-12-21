module com.example.modifiedpainterapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.modifiedpainterapp to javafx.fxml;
    exports com.example.modifiedpainterapp;
}