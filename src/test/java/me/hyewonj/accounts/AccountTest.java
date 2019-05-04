package me.hyewonj.accounts;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author hyewonjo
 */
public class AccountTest {

    @Test
    public void getterSetter(){
        Account account = new Account();
        account.setUsername("hyewonj");
        account.setPassword("password");
        assertThat(account.getUsername(), is("hyewonj"));
    }

}