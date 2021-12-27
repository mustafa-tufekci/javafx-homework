package com.example.javafxlayouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Vbox extends Application {
    @Override
    public void start(Stage stage) throws IOException{
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        VBox root = new VBox();
        Scene scene = new Scene(root,200,200);
        root.getChildren().addAll(btn1,btn2);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
