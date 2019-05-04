package me.hyewonj.accounts;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * @author hyewonjo
 */
public class AccountDto {

    @Data
    public static class Create{
        @NotBlank
        @Size(min = 5)
        private String username;

        @NotBlank
        @Size(min = 5)
        private String password;
    }

    @Data
    public static class Response{
        private Long id;
        private String username;
        private String fullName;
        private Date joined;
        private Date updated;
    }
}
