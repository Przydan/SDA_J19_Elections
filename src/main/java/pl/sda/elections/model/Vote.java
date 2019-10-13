package pl.sda.elections.model;

import java.time.LocalDate;

public class Vote {
    private Long id;
    private Long candidateId;
    private Long electionsId;

    public Vote(Long candidateId, Long electionsId) {
        this.candidateId = candidateId;
        this.electionsId = electionsId;
    }

    public Vote() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Long getCandidateId() {
        return candidateId;
    }

    public Long getElectionsId() {
        return electionsId;
    }
}
