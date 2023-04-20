package com.fedyushkin.security_ex.dto;

import com.fedyushkin.security_ex.entity.User;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
public class RegistrationForm {
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public User toUser(PasswordEncoder passwordEncoder){
        return new User(
                username, passwordEncoder.encode(password),
                firstName, lastName
        );
    }
}
