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
        Scene scene = new Scene(root,1275,600);
        scene.setFill(Color.BLACK);

        Polyline pl1 = new Polyline(new double[] {152,330,100,400,244,400,100,200,244,200,196,270});
        pl1.setStroke(Color.WHITE);
        pl1.setStrokeWidth(3);
        Polyline pl1Stroke = new Polyline(new double[] {152,330,100,400,244,400,100,200,244,200,196,270});
        pl1Stroke.setStroke(Color.MEDIUMORCHID);
        pl1Stroke.setStrokeWidth(10);
        DropShadow sh1 = new DropShadow(70,Color.PURPLE);
        sh1.setSpread(0.7);
        pl1Stroke.setEffect(sh1);

        Polyline pl2 = new Polyline(new double[] {425,330,396,400,314,200,478,200,456,255,406,255});
        pl2.setStroke(Color.WHITE);
        pl2.setStrokeWidth(3);
        Polyline pl2Stroke = new Polyline(new double[] {425,330,396,400,314,200,478,200,456,255,406,255});
        pl2Stroke.setStroke(Color.YELLOW);
        pl2Stroke.setStrokeWidth(10);
        DropShadow sh2 = new DropShadow(70,Color.YELLOW);
        sh2.setSpread(0.7);
        pl2Stroke.setEffect(sh2);

        Polyline pl3 = new Polyline(new double[] {630,200,548,400,712,400,660,275});
        pl3.setStroke(Color.WHITE);
        pl3.setStrokeWidth(3);
        Polyline pl3Stroke = new Polyline(new double[] {630,200,548,400,712,400,660,275});
        pl3Stroke.setStroke(Color.RED);
        pl3Stroke.setStrokeWidth(10);
        DropShadow sh3 = new DropShadow(70,Color.RED);
        sh3.setSpread(0.7);
        pl3Stroke.setEffect(sh3);

        Polyline pl4 = new Polyline(new double[] {946,200,782,200,864,400,916,275});
        pl4.setStroke(Color.WHITE);
        pl4.setStrokeWidth(3);
        Polyline pl4Stroke = new Polyline(new double[] {946,200,782,200,864,400,916,275});
        pl4Stroke.setStroke(Color.LIME);
        pl4Stroke.setStrokeWidth(10);
        DropShadow sh4 = new DropShadow(70,Color.LIMEGREEN);
        sh4.setSpread(0.7);
        pl4Stroke.setEffect(sh4);

        Polyline pl5 = new Polyline(new double[] {1073,260,1098,200,1180,400,1016,400,1043,340,1088,340});
        pl5.setStroke(Color.WHITE);
        pl5.setStrokeWidth(3);
        Polyline pl5Stroke = new Polyline(new double[] {1073,260,1098,200,1180,400,1016,400,1043,340,1088,340});
        pl5Stroke.setStroke(Color.TURQUOISE);
        pl5Stroke.setStrokeWidth(10);
        DropShadow sh5 = new DropShadow(70,Color.TURQUOISE);
        sh5.setSpread(0.7);
        pl5Stroke.setEffect(sh5);

        root.getChildren().addAll(pl1Stroke,pl1,pl2Stroke,pl2,pl3Stroke,pl3,pl4Stroke,pl4,pl5Stroke,pl5);
        primaryStage.setTitle("FX_SEMINAR_1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
