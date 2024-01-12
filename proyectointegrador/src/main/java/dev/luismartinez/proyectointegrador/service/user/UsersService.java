package dev.luismartinez.proyectointegrador.service.user;

import dev.luismartinez.proyectointegrador.repository.user.User;

import java.util.List;
import java.util.Optional;

public interface UsersService {

    User save(User user);

    Optional<User> findById(Long id);

    List<User> all();

    void deleteById(Long id);

    User update(User user, Long userId);
}
