package Dio.com.example.Atividade_dio.service;

import org.h2.api.UserToRolesMapper;

public class UserServiceImplementacao implements UserService {

    public UserService userService;

    public UserToRolesMapper getUserById(long id){
        return userService.getUserById(id)
    }



}