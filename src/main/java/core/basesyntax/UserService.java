package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {
        String score = "";
        Boolean check = false;
        for (int i = 0; i < records.length; i++) {
            String [] splitRecord = records[i].split(":");
            score = splitRecord[1];
            if(email.equals(splitRecord[0])){
                check = true;
                return Integer.parseInt(score);
            }
        }
        if(check == false){
            throw new UserNotFoundException("User with given email doesn't exist");
        }
        return 0;
    }
}
