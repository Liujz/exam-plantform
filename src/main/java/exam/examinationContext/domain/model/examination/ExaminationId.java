package exam.examinationContext.domain.model.examination;

import exam.paperContext.shared.ValueObject;

import java.util.Objects;

public class ExaminationId implements ValueObject<ExaminationId> {
    private String id;

    public static ExaminationId nextId() {
        //TODO Generate ID
        return null;
    }

    @Override
    public boolean sameValueAs(ExaminationId other) {
        return equals(other);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExaminationId examinationId = (ExaminationId) o;
        return Objects.equals(id, examinationId.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id;
    }
}
