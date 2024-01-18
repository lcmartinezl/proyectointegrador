package dev.luismartinez.proyectointegrador.service.mongodb;

import dev.luismartinez.proyectointegrador.repository.mongodb.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User save(User user);

    Optional<User> findById(String id);

    List<User> all();

    void deleteById(String id);

}
