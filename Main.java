import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudyGroup studyGroup1 = new StudyGroup(1, "English");
        StudyGroup studyGroup2 = new StudyGroup(2, "Math");
        StudyGroup studyGroup3 = new StudyGroup(3, "English");
        StudyGroup studyGroup4 = new StudyGroup(4, "Physics");
        Stream stream1 = new Stream(Arrays.asList(studyGroup1, studyGroup2, studyGroup3, studyGroup4));
        Stream stream2 = new Stream(Arrays.asList(studyGroup1, studyGroup4));
        Stream stream3 = new Stream(Arrays.asList(studyGroup2, studyGroup3,  studyGroup4));
        List<Stream> streams = Arrays.asList(stream1, stream2, stream3);
        System.out.println("Unsorted stream:");
        printStream(streams);
        StreamService streamService = new StreamService();
        streamService.sortStreams(streams);
        System.out.println("Sorted stream:");
        printStream(streams);
    }
    static void printStream(List<Stream> streams) {
        for (Stream stream : streams) {
            System.out.println(stream);
        }
    }


}