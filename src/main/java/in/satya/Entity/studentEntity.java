package in.satya.Entity;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
@Entity
public class studentEntity {

	@Id
	private Integer id;
	private String name;
	private String gender;
	@Lob
	@Column(length = 16777215)
	private byte[] photo;
	@Lob
	@Column(length = 16777215)
	private byte[] pdf;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public byte[] getPdf() {
		return pdf;
	}

	public void setPdf(byte[] pdf) {
		this.pdf = pdf;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", gender=" + gender + ", photo=" + Arrays.toString(photo)
				+ ", pdf=" + Arrays.toString(pdf) + "]";
	}

}
