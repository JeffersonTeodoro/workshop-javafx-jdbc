module com.altatech.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;
    requires java.sql;
    requires java.desktop;
    requires mysql.connector.j;


    opens com.altatech.workshopjavafxjdbc to javafx.fxml;
    exports com.altatech.workshopjavafxjdbc;
    opens model.entities to javafx.base;
}

