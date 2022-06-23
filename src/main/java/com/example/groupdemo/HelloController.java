package com.example.groupdemo;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController extends Node implements Initializable {

    //declaration of variables
    @FXML
    private ImageView adamm;
    @FXML
    private ImageView americaa;
    @FXML
    private ImageView angryy;
    @FXML
    private ImageView bigmamaa;
    @FXML
    private ImageView boness;
    @FXML
    private ImageView dontlookup;
    @FXML
    private ImageView encantoo;
    @FXML
    private ImageView endlesss;
    @FXML
    private ImageView englishh;
    @FXML
    private ImageView futuree;
    @FXML
    private ImageView heistt;
    @FXML
    private ImageView hustlee;
    @FXML
    private ImageView madeaa;
    @FXML
    private ImageView minions2;
    @FXML
    private ImageView moanaaa;
    @FXML
    private ImageView parkk;
    @FXML
    private ImageView playerr;
    @FXML
    private ImageView rayaa;
    @FXML
    private ImageView singg1;
    @FXML
    private ImageView singg2;
    @FXML
    private ImageView transformerss;
    @FXML
    private ImageView trollz;
    @FXML
    private ImageView venomm;
    @FXML
    private ImageView wallee;

    DropShadow shadow = new DropShadow();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //functions to play the video trailers after mouse click
        moanaaa.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(
                    "https://www.youtube.com/embed/LKFuXETZUsI\\"
            );
            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            System.out.print("Showing the scene");

            System.out.println("fdfsdsd");
        });

        rayaa.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(

                        "https://www.youtube.com/embed/1VIZ89FEjYI\\"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        singg1.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(

                    "https://www.youtube.com/embed/SH5N44b5Rrw\\"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        singg2.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(

                    "https://www.youtube.com/embed/EPZu5MA2uqI\\"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        adamm.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(

                    "https://www.youtube.com/embed/IE8HIsIrq4o\\"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        americaa.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(

                    "https://www.youtube.com/embed/sY8gUtyeAKE\\"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        angryy.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(

                    "https://www.youtube.com/embed/Hksyh33N5dg\\"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        bigmamaa.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(

                    "https://www.youtube.com/embed/345vOvSvGPw\\"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        boness.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(

                    "https://www.youtube.com/embed/1LEsILmgbLk\\"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        dontlookup.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(

                    "https://www.youtube.com/embed/RbIxYm3mKzI\\"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        encantoo.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(

                    "https://www.youtube.com/embed/CaimKeDcudo\\"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        endlesss.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(

                    "https://www.youtube.com/embed/reMwL8uYXps\\"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        englishh.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(

                    "https://www.youtube.com/embed/4bGPySXoB28\\"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        futuree.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(

                    "https://www.youtube.com/embed/qb7Fd0l_BRo"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        heistt.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(

                    "https://www.youtube.com/embed/PMmd7xD_oLg"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        madeaa.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(

                    "https://www.youtube.com/embed/d1Dojp2XkN8"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        hustlee.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(

                    "https://www.youtube.com/embed/_j5hwooOHVE\\"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        minions2.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(

                    "https://www.youtube.com/embed/6DxjJzmYsXo\\"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        parkk.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(

                    "https://www.youtube.com/embed/_jKEqDKpJLw\\"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        playerr.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(

                    "https://www.youtube.com/embed/cSp1dM2Vj48\\"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        transformerss.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(

                    "https://www.youtube.com/embed/S30VkLn5a2o\\"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        trollz.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(

                    "https://www.youtube.com/embed/GfkluXm6XGw\\"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        venomm.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(
                    "https://www.youtube.com/embed/u9Mv98Gr5pY\\"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });
        wallee.setOnMouseClicked(e -> {
            WebView webView = new WebView();
            webView.getEngine().load(

                    "https://www.youtube.com/embed/alIq_wG9FNk\\"
            );

            Scene scene = new Scene(webView, 700, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        });

        //functions to set hover effect on all 24 thumbnails
        moanaaa.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                moanaaa.setEffect(shadow);
            }
        });
        moanaaa.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                moanaaa.setEffect(null);
            }
        });

        rayaa.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                rayaa.setEffect(shadow);
            }
        });
        rayaa.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                rayaa.setEffect(null);
            }
        });
        singg1.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                singg1.setEffect(shadow);
            }
        });
        singg1.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                singg1.setEffect(null);
            }
        });
        singg2.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                singg2.setEffect(shadow);
            }
        });
        singg2.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                singg2.setEffect(null);
            }
        });
        adamm.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                adamm.setEffect(shadow);
            }
        });
        adamm.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                adamm.setEffect(null);
            }
        });
        americaa.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                americaa.setEffect(shadow);
            }
        });
        americaa.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                americaa.setEffect(null);
            }
        });
        angryy.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                angryy.setEffect(shadow);
            }
        });
        angryy.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                angryy.setEffect(null);
            }
        });
        bigmamaa.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                bigmamaa.setEffect(shadow);
            }
        });
        bigmamaa.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                bigmamaa.setEffect(null);
            }
        });
        boness.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                boness.setEffect(shadow);
            }
        });
        boness.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                boness.setEffect(null);
            }
        });
        dontlookup.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                dontlookup.setEffect(shadow);
            }
        });
        dontlookup.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                dontlookup.setEffect(null);
            }
        });
        encantoo.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                encantoo.setEffect(shadow);
            }
        });
        encantoo.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                encantoo.setEffect(null);
            }
        });
        endlesss.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                endlesss.setEffect(shadow);
            }
        });
        endlesss.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                endlesss.setEffect(null);
            }
        });
        englishh.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                englishh.setEffect(shadow);
            }
        });
        englishh.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                englishh.setEffect(null);
            }
        });
        futuree.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                futuree.setEffect(shadow);
            }
        });
        futuree.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                futuree.setEffect(null);
            }
        });
        heistt.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                heistt.setEffect(shadow);
            }
        });
        heistt.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                heistt.setEffect(null);
            }
        });
        madeaa.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                madeaa.setEffect(shadow);
            }
        });
        madeaa.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                madeaa.setEffect(null);
            }
        });
        hustlee.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                hustlee.setEffect(shadow);
            }
        });
        hustlee.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                hustlee.setEffect(null);
            }
        });
        parkk.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                parkk.setEffect(shadow);
            }
        });
        parkk.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                parkk.setEffect(null);
            }
        });
        minions2.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                minions2.setEffect(shadow);
            }
        });
        minions2.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                minions2.setEffect(null);
            }
        });
        playerr.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                playerr.setEffect(shadow);
            }
        });
        playerr.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                playerr.setEffect(null);
            }
        });
        transformerss.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                transformerss.setEffect(shadow);
            }
        });
        transformerss.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                transformerss.setEffect(null);
            }
        });
        trollz.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                trollz.setEffect(shadow);
            }
        });
        trollz.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                trollz.setEffect(null);
            }
        });
        venomm.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                venomm.setEffect(shadow);
            }
        });
        venomm.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                venomm.setEffect(null);
            }
        });
        wallee.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                wallee.setEffect(shadow);
            }
        });
        wallee.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                wallee.setEffect(null);
            }
        });
    }

    @FXML
    void loadVideo(MouseEvent event) {
        WebView webView = new WebView();
        webView.getEngine().load(
                "https://m.youtube.com/embed?v=LKFuXETZUsl?autoplay=true"
        );

    }
}
