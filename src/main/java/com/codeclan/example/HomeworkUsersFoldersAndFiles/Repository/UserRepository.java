package com.codeclan.example.HomeworkUsersFoldersAndFiles.Repository;

import com.codeclan.example.HomeworkUsersFoldersAndFiles.Models.User;
import com.codeclan.example.HomeworkUsersFoldersAndFiles.Projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
