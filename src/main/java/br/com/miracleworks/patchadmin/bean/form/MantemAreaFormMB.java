package br.com.miracleworks.patchadmin.bean.form;

import java.io.IOException;
import java.io.Serializable;

import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;
import org.omnifaces.util.Faces;

import com.github.adminfaces.persistence.bean.BeanService;
import com.github.adminfaces.persistence.bean.CrudMB;

import br.com.miracleworks.patchadmin.bean.list.MantemAreaListMB;
import br.com.miracleworks.patchadmin.model.Area;
import br.com.miracleworks.patchadmin.service.MantemAreaService;

@Named
@ViewScoped
@BeanService(MantemAreaService.class)
public class MantemAreaFormMB extends CrudMB<Area> implements Serializable {

	private static final long serialVersionUID = 95981084002070165L;
	
	@Override
	public void afterRemove() {
		try {
			addDetailMsg("Área " + entity.getNome() + " removida com sucesso");
			Faces.redirect("mantem-area-list.xhtml");
			clear();
			sessionFilter.clear(MantemAreaListMB.class.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void afterInsert() {
		addDetailMsg("Área " + entity.getNome() + " criada com sucesso");
	}
	
	@Override
	public void afterUpdate() {
		addDetailMsg("Área " + entity.getNome() + " atualizada com sucesso");
	}
}