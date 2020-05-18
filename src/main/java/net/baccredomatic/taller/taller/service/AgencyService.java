package net.baccredomatic.taller.taller.service;

import java.util.List;

import net.baccredomatic.taller.taller.models.entity.Agency;

public interface AgencyService {
	public void save(Agency agency);
	public Agency findByAgencyName(String agencyName);
	public Agency obtenerPorNombreAgencia(String name);
	public List<Agency> findAll();
}
