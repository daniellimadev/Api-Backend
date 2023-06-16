package br.como.projeto.api.controller;

import br.como.projeto.api.model.Client;
import br.como.projeto.api.repository.Respository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class Controller {

    @Autowired
    private Respository respository;

    @PostMapping("/")
    public Client register(@RequestBody Client c) {
        return respository.save(c);
    }

    @GetMapping("/")
    public Iterable<Client> select() {
        return respository.findAll();
    }

    @PutMapping("/")
    public Client toEdit(@RequestBody Client c) {
        return respository.save(c);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        respository.deleteById(id);
    }
}

