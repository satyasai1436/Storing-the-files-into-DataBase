package in.satya.service;

import java.io.FileInputStream;
import java.io.InputStream;

import org.springframework.stereotype.Service;

import in.satya.Entity.studentEntity;
import in.satya.Repo.stuRepo;
@Service
public class studentService {
	private stuRepo repo;

	public studentService(stuRepo repo) {
		this.repo = repo;
	}

	public void setData() {
		try (InputStream is = new FileInputStream("Bhavish.JPG");
				InputStream is1 = new FileInputStream("Resume Satya (1)resume.pdf")) {
			studentEntity st = new studentEntity();
			st.setId(101);
			st.setName("Satya");
			st.setGender("Male");
			st.setPhoto(is.readAllBytes());

			st.setPdf(is1.readAllBytes());
			repo.save(st);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Record is inserted");
	}

}
