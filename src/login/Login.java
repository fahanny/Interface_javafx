package login;

import java.io.Serializable;
import data.DataUsuario;

public class Login implements Serializable {
    private String email;
    private String senha;
    private String nome;

    public Login(String email, String senha, String nome) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void cadastrarLogin(Login l) {
        DataUsuario log = new DataUsuario();
        log.cadastrarLogin(l);
    }
}
