package com.iotsos.user.userroleprivilege.repository;

import com.iotsos.user.userroleprivilege.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by JoeDims on 7/14/2019.
 */
public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByName(String username);
}