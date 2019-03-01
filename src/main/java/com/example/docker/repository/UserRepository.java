package com.example.docker.repository;

import com.example.docker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Jpaの場合はJpaRepositoryを継承しジェネリックに対象オブジェクトと主キーの型を指定する。
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
