package com.example.canteenease_savorysolutions;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class OrderListsController {

    @FXML
    private AnchorPane rootAnchorPane;

    @FXML
    private Button dashboardButton;

    @FXML
    private Button orderListsButton;

    @FXML
    private Button logoutButton;

    @FXML
    private VBox mainVBox;

    @FXML
    private Label titleLabel;

    @FXML
    private HBox contentHBox;

    @FXML
    private TableView<Order> orderTableView;

    @FXML
    private TableColumn<Order, String> serialColumn;

    @FXML
    private TableColumn<Order, String> itemsColumn;

    @FXML
    private TableColumn<Order, String> canteenColumn;

    @FXML
    private TableColumn<Order, String> priceColumn;

    @FXML
    private TableColumn<Order, String> confirmRejectColumn;

    public void initialize() {
        // Initialization code goes here
    }

    // Add event handlers for buttons or any other UI elements if needed

    public static class Order {
        private String serial;
        private String items;
        private String canteen;
        private String price;
        private String confirmReject;

        public Order(String serial, String items, String canteen, String price, String confirmReject) {
            this.serial = serial;
            this.items = items;
            this.canteen = canteen;
            this.price = price;
            this.confirmReject = confirmReject;
        }

        // Add getters and setters for the order properties
    }
}
