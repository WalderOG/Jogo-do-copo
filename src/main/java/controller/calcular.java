package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class calcular {

    // cadastrar usuario
    @FXML
    Button btnSalvar;
    @FXML
    private Button btnCancelar;
    @FXML
    TextField textNome,textLogin,textEmail,textSenha;

    public void salvar(ActionEvent event) throws SQLException {
        Connection connection;
        PreparedStatement stmt;
        connection = DriverManager.getConnection("jdbc:sqlite:bancodedados.db");
        String salvar = "insert into usuario(nome,login,senha,email) values (?,?,?,?)";
        stmt = connection.prepareStatement(salvar);
        stmt.setString(1,textNome.getText().toString());
        stmt.setString(2,textLogin.getText().toString());
        stmt.setString(4,textEmail.getText().toString());
        stmt.setString(3,textSenha.getText().toString());
        if (!stmt.execute()) {
            System.out.println("Registro Salvo com Sucesso");
        } else {
            System.out.println("Falha no cadastro");
        }
        connection.close();
    }
    public void cancelar() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Main.fxml"));
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);

    }
}
