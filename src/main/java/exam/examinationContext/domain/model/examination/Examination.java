package exam.examinationContext.domain.model.examination;

import exam.examinationContext.domain.service.PaperDto;
import exam.paperContext.shared.ValueObject;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;

@EqualsAndHashCode(of = {"examinationId"})
public class Examination {
    private ExaminationId examinationId;
    private Paper paper;
    private String teacherId;
    private Long startTime;
    private Long dueTime;
    private Long createTime;

    public static Examination create(Paper paper, String teacherId, Long startTime, Long dueTime){
        Examination examination = new Examination();
        examination.paper = paper;
        examination.teacherId = teacherId;
        examination.startTime = startTime;
        examination.dueTime = dueTime;
        return examination;
    }

    @Getter
    @AllArgsConstructor
    public static class BlankQuiz implements ValueObject<BlankQuiz> {
        private String quizDescrition;
        private Object referenceAnswer;
        private int score;

        @Override
        public boolean sameValueAs(BlankQuiz other) {
            return false;
        }
    }


    @Getter
    @AllArgsConstructor
    public static class Paper implements ValueObject<Paper> {
        private List<BlankQuiz> blankQuizs;

        @Override
        public boolean sameValueAs(Paper other) {
            return false;
        }
    }
}
