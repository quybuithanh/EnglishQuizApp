package com.btq.enquizapp;

import com.btq.utils.MyAlert;
import com.btq.utils.Themes.ThemeTypes;
import static com.btq.utils.Themes.ThemeTypes.DARK;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;

public class PrimaryController implements Initializable{
    @FXML private ComboBox<ThemeTypes> cbThemes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(ThemeTypes.values()));
    }
    
    public void managerQuestions(ActionEvent e){
        MyAlert.getInstance().showAlert("Cau hoi 1");
    }
    
    public void practice(){
        MyAlert.getInstance().showAlert("Luyen tap 1");
    }
    
    public void exam(){
        MyAlert.getInstance().showAlert("De thi 1");
    }
    
    public void changeTheme(ActionEvent e){
        switch (this.cbThemes.getSelectionModel().getSelectedItem()) {
            case DARK:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("dark.css").toExternalForm());
                
                break;
            case LIGHT:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("light.css").toExternalForm());
                break;
            default:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("styles.css").toExternalForm());
        }
    }

    
}
