package com.example.canteenease_savorysolutions;

import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class AdminPanelController {
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Button dashboardButton;

    @FXML
    private Button orderListsButton;

    @FXML
    private Button logoutButton;

    @FXML
    private VBox vBox;

    @FXML
    private Label titleLabel;

    @FXML
    private HBox infoHBox;

    @FXML
    private Label totalUserLabel;

    @FXML
    private Label totalShopsLabel;

    @FXML
    private Label totalShopkeeperLabel;

    @FXML
    private StackedBarChart<String, Number> stackedBarChart;

    @FXML
    private CategoryAxis xAxis;

    @FXML
    private NumberAxis yAxis;

    @FXML
    private Label salesGraphLabel;

    @FXML
    public void initialize() {
        // Initialization code for the controller
    }

    // Add any additional methods or event handlers here

    // Getters and Setters for the FXML components
}
