package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root,720,406);
        scene.setFill(Color.BLACK);

        Polyline pl1 = new Polyline(new double[] {113,209,100,224,142,224,101,173,142,173,130,191});
        Polyline pl1s = new Polyline(new double[] {113,209,100,224,142,224,101,173,142,173,130,191});
        DropShadow sh1 = new DropShadow(80,Color.MEDIUMORCHID);
        pl1.setStroke(Color.WHITE); pl1.setStrokeWidth(4);
        pl1s.setStroke(Color.BLUEVIOLET); pl1s.setStrokeWidth(7); pl1s.setEffect(sh1);
        sh1.setSpread(0.7);

        Polyline pl2 = new Polyline(new double[] {252,208,243,224,217,173,270,173,262,189,245,189});
        Polyline pl2s = new Polyline(new double[] {252,208,243,224,217,173,270,173,262,189,245,189});
        DropShadow sh2 = new DropShadow(80,Color.YELLOW);
        pl2.setStroke(Color.WHITE); pl2.setStrokeWidth(2);
        pl2s.setStroke(Color.YELLOW); pl2s.setStrokeWidth(6); pl2s.setEffect(sh2);
        sh2.setSpread(0.7);

        Polyline pl3 = new Polyline(new double[] {366,173,338,224,391,224,374,194});
        Polyline pl3s = new Polyline(new double[] {366,173,338,224,391,224,374,194});
        DropShadow sh3 = new DropShadow(80,Color.RED);
        pl3.setStroke(Color.WHITE); pl3.setStrokeWidth(3);
        pl3s.setStroke(Color.RED); pl3s.setStrokeWidth(7); pl3s.setEffect(sh3);
        sh3.setSpread(0.7);

        Polyline pl4 = new Polyline(new double[] {505,191,486,224,458,173,513,173});
        Polyline pl4s = new Polyline(new double[] {505,191,486,224,458,173,513,173});
        DropShadow sh4 = new DropShadow(80,Color.LIMEGREEN);
        pl4.setStroke(Color.WHITE); pl4.setStrokeWidth(3);
        pl4s.setStroke(Color.LIME); pl4s.setStrokeWidth(7); pl4s.setEffect(sh4);
        sh4.setSpread(0.7);

        Polyline pl5 = new Polyline(new double[] {598,189,607,173,635,224,580,224,591,205,607,205});
        Polyline pl5s = new Polyline(new double[] {598,189,607,173,635,224,580,224,591,205,607,205});
        DropShadow sh5 = new DropShadow(80,Color.TURQUOISE);
        pl5.setStroke(Color.WHITE); pl5.setStrokeWidth(2);
        pl5s.setStroke(Color.TURQUOISE); pl5s.setStrokeWidth(6); pl5s.setEffect(sh5);
        sh5.setSpread(0.7);

        root.getChildren().addAll(pl1s,pl1,pl2s,pl2,pl3s,pl3,pl4s,pl4,pl5s,pl5);
        primaryStage.setTitle("FX_SEMINAR_1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
