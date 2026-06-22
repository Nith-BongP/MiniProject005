import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Button button_create;

    @FXML
    private Button button_delete;

    @FXML
    private Button button_read;

    @FXML
    private Button button_update;

    @FXML
    private Label label_status;

    @FXML
    void on_create(ActionEvent event) {

    }

    @FXML
    void on_delete(ActionEvent event) {

    }

    @FXML
    void on_read(ActionEvent event) {

    }

    @FXML
    void on_update(ActionEvent event) {

    }
    @FXML
    void initialize() {
        var data = new ArrayList<String>();
        data.add("Apple");
        data.add("Banana"); 
        data.add("Orange");
    }

}
