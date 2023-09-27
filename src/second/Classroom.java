package second;

public class Classroom {
    private String classroom;
    private int buildingNum;
    private int classroomNum;

    public Classroom(String classroom, int buildingNum, int classroomNum) throws ClassroomException {
        if (classroom == null || classroom.isBlank()) {
            throw new ClassroomException("Classroom cannot be null or empty");
        }

        this.classroom = classroom;
        this.buildingNum = buildingNum;
        this.classroomNum = classroomNum;
    }


    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) throws ClassroomException {
        if (classroom == null || classroom.isBlank()) {
            throw new ClassroomException("Classroom cannot be null or empty");
        }

        this.classroom = classroom;
    }

    public int getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(int buildingNum) {
        this.buildingNum = buildingNum;
    }

    public int getClassroomNum() {
        return classroomNum;
    }

    public void setClassroomNum(int classroomNum) {
        this.classroomNum = classroomNum;
    }
}