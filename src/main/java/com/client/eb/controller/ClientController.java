package com.client.eb.controller;

import com.client.eb.model.Client;
import com.client.eb.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.SqlResultSetMapping;
import java.util.List;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> get(){
        return clientService.getAll();
    }

    @PostMapping
    public Client post(@RequestBody Client client){
        return clientService.salve(client);
    }

    @GetMapping(value = "/{id}")
    public Client recuperarPorId(@PathVariable(value = "id") Long id){
        return clientService.getId(id);

    }
}
