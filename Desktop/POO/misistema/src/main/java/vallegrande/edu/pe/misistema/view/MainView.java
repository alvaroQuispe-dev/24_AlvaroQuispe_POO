package vallegrande.edu.pe.misistema.view;

import java.util.List;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import vallegrande.edu.pe.misistema.model.Cliente;

public class MainView extends BorderPane {

    private Button btnInicio;
    private Button btnClientes;
    private TableView<Cliente> tablaClientes;

    public MainView() {
        crearMenu();
        crearTabla();
        mostrarInicio();
    }

    private void crearMenu() {
        VBox menu = new VBox(15);
        menu.setPadding(new Insets(25));
        menu.setPrefWidth(220);

        Label titulo = new Label("MI SISTEMA");
        titulo.setStyle(
                "-fx-font-size: 20px; " +
                        "-fx-font-weight: bold; " +
                        "-fx-text-fill: white;"
        );

        btnInicio = crearBoton("Inicio");
        btnClientes = crearBoton("Clientes");

        menu.getChildren().addAll(
                titulo,
                btnInicio,
                btnClientes
        );

        menu.setStyle("-fx-background-color: #2563EB;");
        setLeft(menu);
    }

    private Button crearBoton(String texto) {
        Button boton = new Button(texto);
        boton.setPrefWidth(170);
        boton.setPrefHeight(40);
        return boton;
    }

    public void mostrarInicio() {
        VBox contenido = new VBox(10);
        contenido.setAlignment(Pos.CENTER);

        Label titulo = new Label("BIENVENIDO");
        titulo.setStyle(
                "-fx-font-size: 28px; " +
                        "-fx-font-weight: bold;"
        );

        Label texto = new Label("Sistema de gestión de clientes");

        contenido.getChildren().addAll(
                titulo,
                texto
        );

        setCenter(contenido);
    }

    public void mostrarClientes() {
        VBox contenido = new VBox(20);
        contenido.setPadding(new Insets(30));

        Label titulo = new Label("GESTIÓN DE CLIENTES");
        titulo.setStyle(
                "-fx-font-size: 26px; " +
                        "-fx-font-weight: bold;"
        );

        contenido.getChildren().addAll(
                titulo,
                tablaClientes
        );

        setCenter(contenido);
    }

    private void crearTabla() {
        tablaClientes = new TableView<>();

        TableColumn<Cliente, Integer> colId = new TableColumn<>("ID");
        TableColumn<Cliente, String> colNombre = new TableColumn<>("Nombre");
        TableColumn<Cliente, String> colApellido = new TableColumn<>("Apellido");
        TableColumn<Cliente, String> colTelefono = new TableColumn<>("Teléfono");
        TableColumn<Cliente, String> colCorreo = new TableColumn<>("Correo");
        TableColumn<Cliente, String> colDireccion = new TableColumn<>("Dirección");

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        colTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        colCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));
        colDireccion.setCellValueFactory(new PropertyValueFactory<>("direccion"));

        tablaClientes.getColumns().addAll(
                colId,
                colNombre,
                colApellido,
                colTelefono,
                colCorreo,
                colDireccion
        );
    }

    public void mostrarDatosClientes(List<Cliente> clientes) {
        tablaClientes.setItems(
                FXCollections.observableArrayList(clientes)
        );
    }

    public Button getBtnInicio() {
        return btnInicio;
    }

    public Button getBtnClientes() {
        return btnClientes;
    }
}