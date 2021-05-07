
import business.abstracts.UserService;
import business.concretes.UserManager;
import core.abstracts.UserAuth;
import core.concretes.UserAuthAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;


public class Main {

    public static void main(String[] args) {
         User user1 = new User(1, "Dilaver", "Agabeyov", "dilaver052@gmail.com", "123456");
         UserService newUserService = new UserManager(new HibernateUserDao(),new UserAuthAdapter());
         newUserService.signIn(user1);
         
    }}


