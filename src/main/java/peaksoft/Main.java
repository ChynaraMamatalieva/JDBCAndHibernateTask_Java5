package peaksoft;

import peaksoft.dao.UserDaoHibernateImpl;
import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.model.User;
import peaksoft.service.UserService;
import peaksoft.service.UserServiceImpl;
import peaksoft.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws Exception {
        //Util util = new Util();
      //  System.out.println(util.getConnection());
        //UserService userService = new UserServiceImpl();
        //userService.createUsersTable();
//        userService.saveUser("Chynara", "Mamatalieva", (byte) 33);
//        userService.saveUser("Almaz", "Zhanybekov", (byte) 20);
//        userService.saveUser("Aichurok", "Turgunbaeva", (byte) 29);
//        userService.saveUser("Kunzaada", "Bekzhanova", (byte) 24);
//        userService.saveUser("Altynbek", "Jumabekov", (byte) 23);
//        userService.saveUser("Klara", "Azimova", (byte) 30);
//        userService.saveUser("Tologon", "Tekebaev", (byte) 25);
      //  System.out.println(userService.existsByFirstName("Chynara"));


        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();

        userDaoHibernate.createUsersTable();

        userDaoHibernate.saveUser("Michael", "Jackson", (byte) 23);
        userDaoHibernate.saveUser("Steven", "Jackson", (byte) 43);
        userDaoHibernate.saveUser("Joe", "Johnson", (byte) 24);
        userDaoHibernate.saveUser("Peter", "Jackson", (byte) 34);

        System.out.println(userDaoHibernate.existsByFirstName("Michael"));

        userDaoHibernate.removeUserById(2);

        userDaoHibernate.getAllUsers().forEach(System.out::println);

        userDaoHibernate.cleanUsersTable();

        userDaoHibernate.dropUsersTable();
        userDaoHibernate.close();

    }

}
