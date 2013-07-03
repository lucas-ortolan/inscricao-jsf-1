/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.faces.mngbeans;

import inscricao.entity.Candidato;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utfpr.faces.support.PageBean;

/**
 *
 * @author a1151207
 */
@ManagedBean
@SessionScoped
public class ConsultarBean extends PageBean {
    
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String pesquisaAction() {
        InscricaoBean inscricao = (InscricaoBean) getBean("inscricaoBean");
        ListaCandidatosBean listaCandidatos = (ListaCandidatosBean) getBean("listaCandidatosBean");
        Candidato c = listaCandidatos.getCandidato(Long.parseLong(cpf));
        if (c == null) {
            return null;
        } else {
            inscricao.setCandidato(listaCandidatos.getCandidato(Long.parseLong(cpf)));
            inscricao.alterarUsuario();
            return "inscricao";
        }
    }
    
}
