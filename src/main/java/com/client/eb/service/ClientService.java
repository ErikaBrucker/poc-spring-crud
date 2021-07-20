package com.client.eb.service;

import com.client.eb.model.Client;
import com.client.eb.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    public Client salve(final Client client) {
        return clientRepository.save(client);
    }

    public Client getId(Long id) {
        return clientRepository.getById(id);
    }



}
