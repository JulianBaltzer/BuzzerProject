package com.example.buzzerapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.net.URL;

public class HelloController {
    @FXML
    public Button closebutton;
    @FXML
    private Label welcomeText;





    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");

    }

    @FXML
    protected void exit_app(){
        Stage stage = (Stage) closebutton.getScene().getWindow();

        stage.close();
    }
}