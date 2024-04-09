package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;


@Component
@Transactional(readOnly = true)
public class UserServiceImplementation implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImplementation(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public List<User> findAll() {
        return userDAO.findAll();
    }

    public User findById(int id) {
        return userDAO.findById(id);
    }

    @Transactional
    public void save(User user) {
        userDAO.save(user);
    }

    @Transactional
    public void update(int id, User updatedUser) {
        updatedUser.setId(id);
        //userRepository.save(updatedUser);}
        userDAO.update(updatedUser);
    }

    @Transactional
    public void delete(int id) {
        userDAO.deleteById(id);
    }

    public List<User> getUserByFullName(String name, String surname) {
       return userDAO.getUserByFullName(name, surname);
    }
}
