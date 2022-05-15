package com.ashin.net.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class PortApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/port.fxml"));
        Stage stage = new Stage();
        stage.setTitle("NetPortTool");
        stage.setScene(new Scene(root, 650, 800));
        stage.getIcons().add(new Image("images/img.png"));
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
