package web.dao;


import web.model.User;

import java.util.List;

public interface UserDAO {

    List<User> findAll();

    User findById(int id);

    void save(User user);

    void deleteById(int id);

    void update(User updatedUser);

    List<User> getUserByFullName(String name, String surname);
}
