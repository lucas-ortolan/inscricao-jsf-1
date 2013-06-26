/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.entity;

import java.io.Serializable;

/**
 *
 * @author a1151207
 */
public class Login implements Serializable{
    
    private String login;
    private String senha;
    
    public Login() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }        
    
}
