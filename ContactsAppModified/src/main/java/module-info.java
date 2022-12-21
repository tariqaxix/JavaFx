module com.example.contactsappmodified {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.contactsappmodified to javafx.fxml;
    exports com.example.contactsappmodified;
}