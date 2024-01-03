package com.spring.core.email;

import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
public class MySQLDataSource implements DataSource {
    @Override
    public String[] getEmails() {
        String[] emails={"sumitmysql1@gmail.com","xyz@yahoo.com"};
        return emails;
    }
}
