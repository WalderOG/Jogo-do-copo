package controller;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.application.Application;
import java.util.Random;

public class MainController{
    @FXML
    private Button copo1 ;
    @FXML
    private Button copo2 ;
    @FXML
    private Button copo3 ;
    @FXML
    private Button outra ;

public static void main(String[] args) {
        Application.launch(args);
    }
    // gera um numero aleatório de 1 a 3
    Random rand = new Random();
    int bolinha= rand.nextInt(2);

    //copo 1
    public void copo1() throws IOException {
        //verifique se a bolinha é numero 1
        if (bolinha == 1){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ganhou.fxml"));
        Stage stage = (Stage) copo1.getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        }   else {
           FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/perdeu.fxml"));
           Stage stage = (Stage) copo1.getScene().getWindow();
           Scene scene = new Scene(loader.load());
           stage.setScene(scene);
        }
    }
    //copo 2
    public void copo2() throws IOException {
        //verifique se a bolinha é numero 2
        if (bolinha == 2){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ganhou.fxml"));
            Stage stage = (Stage) copo2.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }   else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/perdeu.fxml"));
            Stage stage = (Stage) copo2.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }
    }
    //copo 3
    public void copo3() throws IOException {
        //verifique se a bolinha é numero 3
        if (bolinha == 3){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ganhou.fxml"));
            Stage stage = (Stage) copo3.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }   else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/perdeu.fxml"));
            Stage stage = (Stage) copo3.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }
    }
    // volta para jogar novamente
    public void outra() throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/main.fxml"));
    Stage stage = (Stage) outra.getScene().getWindow();
    Scene scene = new Scene(loader.load());
    stage.setScene(scene);


}

}
