package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import test.MainFx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ItemPController implements Initializable {

    @FXML
    private HBox itemC1;
    @FXML
    private Label nom1;
    @FXML
    private Label name;
    @FXML
    private Label role1;
    @FXML
    private Label rolep;
    @FXML
    private HBox itemC11;
    @FXML
    private Label nom11;
    @FXML
    private Label emailp;
    @FXML
    private Label role11;
    @FXML
    private Label adresse;
    @FXML
    private HBox itemC111;
    @FXML
    private Label nom111;
    @FXML
    private Label naiss;
    @FXML
    private Label email1112;
    @FXML
    private Label tel;
    @FXML
    private HBox itemC11111;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    /*    name.setText(MainFx.connecteduser.getNom());
        emailp.setText(MainFx.connecteduser.getEmail());
        adresse.setText(MainFx.connecteduser.getAddresse());
        rolep.setText(MainFx.connecteduser.getRole());*/
      //  tel.setText(Integer.toString(MainFx.connecteduser.getTel()));
    }    

    @FXML
    private void modif(ActionEvent pevent) throws IOException {
            try {
                MainFx.m = 1;
            // Load the new FXML file
            Parent root = FXMLLoader.load(getClass().getResource("/testing.fxml"));
            // Get the current scene and set the new scene
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) pevent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }

    }

    @FXML
    private void img(ActionEvent event) {
        try {
            MainFx.m = 3;
            // Load the new FXML file
            Parent root = FXMLLoader.load(getClass().getResource("/testing.fxml"));
            // Get the current scene and set the new scene
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }

    }

    @FXML
    private void pwd(ActionEvent event) {
                    try {
                        MainFx.m = 2;
            // Load the new FXML file
            Parent root = FXMLLoader.load(getClass().getResource("/testing.fxml"));
            // Get the current scene and set the new scene
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
    }
    @FXML
    void admn(ActionEvent event) {

        try {
            MainFx.m = 4;
            // Load the new FXML file
            Parent root = FXMLLoader.load(getClass().getResource("/testing.fxml"));
            // Get the current scene and set the new scene
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }

    }


}
