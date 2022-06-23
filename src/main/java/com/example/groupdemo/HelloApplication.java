package com.example.groupdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("playvids.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 600);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        stage.setTitle("NetFlaxx Streaming Service");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}