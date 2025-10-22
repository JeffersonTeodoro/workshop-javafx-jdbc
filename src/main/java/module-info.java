module com.altatech.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.altatech.workshopjavafxjdbc to javafx.fxml;
    exports com.altatech.workshopjavafxjdbc;
}