module vallegrande.edu.pe.gestion_productos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens vallegrande.edu.pe.gestion_productos to javafx.fxml;
    exports vallegrande.edu.pe.gestion_productos;
    exports vallegrande.edu.pe.gestion_productos.controller;
    exports vallegrande.edu.pe.gestion_productos.model;
    exports vallegrande.edu.pe.gestion_productos.view;
}