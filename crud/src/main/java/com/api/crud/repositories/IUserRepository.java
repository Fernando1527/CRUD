package com.api.crud.repositories;

import com.api.crud.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository //un repositorio es una clase que permite hacer queryes a una base de datos
public interface IUserRepository extends JpaRepository<UserModel, Long> {
}
