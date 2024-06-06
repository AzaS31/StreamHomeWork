public class StudyGroup {
    private int groupId;
    private String name;


    public StudyGroup(int groupId, String name) {
        this.name = name;
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public int getGroupId() {
        return groupId;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "groupId=" + groupId +
                ", name='" + name + '\'' +
                '}';
    }
}