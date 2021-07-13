package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller extends SceneChanger {

    @FXML
    void loadNext(ActionEvent event) {
        changeScene("page2.fxml");
    }

}
