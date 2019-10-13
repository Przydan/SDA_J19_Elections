package pl.sda.elections.repositories;

import pl.sda.elections.model.Vote;

import java.util.Map;

public class MapToVoteAdapter extends Vote {
    private Map<String, Object> votesRaw;

    public MapToVoteAdapter (Map<String, Object> votesRaw) {
        this.votesRaw = votesRaw;
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public Long getId() {
        return (Long) votesRaw.get("id");
    }

    @Override
    public Long getCandidateId() {
        return super.getCandidateId();
    }

    @Override
    public Long getElectionsId() {
        return super.getElectionsId();
    }
}
