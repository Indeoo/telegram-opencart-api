package ua.kpi.telegram.opencart.telegramopencart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.kpi.telegram.opencart.telegramopencart.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByLogin(String login);
}
