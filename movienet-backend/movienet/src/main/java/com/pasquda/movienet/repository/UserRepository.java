package com.pasquda.movienet.repository;

import com.pasquda.movienet.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
