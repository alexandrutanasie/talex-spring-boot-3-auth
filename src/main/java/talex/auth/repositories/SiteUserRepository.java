package talex.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import talex.auth.entities.SiteUser;


public interface SiteUserRepository extends JpaRepository<SiteUser, Long> {
    SiteUser findByEmail(String email);
}
