package com.project.User_Management.Service;
import java.util.List;

import com.project.User_Management.Model.User;
import com.project.User_Management.Repository.UserRepository;

public class UserService {
    private UserRepository repo;
     public List<User> getAllUsers(){
        return repo.findAll();
     }

     public User getUserById(Long id){
         return repo.findById(id)
                 .orElseThrow(() -> new RuntimeException("User not found"));
     }
    public User createUser(User user) {
        return repo.save(user);
    }
    public User updateUser(Long id , User userDetails){
         User user = repo.getUserById(id);
        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        return repo.save(user);

    }
    public void deleteUser(Long id ){
         repo.deleteById(id);
    }






}
