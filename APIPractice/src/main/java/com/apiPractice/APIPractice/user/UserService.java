package com.apiPractice.APIPractice.user;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class UserService {

    public List<User> getUsers(){
        return List.of(
                new User(
                        1L,
                        "radchef",
                        29,
                        LocalDate.of(1992, Month.SEPTEMBER, 26),
                        "radchef@gmail.com"
                ),
                new User(
                        2L,
                        "piggyboy",
                        19,
                        LocalDate.of(2002, Month.SEPTEMBER, 26),
                        "piggyboy@gmail.com"
                )
        );
    }
}
