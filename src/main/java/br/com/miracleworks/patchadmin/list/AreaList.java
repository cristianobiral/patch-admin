package br.com.miracleworks.patchadmin.list;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.inject.Produces;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.persistence.service.Service;

import br.com.miracleworks.patchadmin.model.Area;
import br.com.miracleworks.patchadmin.model.Area_;

@ApplicationScoped
public class AreaList implements Serializable {

	private static final long serialVersionUID = -3397379256194553512L;

	@Inject
	@Service
	private CrudService<Area, Long> crudService;
	
	@Produces
	@Named("nomes")
	public List<String> nomes() {
		return crudService.criteria()
				.select(String.class, crudService.attribute(Area_.nome))
				.getResultList();
	}
}
