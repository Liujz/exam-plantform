package exam.examinationContext.domain.service;

import exam.examinationContext.domain.model.examination.Examination;

import java.util.List;
import java.util.stream.Collectors;

public class PaperDto {
    List<BlankQuizDto> blankQuizDtos;

    public static Examination.Paper toPaper(PaperDto paperDto) {
        List<Examination.BlankQuiz> blankQuizs = paperDto.blankQuizDtos.stream()
                .map(BlankQuizDto::toBlankQuizDto)
                .collect(Collectors.toList());
        return new Examination.Paper(blankQuizs);
    }
}
