package com.spring.core.email;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Primary
@Component
public class PostgreSQLDataSource implements DataSource {
    @Override
    public String[] getEmails() {
        String emails[]={"sumitpostgresql1@gmail.com","sumitpostgresql2@gmail.com"};
        return emails;
    }
    @Override
    public String toString(){
        return Arrays.toString(getEmails());
    }
}
