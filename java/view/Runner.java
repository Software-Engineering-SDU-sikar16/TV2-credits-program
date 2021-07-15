package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Runner extends Application {

    public static Stage homeStage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        homeStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("login_home.fxml"));
        homeStage.setScene(new Scene(root, 1000, 800));
        homeStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
