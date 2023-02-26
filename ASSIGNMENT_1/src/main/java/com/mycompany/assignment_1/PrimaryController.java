package com.mycompany.assignment_1;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;

public class PrimaryController {

    @FXML
    private Label LABE1_ID;
    @FXML
    private Label LABE2_ID;
    @FXML
    private Label LABE3_ID;



    @FXML
    private void LESOTHO_BUTTON_HANDLER(ActionEvent event)throws IOException
    {
//        LABE1_ID.setBackground(Color.BLUE);
//    LABE1_ID.setBackground(Background.BLUE);
//    LABE1_ID.backgroundProperty();
//    LABE1_ID.setStyle;
        LABE1_ID.setStyle("-fx-background-color:BLUE");
        LABE2_ID.setStyle("-fx-background-color:WHITE");
        LABE3_ID.setStyle("-fx-background-color:GREEN");
    
    }

    @FXML
    private void RUSSIA_BUTTON_HANDLER(ActionEvent event)throws IOException
    {
            LABE1_ID.setStyle("-fx-background-color:WHITE");
            LABE2_ID.setStyle("-fx-background-color:BLUE");
            LABE3_ID.setStyle("-fx-background-color:RED");
    }

    @FXML
    private void GERMANY_BUTTON_HANDLER(ActionEvent event) throws IOException
    {
        LABE1_ID.setStyle("-fx-background-color:BLACK");
        LABE2_ID.setStyle("-fx-background-color:RED");
        LABE3_ID.setStyle("-fx-background-color:GOLD");
    }

    @FXML
    private void NETHERLANDS_BUTTON_HANDLER(ActionEvent event) throws IOException
    {
        LABE1_ID.setStyle("-fx-background-color:RED");
        LABE2_ID.setStyle("-fx-background-color:WHITE");
        LABE3_ID.setStyle("-fx-background-color:BLUE");
        

    }

    @FXML
    private void BRAZIL_BUTTON_HANDLER(ActionEvent event)throws IOException 
    {
        Alert alert=new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText("THE FLAG FOR BRAZIL IS NOT AVAILABLE CURRENTLY");
        alert.show();
//        String no=BRAZIL_BUTTON_HANDLER.get;

    }

    @FXML
    private void MEXICO_BUTTON_HANDLER(ActionEvent event)throws IOException
    {
        
        Alert alert=new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText("THE FLAG FOR MEXICO IS NOT AVAILABLE CURRENTLY");
        alert.show();
    }

    @FXML
    private void CLEAR_BUTTON_HANDLER(ActionEvent event)throws IOException
    {

    LABE1_ID.setStyle("-fx-background-color:EMPTY");
    LABE2_ID.setStyle("-fx-background-color:EMPTY");
    LABE3_ID.setStyle("-fx-background-color:EMPTY");
    }
}
   
    
