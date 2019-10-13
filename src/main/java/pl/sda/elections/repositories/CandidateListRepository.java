package pl.sda.elections.repositories;


import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.sda.elections.model.CandidateList;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public class CandidateListRepository {
    private List<CandidateList> candidateListList = new ArrayList<>();

    public CandidateListRepository() {

    }

}
