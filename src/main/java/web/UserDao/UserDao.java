package web.UserDao;

import web.User.User;

import java.util.List;

public interface UserDao {
    public List<User> index();


    public void addUser(User user) ;


    public void updateUser(User updatedUser) ;


    public User getUserById(Long id) ;


    public void deleteUser(Long id);
}