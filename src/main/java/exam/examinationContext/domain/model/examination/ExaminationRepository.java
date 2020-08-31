package exam.examinationContext.domain.model.examination;

import java.util.List;

public interface ExaminationRepository {
    Examination find(ExaminationId paperId);

    void save(Examination paper);

    List<Examination> getAll();
}
