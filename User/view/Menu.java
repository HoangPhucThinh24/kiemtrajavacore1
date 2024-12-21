package User.view;

import User.Service.LoginService;
import User.Service.RegisterService;
import User.entities.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void displayMenu(Scanner scanner, ArrayList<User> users) {
        do {
            System.out.println("hãy nhập lựa chọn");
            System.out.println("1- đăng nhập");
            System.out.println("2- đăng ký");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    LoginService loginService = new LoginService();
                    loginService.inputInfoLogin(scanner,users);
                    break;
                case 2:
                    RegisterService registerService = new RegisterService();
                    registerService.inputInfoRegester(scanner,users);
                    break;
                default:
                    System.out.println("lựa chọn không đúng");
                    break;
            }
        } while (true);
    }
}
