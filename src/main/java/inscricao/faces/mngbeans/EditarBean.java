package inscricao.faces.mngbeans;

import inscricao.entity.Candidato;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.ListDataModel;
import utfpr.faces.support.PageBean;

/**
 *
 * @author Wilson
 */
@ManagedBean
@SessionScoped
public class EditarBean extends PageBean {
        
   private ListDataModel<Candidato> listaCandidatosDataModel;
   private ListaCandidatosBean beanCandidatos;

    public EditarBean() {
       beanCandidatos = (ListaCandidatosBean) getBean("listaCandidatosBean");
       listaCandidatosDataModel = new ListDataModel<>(beanCandidatos.getListaCandidatos());
    }      
    
   public ListDataModel<Candidato> getCandidatoDataModel() {
       return listaCandidatosDataModel;
   } 
    
    public String excluirAction() {
        Candidato candidato = listaCandidatosDataModel.getRowData();
        beanCandidatos.removerCandidato(candidato);
        return null;
    }
    
    public String editarAction() {
        InscricaoBean inscricaoBean = (InscricaoBean) getBean("inscricaoBean");
        inscricaoBean.setCandidato(listaCandidatosDataModel.getRowData());
        return inscricaoBean.alterarUsuario();
    }
}
