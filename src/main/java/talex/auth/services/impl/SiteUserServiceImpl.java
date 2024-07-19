package talex.auth.services.impl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import talex.auth.entities.SiteUser;
import talex.auth.entities.Role;
import talex.auth.repositories.SiteUserRepository;
import talex.auth.repositories.RoleRepository;
import talex.auth.services.SiteUserService;

@Service
public class SiteUserServiceImpl implements SiteUserService {

    @Autowired
    private SiteUserRepository siteUserRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private RoleRepository siteUserRoleRepository;

    @Override
    public SiteUser findByEmail(String email) {
       return siteUserRepository.findByEmail(email);
    }

    @Override
    public void saveUser(SiteUser user, String role) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        Role _role = siteUserRoleRepository.findByName(role);
        Set roles = new HashSet<>();
        roles.add(_role);
        
        user.setRoles(roles);
        siteUserRepository.save(user);
    }
    
}
