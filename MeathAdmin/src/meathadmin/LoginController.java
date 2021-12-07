package meathadmin;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class LoginController implements Initializable {

    LoginModel loginModel = new LoginModel();
    @FXML
    private JFXTextField emptxt;

    @FXML
    private JFXPasswordField passtxt;
    private int empid;

    public void exitScreen(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    public void TakeOrderScreen(ActionEvent event) throws Exception {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("TakeOrder.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Hide this current window (if this is what you want)
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (loginModel.isDbConnected()) {
            System.out.println("Db is connected");
        } else {
            System.out.println("Db is not connected");
        }
    }

    public void Login(ActionEvent event) {
        try {
            try {
                empid = Integer.parseInt(emptxt.getText());
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите правильные Идентификатор и Пароль");
            }
            String emppass = passtxt.getText();
            if (loginModel.isLogin(empid, emppass)) {
                if (loginModel.isAdmin(empid, emppass)) {
                    infoBox("Вы вошли как админ", null, "Success");
                    Node node = (Node) event.getSource();
                    Stage primaryStage = new Stage();
                    Stage dialogStage = (Stage) node.getScene().getWindow();
                    dialogStage.close();
                    Scene scene = new Scene(FXMLLoader.load(getClass().getResource("AdminPanel.fxml")));
                    primaryStage.setScene(scene);
                    dialogStage.setScene(scene);
                    dialogStage.show();
                } else {
                    infoBox("Вы вошли как работник", null, "Success");
                    Node node = (Node) event.getSource();
                    Stage primaryStage = new Stage();
                    Stage dialogStage = (Stage) node.getScene().getWindow();
                    dialogStage.close();
                    Scene scene = new Scene(FXMLLoader.load(getClass().getResource("TakeOrder.fxml")));
                    primaryStage.setScene(scene);
                    dialogStage.setScene(scene);
                    dialogStage.show();
                }
            } else {
                infoBox("Пожалуйста, введите правильные Идентификатор и Пароль", null, "Failed");
            }
        } catch (SQLException | IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            infoBox("Пожалуйста, введите правильные Идентификатор и Пароль", null, "Failed");
        }
    }

    public static void infoBox(String infoMessage, String headerText, String title) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();
    }
}
