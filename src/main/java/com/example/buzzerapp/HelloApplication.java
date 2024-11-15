package com.example.buzzerapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        
        Scene scene = new Scene(fxmlLoader.load(), (1980*0.8), (1080*0.8));
        stage.setTitle("Hello!");
        stage.setScene(scene);


        stage.setFullScreen(true);

        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}