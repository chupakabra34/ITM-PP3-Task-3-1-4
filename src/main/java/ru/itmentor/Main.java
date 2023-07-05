package ru.itmentor;

/**
 * \* Create by Prekrasnov Sergei
 * \
 */

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.work();
        System.out.println(userService.getKey());
    }
}