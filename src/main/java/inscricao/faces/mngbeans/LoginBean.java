/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.faces.mngbeans;

import inscricao.entity.Login;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import utfpr.faces.support.PageBean;

/**
 *
 * @author a1151207
 */
@ManagedBean
@RequestScoped
public class LoginBean extends PageBean {
    
    private Login login = new Login();

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }    
    
    public String confirmaAction() {
        if (login.getLogin().trim().equals("admin") && login.getSenha().trim().equals("admin")) {
            return "inscricao";
        }
        return null;
    }
    
}
