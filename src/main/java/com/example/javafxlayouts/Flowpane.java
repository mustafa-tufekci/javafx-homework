package com.example.javafxlayouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Flowpane extends Application {
    @Override
    public void start(Stage stage) throws IOException{
        stage.setTitle("FlowPane Example");
        FlowPane root = new FlowPane();
        root.setVgap(6);
        root.setHgap(5);
        root.setPrefWrapLength(250);
        root.getChildren().add(new Button("Start"));
        root.getChildren().add(new Button("Stop"));
        root.getChildren().add(new Button("Reset"));
        Scene scene = new Scene(root,300,200);


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
