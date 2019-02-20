package com.codeclan.example.HomeworkUsersFoldersAndFiles.Projections;

import com.codeclan.example.HomeworkUsersFoldersAndFiles.Models.File;
import com.codeclan.example.HomeworkUsersFoldersAndFiles.Models.Folder;
import com.codeclan.example.HomeworkUsersFoldersAndFiles.Models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFile", types = Folder.class)
public interface EmbedFile {
    String getTitle();
    List<File> getFiles();
    User getUser();
}
