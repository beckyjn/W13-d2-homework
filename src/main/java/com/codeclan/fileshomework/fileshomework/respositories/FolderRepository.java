package com.codeclan.fileshomework.fileshomework.respositories;

import com.codeclan.fileshomework.fileshomework.models.Folder;
import com.codeclan.fileshomework.fileshomework.projections.EmbedFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFile.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
