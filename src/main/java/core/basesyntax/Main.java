package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        String [] users = {"testEmail@gmail.com:100",
                "user@yahoo.com:1",
                "second-user@gmail.com:20"};
        String email = "estEmail@gmail.com";
        System.out.println(userService.getUserScore(users, email));
    }
}
