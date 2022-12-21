package com.example.contactapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ContactApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ContactApp.fxml"));
        primaryStage.setTitle("Contact App");
        primaryStage.setScene(new Scene(root, 670, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}