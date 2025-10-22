package com.altatech.workshopjavafxjdbc;

import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private MenuItem manuItemSeller;

    @FXML
    private MenuItem manuItemDepartment;

    @FXML
    private MenuItem manuItemAbout;

    @FXML
    public void onManuItemSellerAction() {
        System.out.println("onManuItemSellerAction");
    }

    @FXML
    public void onManuItemDepartmentAction() {
        System.out.println("onManuItemDepartmentAction");
    }

    @FXML
    public void onManuItemAboutAction() {
        System.out.println("onManuItemAboutAction");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
