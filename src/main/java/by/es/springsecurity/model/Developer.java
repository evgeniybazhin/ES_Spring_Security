package by.es.springsecurity.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Developer {
    private long id;
    private String firstName;
    private String lastName;
}
