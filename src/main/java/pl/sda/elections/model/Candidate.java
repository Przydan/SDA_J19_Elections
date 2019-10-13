package pl.sda.elections.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Candidate {
    private Long id;
    private String name;
    private String lastName;
}
