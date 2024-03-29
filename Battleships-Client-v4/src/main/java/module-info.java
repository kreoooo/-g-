module pl.kato.tu.battleshipsclientv4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.kato.tu.battleshipsclientv4 to javafx.fxml;
    exports pl.kato.tu.battleshipsclientv4;
}
