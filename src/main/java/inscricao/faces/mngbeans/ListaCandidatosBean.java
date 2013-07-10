/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.faces.mngbeans;

import inscricao.entity.Candidato;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class ListaCandidatosBean implements Serializable {

    private ArrayList<Candidato> listaCandidatos;

    public ListaCandidatosBean() {
        listaCandidatos = new ArrayList<Candidato>();
    }

    public void setListaCandidatos(ArrayList<Candidato> listaCandidatos) {
        this.listaCandidatos = listaCandidatos;
    }

    public ArrayList<Candidato> getListaCandidatos() {
        if (listaCandidatos != null) {
            return listaCandidatos;
        }
        listaCandidatos = new ArrayList<Candidato>();
        return listaCandidatos;
    }

    public void adicionarCandidato(Candidato candidato) {
        if (listaCandidatos != null) {
            listaCandidatos.add(candidato);
        }
    }

    public Candidato getCandidato(long cpf) {
        for (Candidato cand : listaCandidatos) {
            if (cand.getCpf() == cpf) {
                return cand;
            }
        }
        return null;
    }

    public void alterarCandidato(Candidato candidato) {
        if (listaCandidatos != null) {
            for (Candidato cand : listaCandidatos) {
                if (cand.getCpf() == candidato.getCpf()) {
                    listaCandidatos.remove(cand);
                    listaCandidatos.add(candidato);
                    return;
                }
            }
        }
    }

    public void removerCandidato(Candidato candidato) {
        if (listaCandidatos != null) {
            listaCandidatos.remove(candidato);
        }
    }
}
