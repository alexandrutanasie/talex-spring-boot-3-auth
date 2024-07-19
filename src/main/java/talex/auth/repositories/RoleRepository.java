package talex.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import talex.auth.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);    
}
