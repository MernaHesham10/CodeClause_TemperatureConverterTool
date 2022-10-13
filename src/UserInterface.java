import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** Represents the User Interface of an application.
 * @author Daljeet Singh (Dev-Daljeet)
 * @version 1.0
 */
public class UserInterface extends Application
{
    private GUI_Frame frame = new GUI_Frame();

    /** Displays the GUI and overrides the start() method of class Application.
     * @param stage An instance of class stage which consists the scene to display GUI.
     */
    public void start(Stage stage)
    {
        stage.setTitle("Temperature Conversion Calculator");
        frame.setVisible(true);
    }

    /** Runs the program or starting point of execution.
     * (Note: The main method is only needed for the IDE with limited JavaFX support.
     *  Not needed for running from the command line.)
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
}