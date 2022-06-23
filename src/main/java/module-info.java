module com.example.groupdemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.web;


    opens com.example.groupdemo to javafx.fxml;
    exports com.example.groupdemo;
}