package br.com.miracleworks.patchadmin.service;

import static com.github.adminfaces.template.util.Assert.has;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.apache.deltaspike.data.api.criteria.Criteria;

import com.github.adminfaces.persistence.model.Filter;
import com.github.adminfaces.persistence.service.CrudService;
import com.github.adminfaces.template.exception.BusinessException;

import br.com.miracleworks.patchadmin.model.Area;
import br.com.miracleworks.patchadmin.model.Area_;
import br.com.miracleworks.patchadmin.repository.AreaRepository;

@Stateless
public class MantemAreaService extends CrudService<Area, Long> implements Serializable {

	private static final long serialVersionUID = -4857889661565698935L;

	@Inject
	protected AreaRepository repository;

	protected Criteria<Area, Area> configRestrictions(Filter<Area> filtro) {

		Criteria<Area, Area> criteria = criteria();

		if (filtro.hasParam("id")) {
			criteria.eq(Area_.id, filtro.getLongParam("id"));
		}

		if (has(filtro.getEntity())) {
			Area filterEntity = filtro.getEntity();
			
			if (has(filterEntity.getNome()))
				criteria.likeIgnoreCase(Area_.nome, "%" + filterEntity.getNome());
		}
	
		return criteria;
	}

	public void beforeInsert(Area area) {
		validate(area);
	}

	public void beforeUpdate(Area area) {
		validate(area);
	}

	public void validate(Area area) {
		BusinessException be = new BusinessException();
		
		if (area.getNome() != null && !"".equals(area.getNome().trim()))
			be.addException(new BusinessException("Nome da área deve ser preenchida"));

		if (count(criteria().eqIgnoreCase(Area_.nome, area.getNome()).notEq(Area_.id, area.getId())) > 0)
			be.addException(new BusinessException("Nome da área deve ser úncico"));

		if (has(be.getExceptionList()))
			throw be;
	}

	public List<Area> listByModel(String nome) {
		return criteria()
				.likeIgnoreCase(Area_.nome, nome).getResultList();
	}

	public List<String> getNomes(String query) {
		return criteria()
				.select(String.class, attribute(Area_.nome)).likeIgnoreCase(Area_.nome, "%" + query + "%")
				.getResultList();
	}
}