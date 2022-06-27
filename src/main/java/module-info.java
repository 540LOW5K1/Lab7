module com.example.lab7 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;


    opens pl.lublin.wsei.java.cwiczenia.test.TestConnection.java to javafx.fxml;
    exports pl.lublin.wsei.java.cwiczenia.test.TestConnection.java;
    exports com.example;
    opens com.example to javafx.fxml;
}