package com.codigo.apigestionmarket.dao;

import com.codigo.apigestionmarket.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuarios,Integer> {

}
