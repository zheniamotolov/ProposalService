package com.projet.proposal.repository;

import com.projet.proposal.model.Role;
import com.projet.proposal.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);

}
