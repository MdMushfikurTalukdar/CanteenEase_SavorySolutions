package com.example.canteenease_savorysolutions;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AdminPanel extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("AdminPanel.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Admin Panel");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
