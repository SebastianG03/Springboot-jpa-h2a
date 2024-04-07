package org.udla.springbootjpahibernate.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.udla.springbootjpahibernate.domain.entities.models.ClientModel;
import org.udla.springbootjpahibernate.domain.entities.repositories.ClientRepositoryModel;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepositoryModel clientRepository;

    public Optional<ClientModel> getClientById(Long id) {
        return clientRepository.findById(id);
    }

    public List<ClientModel> getAllClients() {
        return clientRepository.findAll();
    }
}
