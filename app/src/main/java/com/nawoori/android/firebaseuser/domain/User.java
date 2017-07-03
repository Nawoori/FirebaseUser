package com.nawoori.android.firebaseuser.domain;

/**
 * Created by User on 2017-07-03.
 */

public class User {
    //멤버필드, 속성, 멤버변수, 전역변수
    String username;
    String email;

    //생성자
    public User() {

    }

    //파라미터가 있는 생성자 로드
    public User (String username, String email) {
        this.username = username;
        this.email = email;
    }

}
