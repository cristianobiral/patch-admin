package br.com.miracleworks.patchadmin.bean.list;

import static br.com.miracleworks.patchadmin.util.Utils.addDetailMessage;
import static com.github.adminfaces.template.util.Assert.has;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

import com.github.adminfaces.persistence.bean.CrudMB;
import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.persistence.service.Service;
import com.github.adminfaces.template.exception.BusinessException;

import br.com.miracleworks.patchadmin.model.Area;
import br.com.miracleworks.patchadmin.service.MantemAreaService;

@Named
@ViewScoped
public class MantemAreaListMB extends CrudMB<Area> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	MantemAreaService mantemAreaService;
	
	@Inject
	@Service
	CrudService<Area, Long> crudService;

	@Inject
    public void initService() {
        setCrudService(mantemAreaService);
    }

    public List<String> completaNome(String query) {
        List<String> result = mantemAreaService.getNomes(query);
        return result;
    }

    public void buscaPorId(Long id) {
        if (id == null)
            throw new BusinessException("Informe um ID");

        Area entidadeEncontrada = crudService.findById(id);
        
        if (entidadeEncontrada == null)
            throw new BusinessException(String.format("Nenhuma área com ID: %s", id));

        selectionList.add(entidadeEncontrada);
        getFilter().addParam("id", id);
    }

    public void exclui() {
        int qtde = 0;
        
        for (Area entidadeSelecionada : selectionList) {
            qtde++;
            mantemAreaService.remove(entidadeSelecionada);
        }
        
        selectionList.clear();
        addDetailMessage(qtde + " áreas excluídas com sucesso!");
        clear();
    }

    public String getSearchCriteria() {
        StringBuilder sb = new StringBuilder(21);

        Area entidadeFiltrada = filter.getEntity();

        Long paramId = null;
        if (filter.hasParam("id"))
            paramId = filter.getLongParam("id");

        if (has(paramId))
            sb.append("<b>id</b>: " + paramId + ", ");

        String paramNome = null;
        if (filter.hasParam("nome"))
            paramNome = filter.getStringParam("name");
        else if (has(entidadeFiltrada) && entidadeFiltrada.getNome() != null)
            paramNome = entidadeFiltrada.getNome();

        if (has(paramNome))
            sb.append("<b>nome</b>: " + paramNome + ", ");

        int commaIndex = sb.lastIndexOf(",");

        if (commaIndex != -1)
            sb.deleteCharAt(commaIndex);

        if (sb.toString().trim().isEmpty())
            return "Nenhum critério de busca";

        return sb.toString();
    }
}
