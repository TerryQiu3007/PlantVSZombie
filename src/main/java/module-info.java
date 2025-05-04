module sio.pvz {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.pvz to javafx.fxml;
    exports sio.pvz;
}