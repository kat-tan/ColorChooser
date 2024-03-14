module org.example.colorchooserlab {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.colorchooserlab to javafx.fxml;
    exports org.example.colorchooserlab;
}