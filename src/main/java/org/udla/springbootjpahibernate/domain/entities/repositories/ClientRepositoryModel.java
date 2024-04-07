package org.udla.springbootjpahibernate.domain.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.udla.springbootjpahibernate.domain.entities.models.ClientModel;

public interface ClientRepositoryModel extends JpaRepository<ClientModel, Long> {
}
