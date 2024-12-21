package User.Service;

import User.entities.Login;
import User.entities.User;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginService {
    public Login inputInfoLogin(Scanner scanner, ArrayList<User> users) {
        UserService userService = new UserService();
        System.out.println("nhập tài khoản");
        String username = scanner.nextLine();
        User user = UserService.findByUsername(username,users);
        if (user == null) {
            System.out.println("username đã tồn tại");
        }
        System.out.println("nhập mật khẩu");
        String password = scanner.nextLine();
        if (!password.equals(user.getPassword())) {
            System.out.println("mật khẩu sai hãy thử lại");
            System.out.println("1- đăng nhập lại");
            System.out.println("2- quên mật khẩu");
            int choose = Integer.parseInt(scanner.nextLine());
            if (choose == 2) {
                userService.resetPassword(scanner,user);
            }
        }
        System.out.println("chào mừng "+user.getUsername() +",bạn có thể thực hiện các công việc sau:");
        do {
            System.out.println("1- Thay đổi username");
            System.out.println("2 - Thay đổi email");
            System.out.println("3 - Thay đổi mật khẩu");
            System.out.println("4 - Đăng xuất");
            System.out.println("0 - Thoát chương trình");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    userService.changeUsername(scanner,user,username,users);
                    break;
                case 2:
                    userService.changeEmail(scanner,user,users);
                    break;
                case 3:
                    userService.changePassword(scanner,user,password,users);
                    break;
                case 4:
                    System.out.println("Tạm biệt!");
                    System.exit(0);
                    break;
                case 0:
                    System.out.println("Tạm biệt");
                    break;
            }
        } while (true);
    }
}
