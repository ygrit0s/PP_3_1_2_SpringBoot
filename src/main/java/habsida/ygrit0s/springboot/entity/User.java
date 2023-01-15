package habsida.ygrit0s.springboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String surname;

	private Byte age;
	
	public User() {
	}
	
	public User(String name, String surname, Byte age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public Byte getAge() {
		return age;
	}
	
	public void setAge(Byte age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return  """
                
                User  [ ID =        %s,
                        Name =      %s,
                        Surname = 	%s,
                        Age =       %s ]
                """
				.formatted(id, name, surname, age);
	}
}
