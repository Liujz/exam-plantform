package exam.examinationContext.domain.service;

import exam.examinationContext.domain.model.examination.Examination;

public class ExaminationDto {
    private PaperDto paper;
    private String teacherId;
    private Long startTime;
    private Long dueTime;

    public static Examination toExamination(ExaminationDto examinationDto) {
        return Examination.create(PaperDto.toPaper(examinationDto.paper), examinationDto.teacherId, examinationDto.startTime, examinationDto.dueTime);
    }
}
