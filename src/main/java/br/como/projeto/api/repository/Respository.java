package br.como.projeto.api.repository;

import br.como.projeto.api.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface Respository extends CrudRepository<Client, Long> {
}
