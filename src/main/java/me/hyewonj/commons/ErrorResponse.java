package me.hyewonj.commons;

import lombok.Data;

import java.util.List;

/**
 * @author hyewonjo
 */
@Data
public class ErrorResponse {
    private String code;
    private String message;
    private List<FieldError> errors;

    // TODO
    public static class FieldError{
        private String field;
        private String value;
        private String reason;
    }
}
