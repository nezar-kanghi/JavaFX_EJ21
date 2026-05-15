package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejercicio_21 extends Application {

    @Override
    public void start(Stage stage) {

        Button btn = new Button("Abrir diálogo");

        btn.setOnAction(event -> {
            TextInputDialog dialogo = new TextInputDialog();
            dialogo.setTitle("Entrada de texto");
            dialogo.setHeaderText("Escribe algo");
            dialogo.setContentText("Texto:");

            dialogo.showAndWait().ifPresent(texto -> {
                System.out.println("Texto ingresado: " + texto);
            });
        });

        VBox layout = new VBox(10);
        layout.getChildren().add(btn);

        Scene scene = new Scene(layout, 250, 100);
        stage.setTitle("Ejercicio 21");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}