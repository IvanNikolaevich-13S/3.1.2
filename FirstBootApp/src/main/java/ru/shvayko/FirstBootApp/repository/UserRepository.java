package ru.shvayko.FirstBootApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shvayko.FirstBootApp.models.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
