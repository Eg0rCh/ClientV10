package com.example.clientv10.mapper;

import com.example.clientv10.dto.UserDTO;
import com.example.clientv10.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserDTO userToUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setUsername(user.getUsername());
        userDTO.setItn(user.getItn());
        return userDTO;
    }
}
