package controller;

import java.util.ArrayList;

import login.Login;

public class ControleUsuario {
    private ArrayList<Login> login = new ArrayList<>();

    public void cadastrarUsuario(String nome, String senha, String email) {
        Login log = new Login(nome, senha, email);
        login.add(new Login(nome, senha, email));
    }

    public ArrayList<Login> listarUsuario() {
        return login;
    }

    public Login pesquisarLogin(String email) {
        for (Login l : login) {
            if (email.equals(l.getEmail())) {
                return l;
            }
        }
        return null;
    }

    public boolean loginUsuario(String email, String senha) {
        Login login = pesquisarLogin(email);
        if (login != null && login.getSenha().equals(senha)) {
            return true;
        } else {
            return false;
        }
    }
}