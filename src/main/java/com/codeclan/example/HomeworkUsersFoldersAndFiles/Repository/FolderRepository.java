package com.codeclan.example.HomeworkUsersFoldersAndFiles.Repository;

import com.codeclan.example.HomeworkUsersFoldersAndFiles.Models.Folder;
import com.codeclan.example.HomeworkUsersFoldersAndFiles.Projections.EmbedFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFile.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
