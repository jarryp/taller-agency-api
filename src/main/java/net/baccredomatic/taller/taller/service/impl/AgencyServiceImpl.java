package net.baccredomatic.taller.taller.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.baccredomatic.taller.taller.models.entity.Agency;
import net.baccredomatic.taller.taller.repository.AgencyRepository;
import net.baccredomatic.taller.taller.service.AgencyService;

@Service
public class AgencyServiceImpl implements AgencyService {
	
	@Autowired AgencyRepository repository;

	@Override
	public void save(Agency agency) {
		repository.save(agency);
	}

	@Override
	public Agency findByAgencyName(String agencyName) {
		return repository.findBynameAgency(agencyName);
	}

	@Override
	public List<Agency> findAll() {
		return (List<Agency>) repository.findAll();
	}

	@Override
	public Agency obtenerPorNombreAgencia(String name) {
		return repository.obtenerPorNombreAgencia(name);
	}

}
