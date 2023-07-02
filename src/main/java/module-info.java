module com.example.canteenease_savorysolutions {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.canteenease_savorysolutions to javafx.fxml;
    exports com.example.canteenease_savorysolutions;
}