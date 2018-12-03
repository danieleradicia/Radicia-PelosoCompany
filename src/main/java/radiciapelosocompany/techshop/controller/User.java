package radiciapelosocompany.techshop.controller;

public class User {
	private String nome;
	private String cognome;
	private String username;
	private String password;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [nome=" + nome + ", cognome=" + cognome + ", username=" + username + ", password=" + password
				+ "]";
	}

}
