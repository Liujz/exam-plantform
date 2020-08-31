package exam.examinationContext.domain.service;

import exam.examinationContext.domain.model.examination.Examination;

public class BlankQuizDto {
    private String quizDescrition;
    private Object referenceAnswer;
    private int score;

    public static Examination.BlankQuiz toBlankQuizDto(BlankQuizDto blankQuizDto) {
        return new Examination.BlankQuiz(blankQuizDto.quizDescrition, blankQuizDto.referenceAnswer, blankQuizDto.score);
    }
}
