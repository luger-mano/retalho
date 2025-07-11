package com.retalho.ba.mappers;

import com.retalho.ba.DTO.users.UserRequestDTO;
import com.retalho.ba.DTO.users.UserResponseDTO;
import com.retalho.ba.models.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(source = "userType", target = "userType")
    User userRequestDTOtoUser(UserRequestDTO userRequestDTO);

    @Mapping(source = "userType", target = "userType")
    UserResponseDTO userToUserResponseDTO(User user);
}
