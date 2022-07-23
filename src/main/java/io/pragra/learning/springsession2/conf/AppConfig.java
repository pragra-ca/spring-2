package io.pragra.learning.springsession2.conf;

import io.pragra.learning.springsession2.domain.ITeam;
import io.pragra.learning.springsession2.domain.Lakers;
import io.pragra.learning.springsession2.domain.TorontoRaptors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:teams.properties")
@PropertySource("classpath:person.properties")
public class AppConfig {

    @Value("${team.name}")
    private String teamName;
    @Value("${team.city}")
    private String teamCity;


    @Bean(initMethod = "init")
    public ITeam raptors() {
        return new TorontoRaptors(teamName, teamCity);
    }

    @Bean
    public ITeam lakers() {
        return new Lakers("Lakers","Los Angles");
    }

    private String getName(){
        return "Raptors";
    }
}
