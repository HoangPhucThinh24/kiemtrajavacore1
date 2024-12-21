package User.Service;

import User.entities.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    public void resetPassword(Scanner scanner, User user) {
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        if (!user.getEmail().equals(email)) {
            System.out.println("Email không tồn tại.");
            return;
        }

        System.out.print("Nhập mật khẩu mới: ");
        String newPassword = scanner.nextLine();
        user.setPassword(newPassword);
        System.out.println("Đổi mật khẩu thành công, vui lòng đăng nhập lại.");
    }

    public void changeUsername(Scanner scanner, User user, String username, ArrayList<User> users) {
        System.out.println("nhập username mới");
        String newUsername = scanner.nextLine();
        if (findByUsername(username,users) != null) {
            System.out.println("Username đã tồn tại.");
        }
        user.setUsername(newUsername);
        System.out.println("thay đổi username thành công");
    }

    public void changeEmail(Scanner scanner,User user,ArrayList<User> users) {
        System.out.println("nhập email");
        String email=scanner.nextLine();
        System.out.println("nhập email mới");
        String newEmail = scanner.nextLine();
        if (findByEmail(email,users) != null) {
            System.out.println("email đã tồn tại");
        }
        user.setEmail(newEmail);
        System.out.println("thay đổi email thành công");
    }

    public void changePassword(Scanner scanner,User user,String password,ArrayList<User> users) {
        System.out.println("nhập mật khẩu mới");
        String newPassword = scanner.nextLine();
        if (!password.equals(user.getPassword())) {
            user.setPassword(newPassword);
            System.out.println("thay đổi mật khẩu thành công");
        } else {
            System.out.println("mật khẩu trùng mật khẩu cũ");
        }
    }

    public static User findByUsername(String username, ArrayList<User> users) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public static User findByEmail(String email, ArrayList<User> users) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }
}
