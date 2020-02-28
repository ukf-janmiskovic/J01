package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        HBox root = new HBox();
        Scene scene = new Scene(root,600,600);

        // Nastavenie komponentov
        root.setSpacing(7);
        root.setPadding(new Insets(20,0,0,20));
        TextField tf1 = new TextField();
        Button btn1 = new Button("Zafarbi");
        root.getChildren().addAll(btn1,tf1);

        // Stlačenie tlačidla
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String input = tf1.getText();
                tf1.setText("");

                // Vypísanie textu
                Text txt = new Text(input);
                txt.setFont(Font.font("Arial", FontWeight.BOLD,20));
                txt.setFill(Color.WHITE);
                try { root.getChildren().remove(2); } catch (Exception e) {}
                root.getChildren().add(txt);

                // Orátanie samohlások a spoluhlások
                int samohlasky=0, spoluhlasky=0;
                for (int i=0; i<input.length(); i++) {
                    String znak = input.substring(i,i+1);
                    if (znak.matches("[aeiouyäáéíóôúýAEIOUYÁÉÍÓÚÝ]")) samohlasky++;
                    if (znak.matches("[dtnlhkgďťňľcčžšjmbpvzsfrDTNLHKGĎŤŇĽCČŽŠJMBPVZSFR]")) spoluhlasky++;
                }

                // Vyrátanie a nastavenie farby pozadia
                int r = (samohlasky*16>255) ? 255:(samohlasky*16);
                int g = (spoluhlasky*24>255) ? 255:(spoluhlasky*24);
                int b = (((input.length()%25)*10)>255) ? 255:((input.length()%25)*10);
                root.setBackground(new Background(new BackgroundFill(Color.rgb(r,g,b),null,null)));
            }
        });

        primaryStage.setTitle("FX_SEMINAR_2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
