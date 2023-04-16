package com.example.clientv10.validation;



import com.example.clientv10.annotations.PasswordMatches;
import com.example.clientv10.payload.SignupRequest;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches,Object> {
    @Override
    public void initialize(PasswordMatches constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        SignupRequest userSignupRequest = (SignupRequest) value;
        return userSignupRequest.getPassword().equals(userSignupRequest.getConfirmPassword());
    }
}
