package talex.auth.services;

import talex.auth.entities.SiteUser;

public interface SiteUserService {
    SiteUser findByEmail(String email);

    void saveUser(SiteUser user, String role);
}
