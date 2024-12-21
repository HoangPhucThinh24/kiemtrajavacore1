package User;

import User.entities.User;
import User.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        ArrayList<User> users = new ArrayList<>();

        menu.displayMenu(scanner,users);





    }
}

