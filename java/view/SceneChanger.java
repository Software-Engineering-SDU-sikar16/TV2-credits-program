package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneChanger
{

    void changeScene(String fxml)
    {
        Parent window1;
        try {
            window1 = FXMLLoader.load(getClass().getResource(fxml));
            Stage window1Stage;
            Scene window1Scene = new Scene(window1, 1000, 800);
            window1Stage = Runner.homeStage;
            window1Stage.setScene(window1Scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
