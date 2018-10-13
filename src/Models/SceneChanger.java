package Models;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneChanger {
    public static void changeScenes(ActionEvent sceneChange, String viewName, String title) throws IOException {
        Parent root = FXMLLoader.load(new Object(){}.getClass().getResource(viewName));
        Scene scene = new Scene(root);

        Stage primaryStage = (Stage)((Node)sceneChange.getSource()).getScene().getWindow();

        primaryStage.setScene(scene);
        primaryStage.setTitle(title);
        primaryStage.show();
    }
}
