package me.hyewonj.accounts;

/**
 * @author hyewonjo
 */
public class UserDuplicatedException extends RuntimeException {
    private String username;

    public UserDuplicatedException(String username) {
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }
}
