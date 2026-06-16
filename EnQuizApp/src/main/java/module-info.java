module com.btq.enquizapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.btq.enquizapp to javafx.fxml;
    exports com.btq.enquizapp;
}
