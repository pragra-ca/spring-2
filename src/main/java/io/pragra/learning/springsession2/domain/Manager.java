package io.pragra.learning.springsession2.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Manager {
    @Value("${desination:'CEO'}")
    private String desination;
    @Autowired
    private Person person;
}
