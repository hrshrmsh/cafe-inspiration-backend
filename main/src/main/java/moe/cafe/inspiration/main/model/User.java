package moe.cafe.inspiration.main.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

	@Id
	@NotNull
	@Column(name = "user_id")
	private UUID userId;

	// TODO: Future me, make these not hard-coded
	@NotNull
	@Size(min = 6, max = 32)
	@Column(name = "user_name")
	private String username;

	@NotNull
	@Email
	@Column(name = "user_email")
	private String email;

	@NotNull
	@Column(name = "user_password")
	private String password;

	@NotNull
	@Column(name = "user_salt")
	private String salt;

	public User() {
		super();
	}

	public User(@NotNull UUID userId, @NotNull @Size(min = 6, max = 32) String username, @NotNull @Email String email,
			@NotNull @Size(min = 8, max = 32) String password, @NotNull String salt) {
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.password = password;
		this.salt = salt;
	}

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

}