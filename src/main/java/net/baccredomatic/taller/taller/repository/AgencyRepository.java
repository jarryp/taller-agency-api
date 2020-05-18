package net.baccredomatic.taller.taller.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import net.baccredomatic.taller.taller.models.entity.Agency;

@Repository
public interface AgencyRepository extends PagingAndSortingRepository<Agency, Integer> {
	
	public Agency findBynameAgency(String nameAgency);
	
	@Query("FROM Agency a where a.nameAgency=?1")
	public Agency obtenerPorNombreAgencia(String nombreAgencia);

}
