
package sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoPaso;
import sv.edu.uesocc.ingenieria.prn335_2017.web.controladores.TipoPasoFacadeLocal;

@Named
@ViewScoped
public class TipoPasoBean {
    public TipoPasoBean() {
    }   
    
    @EJB
    TipoPasoFacadeLocal tipoPaso;
    List<TipoPaso> lista = new ArrayList<>();

    public TipoPasoFacadeLocal getUsuarios() {
        return tipoPaso;
    }

    public void setUsuarios(TipoPasoFacadeLocal tipoPaso) {
        this.tipoPaso = tipoPaso;
    }

    public List<TipoPaso> getLista() {
        return lista;
    }

    public void setLista(List<TipoPaso> lista) {
        this.lista = lista;
    }
    @PostConstruct
    public void llenar(){
        if(lista != null){
            this.lista=tipoPaso.findAll();
        }else {
            this.lista=Collections.EMPTY_LIST;
        }
    }    
}
