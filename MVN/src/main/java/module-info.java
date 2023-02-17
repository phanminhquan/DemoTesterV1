module com.mycompany.mvn {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.mvn to javafx.fxml;
    exports com.mycompany.mvn;
}
