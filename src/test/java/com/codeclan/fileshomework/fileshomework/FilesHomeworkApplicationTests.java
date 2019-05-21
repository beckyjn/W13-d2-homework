package com.codeclan.fileshomework.fileshomework;

import com.codeclan.fileshomework.fileshomework.models.File;
import com.codeclan.fileshomework.fileshomework.models.Folder;
import com.codeclan.fileshomework.fileshomework.models.User;
import com.codeclan.fileshomework.fileshomework.respositories.FileRepository;
import com.codeclan.fileshomework.fileshomework.respositories.FolderRepository;
import com.codeclan.fileshomework.fileshomework.respositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesHomeworkApplicationTests {

	@Autowired
	FileRepository fileRepository;
	@Autowired
	FolderRepository folderRepository;
	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canMakeFilesEtc() {

		User dave = new User("dave");

		userRepository.save(dave);

		User bob = new User("bob");
		userRepository.save(bob);

		Folder accounts = new Folder("accounts", dave);
		folderRepository.save(accounts);
		Folder reports = new Folder("reports", dave);
		folderRepository.save(reports);
		Folder correspondence = new Folder("correspondence", bob);
		folderRepository.save(correspondence);




		File expenses2018 = new File("2018expenses", "xls", 30, accounts);
		fileRepository.save(expenses2018);
		File expenses2019 = new File("2019expenses", "xls", 30, accounts);
		fileRepository.save(expenses2019);
		File annualReport = new File("annual report", "doc", 5, reports);
		fileRepository.save(annualReport);
		File email1 = new File("emails with dave", "xml", 100, correspondence);
		fileRepository.save(email1);
		File email2 = new File("emails from MegaCorp", "xml", 200, correspondence);
	}
}
