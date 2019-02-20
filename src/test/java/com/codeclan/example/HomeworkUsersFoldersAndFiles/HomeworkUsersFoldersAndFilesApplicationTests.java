package com.codeclan.example.HomeworkUsersFoldersAndFiles;

import com.codeclan.example.HomeworkUsersFoldersAndFiles.Models.File;
import com.codeclan.example.HomeworkUsersFoldersAndFiles.Models.Folder;
import com.codeclan.example.HomeworkUsersFoldersAndFiles.Models.User;
import com.codeclan.example.HomeworkUsersFoldersAndFiles.Repository.FileRepository;
import com.codeclan.example.HomeworkUsersFoldersAndFiles.Repository.FolderRepository;
import com.codeclan.example.HomeworkUsersFoldersAndFiles.Repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HomeworkUsersFoldersAndFilesApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;
	
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateAndAddToUserFolderAndFile() {

		User user1 = new User("Alan");
		userRepository.save(user1);

		Folder folder1 = new Folder("Uni", user1);
		folderRepository.save(folder1);

		File file1 = new File("Homework","txt",35,folder1);
		fileRepository.save(file1);

		Folder folder2 = new Folder("movies", user1);
		folderRepository.save(folder2);

		File file2 = new File("Pulp Fiction","vid",35,folder2);
		fileRepository.save(file2);

		fileRepository.delete(file2);
	}
}
