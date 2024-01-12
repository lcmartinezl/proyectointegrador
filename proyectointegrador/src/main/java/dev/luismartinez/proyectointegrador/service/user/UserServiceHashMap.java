package dev.luismartinez.proyectointegrador.service.user;

import dev.luismartinez.proyectointegrador.repository.user.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceHashMap implements UsersService {

    final HashMap<Long, User> users = new HashMap<>();

    @Override
    public User save(User user) {
        return users.put(user.getId(), user);
    }

    @Override
    public Optional<User> findById(Long id) {
        if(users.containsKey(id))
            return Optional.of(users.get(id));
        return Optional.empty();
    }

    @Override
    public List<User> all() {
        List<User> list = users.values().stream().toList();
        return list;
    }

    @Override
    public void deleteById(Long id) {
        users.remove(id);
    }

    @Override
    public User update(User user, Long userId) {
        return users.put(userId, user);
    }
}
