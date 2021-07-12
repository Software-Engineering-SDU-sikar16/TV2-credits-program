package controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class login_home
{

    @FXML private JFXButton buttonUser;
    @FXML private JFXButton buttonViewer;

//    @FXML
    public void handle_clicks(ActionEvent event) throws IOException {
        Stage s = (Stage) buttonUser.getScene().getWindow();
        s.close();
        if(event.getSource() == buttonUser)
        {
            Parent root = FXMLLoader.load(getClass().getResource("../fxml/login.fxml"));
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("scene.fxml"));
//            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
//            stage.setScene(new Scene(root));
            stage.setScene(new Scene(root, 700, 500));
            stage.show();

        }
        else if(event.getSource() == buttonViewer)
        {

        }


    }
}
