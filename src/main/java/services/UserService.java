package services;

import Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import workshop.domain.User;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;
    public List<User> findAll(){
        return repo.findAll();

    }
}
