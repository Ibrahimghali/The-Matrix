import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        Parent root;
        try {
            // Load the FXML file
            root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
            
            // Create a new scene with the loaded FXML root
            Scene scene = new Scene(root);
            
            // Set the application icon
            primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/icones/locator.png")));
            
            // Set the title of the stage
            primaryStage.setTitle("Matrix");
            
            // Set the scene on the stage
            primaryStage.setScene(scene);
            
            // Show the stage
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
}