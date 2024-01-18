package dev.luismartinez.proyectointegrador.controller.mongodb;

import dev.luismartinez.proyectointegrador.repository.mongodb.User;
import dev.luismartinez.proyectointegrador.service.mongodb.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user-mongodb")
public class UserControllerMongoDB {

        private final UserService userService;
        public UserControllerMongoDB(@Autowired UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> add(@RequestBody User user) {
        User savedUser = userService.save(user);
        return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> findById(@PathVariable("id") String id) {
        return new ResponseEntity<Optional<User>>(userService.findById(id), HttpStatus.OK);
    }

}
