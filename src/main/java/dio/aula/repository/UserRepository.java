package dio.aula.repository;

import dio.aula.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
//Trabalhar com a classe User usando o ID que e do tipo Integer
public interface UserRepository extends JpaRepository<User, Integer> {
}
