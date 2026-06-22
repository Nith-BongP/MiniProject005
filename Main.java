import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;



public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        var view_main = getClass().getResource("view.fxml");
        var loader_main = new FXMLLoader(view_main);

        var scene = new Scene(loader_main.load());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}