package com.microservices.vaccination.CitizenService.Repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.microservices.vaccination.CitizenService.Entities.Citizen;

public interface CitizenRepo extends JpaRepository<Citizen, Integer> {

	public List<Citizen> findByVaccinationCenterId(Integer id);
}
