package ua.com.vendigo.knurozklad.domain;

/**
 * Created by Dmytro Marchenko on 10.01.2015.
 * Represents one pair. Contains cabinet, subject, teacher.
 */
public class Pair {
    private final Integer id;
    private final Cabinet cabinet;
    private final Teacher teacher;
    private final PairType pairType;

    public Pair(Integer id, Cabinet cabinet, Teacher teacher, PairType pairType) {
        this.id = id;
        this.cabinet = cabinet;
        this.teacher = teacher;
        this.pairType = pairType;
    }

    public Integer getId() {
        return id;
    }

    public Cabinet getCabinet() {
        return cabinet;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public PairType getPairType() {
        return pairType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair pair = (Pair) o;

        if (cabinet != null ? !cabinet.equals(pair.cabinet) : pair.cabinet != null) return false;
        if (id != null ? !id.equals(pair.id) : pair.id != null) return false;
        if (pairType != pair.pairType) return false;
        if (teacher != null ? !teacher.equals(pair.teacher) : pair.teacher != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (cabinet != null ? cabinet.hashCode() : 0);
        result = 31 * result + (teacher != null ? teacher.hashCode() : 0);
        result = 31 * result + (pairType != null ? pairType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "id=" + id +
                ", cabinet=" + cabinet +
                ", teacher=" + teacher +
                ", pairType=" + pairType +
                '}';
    }
}
