package com.example.duynguyen.sample.model;

import com.example.duynguyen.sample.utils.Utils;

public class Student extends User {
    public Student(String firstName, String lastName, String phoneNum, String loginId, String pass) {
        super(Utils.STUDENT, firstName, lastName, phoneNum, loginId, pass);
    }
    public Student(User user){
        super(Utils.STUDENT,user.getFirstName(),user.getLastName(),user.getPhoneNum(),user.getLoginId(),user.getPass());
    }
}
