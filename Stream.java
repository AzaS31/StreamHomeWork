import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> studyGroups;

    public Stream(List<StudyGroup> studyGroups) {
        this.studyGroups = studyGroups;
    }

    public List<StudyGroup> getStudyGroups() {
        return studyGroups;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return studyGroups.iterator();
    }

    @Override
    public String toString() {
        return "Stream{" +
                "studyGroups=" + studyGroups +
                '}';
    }

}