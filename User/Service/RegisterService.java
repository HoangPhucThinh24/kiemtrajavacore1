package User.Service;

import User.entities.Register;
import User.entities.User;

import java.util.ArrayList;
import java.util.Scanner;

public class RegisterService {
    public Register inputInfoRegester(Scanner scanner, ArrayList<User> users) {
        System.out.println("tạo tài khoản");
        String username = scanner.nextLine();
        System.out.println("nhập email");
        String email = scanner.nextLine();
        System.out.println("nhập mật khẩu");
        String password = scanner.nextLine();
        User user = new User(username, password, email);
        if (username.equals(user.getUsername())) {
            System.out.println("username đã tồn tại");
        }
        user.setUsername(username);
            if (email.equals(user.getEmail())) {
                System.out.println("email đã tồn tại");
            }
            user.setEmail(email);
            users.add(user);
            System.out.println("đăng kí thành công");
            return user;
        }
    }
