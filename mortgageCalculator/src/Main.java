import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.text.NumberFormat;
import java.util.Scanner;
//* Excercise based on Programming With Mosh, Java tutorial /*

/*@TODO
    ELEVATING THE PROGRAM
    1.Simple mortgage calculations with input *(COMPLETED)
    2.GUI using JAVAFX *(IN PROGRESS)
     ̶̶ ̶3̶.̶A̶P̶I̶ ̶c̶o̶n̶n̶e̶c̶t̶i̶o̶n̶ ̶t̶o̶ ̶s̶e̶a̶r̶c̶h̶ ̶f̶o̶r̶ ̶h̶o̶u̶s̶e̶s̶

 */
/* NUMBERS NEEDED - PRINCIPAL, ANNUAL INTEREST, PERIOD, MORTGAGE
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

      try {
        Parent root = FXMLLoader.load(getClass().getResource("resources/sample.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setWidth(400);
        primaryStage.setHeight(500);

        ImageView logo = new ImageView("https://www.clipartmax.com/png/middle/4-45061_house-png-house-logo-clipart.png");
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mortgage Calculator");

        primaryStage.show();
    } catch (Exception e) {
      e.printStackTrace();
      }
    }

    public static void main(String[] args) {

        launch(args);
    }
}
