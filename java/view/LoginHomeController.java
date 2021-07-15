package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class LoginHomeController extends SceneChanger {

    @FXML void loginAsUser(ActionEvent event) {
        changeScene("login.fxml");
    }
    @FXML void loginAsViewer(ActionEvent event) {
        changeScene("login.fxml");
    }
}

