package webApp.dao;

import webApp.model.User;
import java.util.List;

public interface UserDAO {

    List<User> getAllUsers ();
    User getUserById(long id);
    void addUser(User user);
    void deleteUser(long id);
    void updateUser(User user);
}