module sio.pvz {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens sio.pvz to javafx.fxml;
    exports sio.pvz;
}