package vallegrande.edu.pe.misistema;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vallegrande.edu.pe.misistema.controller.MainController;
import vallegrande.edu.pe.misistema.view.MainView;

public class Launcher extends Application {

    @Override
    public void start(Stage primaryStage) {
        MainView view = new MainView();
        new MainController(view);

        Scene scene = new Scene(view, 800, 500);
        primaryStage.setTitle("Sistema POO");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}