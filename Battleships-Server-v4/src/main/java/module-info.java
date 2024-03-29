module pl.kato.tu.battleshipsserverv4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires jcl.over.slf4j;


    opens pl.kato.tu.battleshipsserverv4 to javafx.fxml;
    exports pl.kato.tu.battleshipsserverv4;
}
