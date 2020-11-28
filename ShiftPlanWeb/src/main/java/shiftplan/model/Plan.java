package shiftplan.model;

import java.util.Objects;

public class Plan {

	private String BadgeID;
	private String Login;
	private String Name;
	private String Abteilung;
	private String Einteilung;
	private String Platz;
	private String Hinweis;

	public Plan() {
	}

	public Plan(String badgeID, String login, String name, String abteilung, String einteilung, String platz,
			String hinweis) {
		BadgeID = badgeID;
		Login = login;
		Name = name;
		Abteilung = abteilung;
		Einteilung = einteilung;
		Platz = platz;
		Hinweis = hinweis;
	}

	public String getBadgeID() {
		return BadgeID;
	}

	public void setBadgeID(String badgeID) {
		BadgeID = badgeID;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAbteilung() {
		return Abteilung;
	}

	public void setAbteilung(String abteilung) {
		Abteilung = abteilung;
	}

	public String getEinteilung() {
		return Einteilung;
	}

	public void setEinteilung(String einteilung) {
		Einteilung = einteilung;
	}

	public String getPlatz() {
		return Platz;
	}

	public void setPlatz(String platz) {
		Platz = platz;
	}

	public String getHinweis() {
		return Hinweis;
	}

	public void setHinweis(String hinweis) {
		Hinweis = hinweis;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Abteilung, BadgeID, Einteilung, Hinweis, Login, Name, Platz);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plan other = (Plan) obj;
		return Objects.equals(Abteilung, other.Abteilung) && Objects.equals(BadgeID, other.BadgeID)
				&& Objects.equals(Einteilung, other.Einteilung) && Objects.equals(Hinweis, other.Hinweis)
				&& Objects.equals(Login, other.Login) && Objects.equals(Name, other.Name)
				&& Objects.equals(Platz, other.Platz);
	}

}
