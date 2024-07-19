package talex.auth.entities;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
public class SiteUser {
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NotEmpty
    @Column(name="firstname", nullable = false)
    private String firstName;

    @NotEmpty
    @Column(name="lastname", nullable = false)
    private String lastName;

    @NotEmpty
    @Column(name = "email", unique = true)
    private String email;

    @NotEmpty
    @JsonIgnore
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles = new HashSet<>();
}
