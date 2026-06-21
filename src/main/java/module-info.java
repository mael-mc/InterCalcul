module ec.edu.espoch.intercalcul {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens ec.edu.espoch.intercalcul.controller.interfaces to javafx.fxml;
    exports ec.edu.espoch.intercalcul;
    exports ec.edu.espoch.intercalcul.controller.interfaces;
}
