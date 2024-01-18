package dev.luismartinez.proyectointegrador.service.mongodb;

import dev.luismartinez.proyectointegrador.repository.mongodb.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceMongoDB implements UserService{

    private final UserRepositoryMongo userRepositoryMongo;

    public UserServiceMongoDB(UserRepositoryMongo userRepositoryMongo) {
        this.userRepositoryMongo = userRepositoryMongo;
    }

    @Override
    public User save(User user) {
        return userRepositoryMongo.save(user);
    }

    @Override
    public Optional<User> findById(String id) {
        return userRepositoryMongo.findById(id);
    }

    @Override
    public List<User> all() {
        return userRepositoryMongo.findAll();
    }

    @Override
    public void deleteById(String id) {
        userRepositoryMongo.deleteById(id);
    }

}
