package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {
        Boolean check = false;
        for (int i = 0; i < records.length; i++) {
            String [] splitRecord = records[i].split(":");
            if (email.equals(splitRecord[0])) {
                return Integer.parseInt(splitRecord[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
