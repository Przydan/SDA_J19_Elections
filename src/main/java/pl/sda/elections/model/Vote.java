package pl.sda.elections.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Vote {
    private Long id;
    private Long candidateId;
    private Long electionsId;

}