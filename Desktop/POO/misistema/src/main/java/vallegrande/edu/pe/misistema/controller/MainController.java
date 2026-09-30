package vallegrande.edu.pe.misistema.controller;

import vallegrande.edu.pe.misistema.model.ClienteDAO;
import vallegrande.edu.pe.misistema.view.MainView;

public class MainController {

    private MainView view;
    private ClienteDAO dao;

    public MainController(MainView view) {
        this.view = view;
        this.dao = new ClienteDAO();

        configurarEventos();
    }

    private void configurarEventos() {
        view.getBtnInicio().setOnAction(e -> {
            view.mostrarInicio();
        });

        view.getBtnClientes().setOnAction(e -> {
            view.mostrarClientes();
            cargarClientes();
        });
    }

    private void cargarClientes() {
        view.mostrarDatosClientes(dao.listar());
    }
}