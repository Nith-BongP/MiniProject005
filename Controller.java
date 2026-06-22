import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class Controller {
    
    @FXML
    private Button button_create;
    
    @FXML
    private Button button_read;
    
    @FXML
    private Button button_update;
    
    @FXML
    private Button button_delete;
    
    @FXML
    private Label label_status;
    
    @FXML
    private ListView listView;
    
    @FXML
    private void buttonCreate() {
        label_status.setText("Create");
        // TODO: Implement create functionality
    }
    
    @FXML
    private void buttonRead() {
        label_status.setText("Read");
        // TODO: Implement read functionality
    }
    
    @FXML
    private void on_update() {
        label_status.setText("Update");
        // TODO: Implement update functionality
    }
    
    @FXML
    private void on_delete() {
        label_status.setText("Delete");
        // TODO: Implement delete functionality
    }
}
