package UserAuthoraziton;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import entities.concretes.User;

public class UserAuthoraziton {
	
	public boolean logInCheck(String email, String password) {
		boolean nullOrEmptyCheck = email.trim().isEmpty() ||
				password.trim().isEmpty() ||
				Objects.isNull(email)||
				Objects.isNull(password);
		if (nullOrEmptyCheck) {
			System.out.println("E posta veya sifre girilmemistir");
			return false;
		}
		return true;
	}

	public boolean validation(User user) {
		Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(user.getEmail());
		boolean nullOrEmptyCheck = Objects.isNull(user) || 
				user.getFirstName().trim().isEmpty() || 
				user.getLastName().trim().isEmpty()||
				user.getEmail().trim().isEmpty()||
				user.getPassword().trim().isEmpty();
		
		if (nullOrEmptyCheck) {
			System.out.println("Alanlar bos gecilemez");
			return false;
		}
		if (!matcher.find()) {
			System.out.println("Girilen eposta yanlis");
			return false;
		}
		if (user.getPassword().length()<6) {
			System.out.println("Parola en az 6 karakter i�ermelidir.");
			return false;
		}
		if (user.getFirstName().length()<3 || user.getLastName().length()<3) {
			System.out.println("Ad veya soyad minimum 3 harftan olusmalidir");
			return false;
		}
		
		System.out.println("Dogrulama tamamlandi");
		return true;		
	}

	public boolean verificationEmail(User user) {
		System.out.println("E-posta adresinizi dogrulamak icin  lutfen buyuk harfler ile 'CONFIRM' yaziniz");
		String verificate = "CONFIRM";
		if (verificate=="CONFIRM") {
			System.out.println("E-posta onay islemi basarili");
			user.setValidated(true);
			return true;
		}
		return false;
	}
}
