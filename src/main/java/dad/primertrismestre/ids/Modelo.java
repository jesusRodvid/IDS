package dad.primertrismestre.ids;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.apache.commons.codec.digest.DigestUtils;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Modelo {

	private StringProperty user = new SimpleStringProperty();
	private StringProperty psswd = new SimpleStringProperty();
	private String md5;
	private BufferedReader csvReader;
	ArrayList<String> md5List = new ArrayList<>();

	public final StringProperty userProperty() {
		return this.user;
	}

	public final String getUser() {
		return this.userProperty().get();
	}

	public final void setUser(final String user) {
		this.userProperty().set(user);
	}

	public final StringProperty psswdProperty() {
		return this.psswd;
	}

	public final String getPassword() {
		return this.psswdProperty().get();
	}

	public final void setPassword(final String psswd) {
		this.psswdProperty().set(psswd);
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5() {
		this.md5 = DigestUtils.md5Hex(psswdProperty().get()).toUpperCase();
	}

	public void loadCSV() {
		try {
			String line;
			File file = new File ("src/main/resources/users.csv");
			csvReader = new BufferedReader(new FileReader(file, Charset.forName("UTF-8")));

			while ((line = csvReader.readLine()) != null)
				md5List.add(line);

			csvReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	boolean checkMd5() throws IOException {
		Boolean resultado = false;
		for (int i = 0; i < md5List.size(); i++) {
			String[] usuariosycontraCSV = md5List.get(i).split(",");
			String usr = usuariosycontraCSV[0];
			String pwd = usuariosycontraCSV[1];

			if (usr.equals(userProperty().get()) && pwd.equals(getMd5())) {
				resultado = true;
				break;
			}
		}
		return resultado;
	}
	
}