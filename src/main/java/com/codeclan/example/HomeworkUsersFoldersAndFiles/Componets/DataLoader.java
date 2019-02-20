package com.codeclan.example.HomeworkUsersFoldersAndFiles.Componets;

import com.codeclan.example.HomeworkUsersFoldersAndFiles.Models.File;
import com.codeclan.example.HomeworkUsersFoldersAndFiles.Models.Folder;
import com.codeclan.example.HomeworkUsersFoldersAndFiles.Models.User;
import com.codeclan.example.HomeworkUsersFoldersAndFiles.Repository.FileRepository;
import com.codeclan.example.HomeworkUsersFoldersAndFiles.Repository.FolderRepository;
import com.codeclan.example.HomeworkUsersFoldersAndFiles.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception{

        User user1 = new User("Scotty");
        userRepository.save(user1);

        Folder folder1 = new Folder("coding", user1);
        folderRepository.save(folder1);

        File file1 = new File("Homework","java",35,folder1);
        fileRepository.save(file1);

    }
}
