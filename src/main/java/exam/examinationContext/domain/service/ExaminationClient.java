package exam.examinationContext.domain.service;

import java.util.List;

public interface ExaminationClient {
    ExaminationDto getExaminationById(String examinationIds);

    ExaminationDto createExamination(PaperDto paper, String teacherId, Long startTime, Long dueTime);
}
