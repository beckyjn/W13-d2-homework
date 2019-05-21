package com.codeclan.fileshomework.fileshomework.respositories;

import com.codeclan.fileshomework.fileshomework.models.User;
import com.codeclan.fileshomework.fileshomework.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
