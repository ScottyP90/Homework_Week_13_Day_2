package com.codeclan.example.HomeworkUsersFoldersAndFiles.Projections;

import com.codeclan.example.HomeworkUsersFoldersAndFiles.Models.Folder;
import com.codeclan.example.HomeworkUsersFoldersAndFiles.Models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFolder", types = User.class)
public interface EmbedFolder {
    String getName();
    List<Folder> getFolder();
}
