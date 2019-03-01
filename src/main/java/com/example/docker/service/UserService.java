package com.example.docker.service;

import com.example.docker.entity.User;
import com.example.docker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    //リポジトリをAutowiredする
    @Autowired
    UserRepository userRepository;

    public List<User> selectAll(){
        return userRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
    }

}
