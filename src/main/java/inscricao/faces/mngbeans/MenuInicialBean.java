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
public class MenuInicialBean extends PageBean {

    public String novaInscricaoAction() {
        return "inscricao";
    }
    
    public String consultarAction() {
        return "consultar";
    }
}
