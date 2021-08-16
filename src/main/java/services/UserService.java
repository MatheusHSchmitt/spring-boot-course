package services;

import DTO.UserDto;
import Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import workshop.domain.User;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        User user = repo.findOne(id);
        if (user == null) {
            throw new ObjectNotFoundException("objeto não encontrado");
        }
        return user;
    }
    public User insert(User obj){
        return repo.insert(obj);
    }

    public User fromDTO(UserDto objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
    public void delete(String id){
        findById(id);
        repo.delete(id);
    }
}