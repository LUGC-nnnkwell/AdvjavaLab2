package com.example.demo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
public class controler implements Initializable {

    @FXML
    private Label Lable_physical_activity;

    @FXML
    private Label Lable_sport;

    @FXML
    private Label Lable_your_height;

    @FXML
    private Label Question;

    @FXML
    private TextField Space_3_physical_activity;

    @FXML
    private Button Submit;

    @FXML
    private TextField space_1_for_sports;

    @FXML
    private TextField space_2_for_Your_hight;

    @FXML
    private Label result;


    public void handleSubmit(ActionEvent actionEvent) {

        try {
            String sports = (space_1_for_sports.getText());
            double heightInput = Double.parseDouble(space_2_for_Your_hight.getText());
            String physical_activity = Space_3_physical_activity.getText();
            Sport newSport = new Sport(sports, heightInput, physical_activity);

            result.setText(newSport.toString());
            result.setVisible(true);

        } catch (NumberFormatException  error){
            result.setText("Invalid input for height. Please enter a number.");
            result.setVisible(true);

        } catch (IllegalArgumentException error){
            result.setText(error.getMessage());
            result.setVisible(true);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
