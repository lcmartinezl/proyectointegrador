package dev.luismartinez.proyectointegrador.service.mongodb;

import dev.luismartinez.proyectointegrador.repository.mongodb.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepositoryMongo extends MongoRepository<User, String> {
}
