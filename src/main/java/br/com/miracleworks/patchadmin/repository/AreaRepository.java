package br.com.miracleworks.patchadmin.repository;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import br.com.miracleworks.patchadmin.model.Area;

@Repository
public interface AreaRepository extends EntityRepository<Area, Long> {

}
