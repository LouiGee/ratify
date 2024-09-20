package com.example.Testing;

import com.example.Testing.Auth.TwoFactorAuthenticationService;
import com.example.Testing.Domain.User;
import com.example.Testing.Employee.Employee;
import com.example.Testing.Repository.RoleRepository;
import com.example.Testing.Domain.Role;
import com.example.Testing.Repository.UserRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@EnableJpaAuditing
@EnableAsync
@SpringBootApplication
@RequiredArgsConstructor
public class TestingApplication {





	public static void main(String[] args) {
		SpringApplication.run(TestingApplication.class, args);
	}


}




