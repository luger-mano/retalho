package com.retalho.ba.DTO.users;

import com.retalho.ba.models.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

@Data
public class UserRequestDTO {

    private UUID userId;
    private String name;
    private String middleName;
    private String email;
    private String password;
    private String cpf;
    private String phone;
    private LocalDate birth;
    private UserType userType;

    public UserRequestDTO(UUID userId,
                          String name,
                          String middleName,
                          String email,
                          String password,
                          String cpf,
                          String phone,
                          LocalDate birth,
                          UserType userType) {
        this.userId = userId;
        this.name = name;
        this.middleName = middleName;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.phone = phone;
        this.birth = birth;
        this.userType = userType;
    }
}
